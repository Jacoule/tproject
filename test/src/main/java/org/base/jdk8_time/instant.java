package org.base.jdk8_time;

import java.time.Instant;

public class instant {
    /**
     * 传统 Date 类 只能精确到 毫秒 并且是可变对象
     * 新增的 Instant类 可以精确到纳秒 且是不可变对象 推荐使用 Instant 类代替 Date类
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        //获取 instant 对象 不可变对象
        Instant now = Instant.now();
        //获取从 1970 年到现在的秒
        long epochSecond = now.getEpochSecond();
        System.out.println(epochSecond);
        //获取纳秒
        int nano = now.getNano();
        System.out.println(nano);

        System.out.println(" Instant 对象  "+now);

        Instant instant = now.plusMillis(12131);

        //Instant 对象的作用 分析代码性能  或者记录用户的操作时间点
        Instant instant1 = Instant.now();
        Thread.sleep(5000);
        Instant instant2 = Instant.now();
        System.out.println("时间 "+(instant2.getEpochSecond()-instant1.getEpochSecond()));
    }
}
