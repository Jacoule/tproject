package org.thred;

public class thread1 {
    /*  掌握线程的创建方式之一：继承 Thread 线程类
    *
    *  1、继承 Thread 类
    *  2、重写 Thread 类的子方法
    *  3、调用线程对象的start方法启动线程（启动后还是执行run 方法）
    *
    * 优缺点
    * 优点： 编码简单
    * 缺点： 线程类已经继承Thread,无法继承其他类，不利于功能的扩展
    * */
    public static void main(String[] args) {

        Thread myThread = new MyThread();
        myThread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程 : ****");
        }
    }
}
