package org.thred.syncronized_code;

public class ThreadMain {
    /**
     * 同步代码块
     * @param args
     */
    public static void main(String[] args) {
        Account acc = new Account("ICBC",100);
        new DrawMoneyThread(acc,"小明").start();
        new DrawMoneyThread(acc,"小洪").start();
    }
}
