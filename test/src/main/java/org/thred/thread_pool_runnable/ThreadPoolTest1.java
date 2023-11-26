package org.thred.thread_pool_runnable;

import java.util.concurrent.*;

public class ThreadPoolTest1 {
    /**
     * 临时线程什么时候创建？
     *      新任务提交时发现核心线程都在忙，任务队列也满了，并且还可以创建临时线程
     * 什么时候会开始拒绝新任务？
     *      核心线程和临时线程都在忙 ，任务队列也满了，新的任务过来的时候才会开会拒绝任务
     *
     */
    public static void main(String[] args) {
        /**
        public ThreadPoolExecutor(
                   int corePoolSize,    核心线程数
                   int maximumPoolSize, 最大线程数
                   long keepAliveTime,  指定临时线程的执行时间
                   TimeUnit unit,       时间单位
                   BlockingQueue<Runnable> workQueue,   指定线程池的任务队列
                   ThreadFactory threadFactory,         指定线程池的线程工厂
                   RejectedExecutionHandler handler）   拒绝策略（线程池满了 任务队列也满了）
           */
        ExecutorService pool = new ThreadPoolExecutor(3,5,5,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        Runnable target = new MyRunnable();
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        // 加入任务队列中
        pool.execute(target);//复用前面的线程
        pool.execute(target);//复用前面的线程

        // 主线程都在忙，任务队列满了，开始创建临时线程
        pool.execute(target);
        pool.execute(target);


    }
}
