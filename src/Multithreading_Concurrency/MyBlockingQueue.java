package Multithreading_Concurrency;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue<Item> {

    private Queue<Item> queue;
    private int max = 16;
    private Lock lock = new ReentrantLock(true);

    private Condition notEmpty = lock.newCondition();
    private Condition notFull = lock.newCondition();

    public MyBlockingQueue(int size) {
        this.queue = new LinkedList<>();
        this.max = size;
    }

    public void put(Item item) throws InterruptedException {
        lock.lock();
        try {
            if (queue.size() == max) {
                notFull.await();
            }
            queue.add(item);
            notEmpty.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public Item take() throws InterruptedException {
        lock.lock();
        try {
            while (queue.size() == 0) {
                notEmpty.await();
            }
            Item item = queue.remove();
            notFull.signalAll();
            return item;
        } finally {
            lock.unlock();
        }
    }
}
