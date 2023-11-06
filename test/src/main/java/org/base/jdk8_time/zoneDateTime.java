package org.base.jdk8_time;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class zoneDateTime {
    public static void main(String[] args) {
        //获取所有时区的名字
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds);


        ZoneId of = ZoneId.of("America/New_York");
        ZonedDateTime now = ZonedDateTime.now(of);

        // 世界标准时间
        ZonedDateTime of1 = ZonedDateTime.now(Clock.systemUTC());
        System.out.println("世界标准时间 ： "+of1);

        //获取系统默认时间
        ZonedDateTime now1 = ZonedDateTime.now();
        System.out.println(now1);
    }
}
