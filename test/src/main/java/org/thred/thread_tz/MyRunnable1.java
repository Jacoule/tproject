package org.thred.thread_tz;

public class MyRunnable1 implements Runnable{
    private long number;
    // 悲观锁实现
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (this){
                System.out.println("===="+(++number));
            };
        }
    }
}
