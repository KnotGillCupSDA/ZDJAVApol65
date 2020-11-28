package com.sda.j2.examples.threadsPlayground;

public class DeadlockExample {
    public static void main(String[] args) throws InterruptedException {
        final String r1 = "r1";
        final String r2 = "r2";

        Thread t1 = new Thread() {
            public void run() {
                synchronized (r1) {
                    System.out.println("Thread 1: Locked r1");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ignored) {
                    }
                    synchronized (r2) {
                        System.out.println("Thread 1: Locked r2");
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized (r2) {
                    System.out.println("Thread 2: Locked r1");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ignored) {
                    }
                    synchronized (r1) {
                        System.out.println("Thread 2: Locked r2");
                    }
                }
            }
        };

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Exiting? No I will never reach this line of code because threads will NOT join");
    }
}
