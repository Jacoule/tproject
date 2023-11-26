package org.thred.thread_pool_excutors;

import java.util.concurrent.Executors;

public class ThreadExcutors {
    /**
     * 创建线程池
     * @param args
     */
    // Excutors 是一个线程池的工具类 ,提供了很多静态方法 用于返回不同特点的线程池对象
    public static void main(String[] args) {
        Executors.newWorkStealingPool();// 创建固定线程数目的线程池
        Executors.newSingleThreadExecutor();// 创建只有一个线程的线程池对象

    }
}
