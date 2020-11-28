package com.sda.j2.examples.threadsPlayground;

public class RunnableExample {
    public static void main(String[] args) {
        new Thread(new HelloWorldRunnableThread()).start();
        new Thread(() -> System.out.println("Hello from another thread implemented with lambda")).start();
    }


    static class HelloWorldRunnableThread implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello World from another Thread");
        }
    }
}