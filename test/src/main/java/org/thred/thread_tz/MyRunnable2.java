package org.thred.thread_tz;

import java.util.concurrent.atomic.AtomicInteger;

public class MyRunnable2 implements Runnable{
    // 整数修改的乐观锁 : 原子类实现  CAS（Compare and set） 算法
    private AtomicInteger number = new AtomicInteger();

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("===="+(number.addAndGet(1)));
        }
    }
}
