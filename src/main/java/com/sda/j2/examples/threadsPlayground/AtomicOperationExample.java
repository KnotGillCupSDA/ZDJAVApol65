package com.sda.j2.examples.threadsPlayground;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicOperationExample {

    public static void main(String[] args) throws InterruptedException {
        final Pair pair = new Pair(new AtomicInteger(), new AtomicInteger());
        Thread thread1 = new Thread(new DummyPairIncrementer(pair));
        thread1.start();
        Thread thread2 = new Thread(new DummyPairIncrementer(pair));
        thread2.start();

        //we can do whatever
        pair.incrementLeft();

        thread1.join();
        thread2.join();
        System.out.println(pair.getLeft() + " " + pair.getRight());
    }

    static class Pair {
        private final AtomicInteger left;
        private final AtomicInteger right;

        public Pair(final AtomicInteger left, final AtomicInteger right) {
            this.left = left;
            this.right = right;
        }

        public void incrementLeft() {
            left.incrementAndGet();
        }

        public void incrementRight() {
            right.incrementAndGet();
        }

        public Integer getLeft() {
            return left.get();
        }

        public Integer getRight() {
            return right.get();
        }
    }

    static class DummyPairIncrementer implements Runnable {
        private final Pair pair;

        public DummyPairIncrementer(final Pair pair) {
            this.pair = pair;
        }

        @Override
        public void run() {
            for (int idx = 0; idx < 100; idx++) {
                pair.incrementLeft();
                pair.incrementRight();
            }
            //System.out.println(pair.getLeft() + " " + pair.getRight());
        }
    }
}
