package org.thred.syncronized_method;

public class ThreadMain {
    /**
     * syncronized_method
     *
     * 同步方法：
     *      1、作用：把访问共享资源的核心方法上锁，保证线程安全、
     *      2、原理：每次只允许一个线程进入，执行完毕以后自动解锁，其他线程才可以进来执行。
     *      3、同步方法底层原理：同步方法也有隐式锁对象的,只是锁的范围是整个方法代码。
     *      4、可读性同步方法更好
     * @param args
     */
    public static void main(String[] args) {
        Account acc = new Account("ICBC",100);
        new DrawMoneyThread(acc,"小明").start();
        new DrawMoneyThread(acc,"小洪").start();
    }
}
