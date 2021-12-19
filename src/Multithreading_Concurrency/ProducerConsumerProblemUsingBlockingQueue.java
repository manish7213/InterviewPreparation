package Multithreading_Concurrency;

import Multithreading_Concurrency.model.Item;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerProblemUsingBlockingQueue {

    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<Item> queue = new ArrayBlockingQueue<>(10);

        final Runnable producer = () -> {
            while (true) {
                try {
                    System.out.println("Producer");
                    queue.put(createItem());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(producer).start();
        new Thread(producer).start();

        final Runnable consumer = () -> {
            while (true) {
                try {
                    System.out.println("Consumer");
                    Item item = queue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(consumer).start();
        new Thread(consumer).start();

        Thread.sleep(1000);
    }

    private static Item createItem() {
        return new Item(101L, "Manish");
    }

}

