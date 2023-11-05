package org.example.day3_System;

import java.awt.*;
import java.io.IOException;

public class runtime {
    public static void main(String[] args) throws IOException, InterruptedException {
        Runtime r = Runtime.getRuntime();



        //返回虚拟机能使用的处理机数量
        System.out.println(r.availableProcessors());
        // public long freeMemory   返回 Java 虚拟机中的内存总数（Bit）
        System.out.println(r.freeMemory()/1024);
        //启动某个程序，并返回代表该程序的对象
        Process p = r.exec("D:\\QQ\\Bin\\QQScLauncher.exe");
        Thread.sleep(5000);
        p.destroy();
    }
}
