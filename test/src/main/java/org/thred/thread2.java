package org.thred;
/*
 * 实现Runnable 接口 重写 run 方法。
 *  1、优点：任务类只是实现接口，可以继续继承其他类，实现其他接口，扩展性强。
 *  2、 缺点：需要一个Runnable对象
 * */
public class thread2 {
    public static void main(String[] args) {

        /**
         * 方式一
         */
        // 1、定义一个线程任务类 MyRunable 接口,重写 run() 方法
        Runnable runnable = new MyRunnable();

        ///2、创建MyRunnable任务对象交给Thread处理
        // public Thread(Runnable target)
        Thread thread = new Thread(runnable);
        // 3、调用线程对象的 start 方法启动线程
        thread.start();


        /**
         * 方式二 匿名内部类
         */

        Runnable target = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("zi  "+ i);
                }
            }
        };
        new Thread(target).start();


        /**
         * 方式二 匿名内部类 简化
         */


        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("zi  "+ i);
                }
            }
        }).start();

        // 方式三
        new Thread(()-> {
            {
                for (int i = 0; i < 5; i++) {
                    System.out.println("%%%%%%%  "+ i);
                }
            }
        }).start();
    }
}

