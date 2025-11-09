package test;

import java.util.concurrent.BlockingQueue;

public class Consumer implements  Runnable {

    private final BlockingQueue<String> queue;

    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String msg = queue.take();
                System.out.println("Consumer consumed : " + msg);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }
    }
}
