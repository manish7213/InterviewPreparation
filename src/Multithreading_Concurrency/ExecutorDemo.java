package Multithreading_Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecutorDemo {

    public static void main(String[] args) {

        /**
         * Creates a thread pool that reuses a fixed number of threads
         * operating off a shared unbounded queue, using the provided
         * ThreadFactory to create new threads when needed.  At any point,
         * at most {@code nThreads} threads will be active processing
         * tasks.  If additional tasks are submitted when all threads are
         * active, they will wait in the queue until a thread is
         * available.  If any thread terminates due to a failure during
         * execution prior to shutdown, a new one will take its place if
         * needed to execute subsequent tasks.  The threads in the pool will
         * exist until it is explicitly {@link ExecutorService#shutdown
         * shutdown}.
         *
         * @param nThreads the number of threads in the pool
         * @param threadFactory the factory to use when creating new threads
         * @return the newly created thread pool
         * @throws NullPointerException if threadFactory is null
         * @throws IllegalArgumentException if {@code nThreads <= 0}
         */
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        /**
         * Creates an Executor that uses a single worker thread operating
         * off an unbounded queue. (Note however that if this single
         * thread terminates due to a failure during execution prior to
         * shutdown, a new one will take its place if needed to execute
         * subsequent tasks.)  Tasks are guaranteed to execute
         * sequentially, and no more than one task will be active at any
         * given time. Unlike the otherwise equivalent
         * {@code newFixedThreadPool(1)} the returned executor is
         * guaranteed not to be reconfigurable to use additional threads.
         *
         * @return the newly created single-threaded Executor
         */
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();

        /**
         * Creates a thread pool that creates new threads as needed, but
         * will reuse previously constructed threads when they are
         * available.  These pools will typically improve the performance
         * of programs that execute many short-lived asynchronous tasks.
         * Calls to {@code execute} will reuse previously constructed
         * threads if available. If no existing thread is available, a new
         * thread will be created and added to the pool. Threads that have
         * not been used for sixty seconds are terminated and removed from
         * the cache. Thus, a pool that remains idle for long enough will
         * not consume any resources. Note that pools with similar
         * properties but different details (for example, timeout parameters)
         * may be created using {@link ThreadPoolExecutor} constructors.
         *
         * @return the newly created thread pool
         */

        ExecutorService executorService2 = Executors.newCachedThreadPool();

        /**
         * Creates a thread pool that can schedule commands to run after a
         * given delay, or to execute periodically.
         * @param corePoolSize the number of threads to keep in the pool,
         * even if they are idle
         * @return the newly created scheduled thread pool
         * @throws IllegalArgumentException if {@code corePoolSize < 0}
         */

        ExecutorService executorService3 = Executors.newScheduledThreadPool(1000);

        Thread t1 = new Thread(() -> System.out.println("This is first thread"));
        Thread t2 = new Thread(() -> System.out.println("This is second thread"));

        executorService.submit(t1);
        executorService.submit(t2);

    }
}

