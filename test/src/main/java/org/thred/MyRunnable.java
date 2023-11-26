package org.thred;

/*
* 1、实现 Runnable 接口 重写 run方法
*
* */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 0; i < 5; i++) {
            System.out.println(t.getName()+" %%% "+ i);
        }
    }
}
