package org.base.jdk8_time;

import java.time.LocalTime;

public class localTime {
    public static void main(String[] args) {
        //获取本地时间
        LocalTime now = LocalTime.now();
        //时分秒 纳秒
        System.out.println(now);



    }
}
