package org.example.jdk8_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class datetimeformatter {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter =
                DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        //反向格式化
        String formatTime1 = now.format(dateTimeFormatter);
        //正向格式化
        String formatTime2 = dateTimeFormatter.format(now);
        System.out.println(formatTime2);

        //解析时间

        String time = "2023年11月05日 08:42:17";
        LocalDateTime parse = LocalDateTime.parse(time, dateTimeFormatter);
        System.out.println(parse.format(dateTimeFormatter));
    }
}
