package com.sda.j2.examples.threadsPlayground;

public class ExecutorServiceExample {
    /*public static void main(String[] args) throws ExecutionException, InterruptedException {

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool();
        scheduledExecutorService.scheduleAtFixedRate(() -> {}, 10, 60, TimeUnit.SECONDS)


        ExecutorService executorService;

        Callable<Integer> integerCallable = () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 7;
        };

        Future<Integer> submit = executorService.submit(integerCallable);


        executorService.shutdown();
        if(!executorService.awaitTermination(10, TimeUnit.SECONDS)) {
            executorService.shutdownNow();
        }

    }*/
}
