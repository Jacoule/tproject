package org.base.jdk8_time;

import java.time.Duration;
import java.time.LocalDateTime;

public class duration {
    public static void main(String[] args) {

        // Duration 支持LocalDateTime 、 Instant 、LocalTime
        LocalDateTime of1 = LocalDateTime.of(2025, 12, 1, 00, 00, 00);
        LocalDateTime of2 = LocalDateTime.of(2025, 10, 1, 12, 00, 00);
        // 获取 2 个对象间隔的时间
        Duration between = Duration.between(of2, of1);
        System.out.println(between.toDays());
        System.out.println(between.toHours());
        System.out.println(between.toMinutes());
        System.out.println(between.toSeconds());
        System.out.println(between.toMillis());
        System.out.println(between.toNanos());
    }
}
