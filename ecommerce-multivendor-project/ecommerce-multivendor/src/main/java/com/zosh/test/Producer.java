package com.zosh.test;

import org.aspectj.bridge.IMessage;

import java.util.concurrent.BlockingQueue;

public class Producer implements  Runnable {

    private final BlockingQueue<String> queue;

    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String msg = "Message - ";
                System.out.println("Proucer producing: " + msg);
                queue.put(msg);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }
    }
}
