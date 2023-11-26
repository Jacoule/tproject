package org.thred;
/* 1、子类继承 Thread 线程类 */
public class MyThread  extends Thread{
    // 2、重写 Thread 的 run 方法
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程输出: "+i);
        }
    }
}
