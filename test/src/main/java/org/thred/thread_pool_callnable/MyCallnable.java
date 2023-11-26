package org.thred.thread_pool_callnable;

import java.util.concurrent.Callable;

public class MyCallnable implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "String";
    }
}
