package test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerExample {

    private static Producer producer;
    private static Consumer consumer;

    private static BlockingQueue<String> queue = null;

    public static void main(String[] args) {
        queue = new LinkedBlockingQueue<>(5);
        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));

        producer.start();
        consumer.start();
    }
}





