package org.thred;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 线程任务类只是实现接口，可以继续继承类和实现接口，扩展性强；可以在线程执行完毕后去获取结果
 * 缺点：编码复杂一点
 */
public class thread3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 3、创建一个Callable的对象
        Callable<String> call = new MyCallable();
        // 4、把Callable的对象封装成一个 FutureTask对象（任务对象）
        // 未来任务对象的作用
        //   1、是一个任务对象,实现了Runnable接口
        //   2、可以在线程执行完毕之后，用未来任务对象调用get方法获取线程执行完毕后的结果
        FutureTask<String> f1 = new FutureTask<>(call);
        // 5、把任务对象交给 Thread 对象
        new Thread(f1).start();

        // 6、获取线程执行完毕后返回的结果。
        // 注意，如果执行到这里，假如上面的线程还没有执行完毕
        // 这里代码会暂停，等待上面的线程执行完毕才会获取结果。
        String s = f1.get();
        System.out.println(s);

    }
}
