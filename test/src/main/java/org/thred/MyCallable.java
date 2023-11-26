package org.thred;

import java.util.concurrent.Callable;

/**
 *  1、让这个类实现 Callable 接口
 */
public class MyCallable implements Callable<String> {
    // 2、重写 call 方法
    @Override
    public String call() throws Exception {
        // 描述线程的任务，返回线程执行返回后的结果。
        return "123";
    }
}
