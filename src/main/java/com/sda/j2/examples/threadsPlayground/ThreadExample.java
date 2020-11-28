package com.sda.j2.examples.threadsPlayground;

public class ThreadExample {

    public static void main(String[] args) throws InterruptedException {
        HelloWorldThread helloWorldThread = new HelloWorldThread();
        helloWorldThread.start();
        System.out.println(Thread.currentThread().getId());
    }

    static class HelloWorldThread extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Hello World from another Thread");
            System.out.println("inner: "+ Thread.currentThread().getId());
        }
    }
}
