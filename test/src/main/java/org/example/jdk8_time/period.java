package org.example.jdk8_time;

import java.time.LocalDate;
import java.time.Period;

public class period {
    public static void main(String[] args) {

        //计算2个日期 相差的 年 月 日
        Period between = Period.between(LocalDate.of(2020, 11, 1), LocalDate.now());
        System.out.println(between.getYears());
        System.out.println(between.getMonths());
        System.out.println(between.getDays());
    }
}
