package org.thred;

public class thread4 {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new MyRunnable()).start();

        // static Thread.currentThread() 那个线程执行它，就会得到哪个线程的对象
        // getName 获取线程对象的名字
        System.out.println(Thread.currentThread().getName());

        // static void sleep（long time） 当前线程暂停 5s
        Thread.sleep(5000);

        // final void join() 哪个线程调用，那个线程会先执行



    }
}
