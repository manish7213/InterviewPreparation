package Multithreading_Concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
    /**
     * @link http://tutorials.jenkov.com/java-util-concurrent/lock.html
     * @param args
     */
    public static void main(String[] args) {

        Lock lock = new ReentrantLock(true);

        try {
            lock.lock();
            //perform some operation
        } finally {
            lock.unlock();
        }

    }
}
