package test;

import java.util.concurrent.BlockingQueue;

public class Producer implements  Runnable {

    private final BlockingQueue<String> queue;

    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int i = 0;
        try {
            while (true) {
                String msg = "Message - " + i;
                System.out.println("Proucer producing: " + msg);
                queue.put(msg);
                Thread.sleep(1000);
                i++;
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }
    }
}
