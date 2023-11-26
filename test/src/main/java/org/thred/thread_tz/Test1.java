package org.thred.thread_tz;

public class Test1 {
    public static void main(String[] args) {
        // 乐观锁 ：认为不会出现线程安全问题，所有线程一起跑，出现问题再去加锁，线程安全，性能较好
        // 悲观锁 ：认为会出现线程安全问题，一开始就加锁，线程安全，性能比较差

        // 需求：100 个线程 每次加 100
        Runnable target = new MyRunnable2();
        for (int i = 0; i < 100; i++) {
            new Thread(target).start();
        }

    }
}
