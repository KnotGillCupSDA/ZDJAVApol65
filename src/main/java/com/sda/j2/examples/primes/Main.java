package com.sda.j2.examples.primes;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {

        Instant startTime = Instant.now();
        /*System.out.println(getPrimesCountSingleThreaded());
        System.out.println(Duration.between(startTime, Instant.now()));*/

        startTime = Instant.now();
        System.out.println(getPrimesCountMultiThreaded());
        System.out.println(Duration.between(startTime, Instant.now()));
    }

    private static int getPrimesCountSingleThreaded() throws IOException {
        Path path = Paths.get("src", "main", "resources", "primes", "numbers.txt");
        try(Scanner scanner = new Scanner(path)) {
            int cnt = 0;
            while (scanner.hasNext()) {
                if(isPrimeFaster(scanner.nextInt())) {
                    cnt++;
                }
            }
            return cnt;
        }
    }

    private static int getPrimesCountMultiThreaded() throws IOException, TimeoutException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(8);

        Path path = Paths.get("src", "main", "resources", "primes", "numbers.txt");
        try(Scanner scanner = new Scanner(path)) {
            AtomicInteger cnt = new AtomicInteger();
            while (scanner.hasNext()) {
                int number = scanner.nextInt();
                executorService.submit(() -> {
                    if (isPrime(number)) {
                        cnt.incrementAndGet();
                    }
                });
            }

            executorService.shutdown();
            if(executorService.awaitTermination(1, TimeUnit.MINUTES)) {
                return cnt.get();
            } else {
                executorService.shutdownNow();
                throw new TimeoutException("could not calculate in given time");
            }
        }
    }


    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (long i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrimeFaster(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (long i = 3; i < Math.sqrt(number) + 1; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
