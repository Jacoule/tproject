package org.example.jdk8_time;

import java.time.LocalDate;

 public class localDate {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);//2023-11-05

        // 1、获取日期对象中的日期
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();//日
        int dayOfYear = localDate.getDayOfYear(); //一年中的第几天
        int dayOfWeek = localDate.getDayOfWeek().getValue();//星期几

        //2、直接修改某个信息  withYear
        LocalDate localDate1 = LocalDate.now();
        //LocalDate 都是不可变对象
        LocalDate localDate2 =  localDate1.withYear(2099);
        System.out.println(localDate2);

        //3、把当前日期加多少 plus
        LocalDate localDate3 =  localDate1.plusYears(1);
        LocalDate localDate4 =  localDate1.plusDays(1);
        LocalDate localDate5 =  localDate1.plusMonths(1);
        LocalDate localDate6 =  localDate1.plusWeeks(1);
        System.out.println(localDate3);

        // 4 把日期减少
        LocalDate localDate7 = localDate1.minusYears(1);

        //5、获取指定的日期
        LocalDate localDate8 = LocalDate.of(2025,1,26);
        System.out.println(localDate8);

        //6. 比较时间  equals isAfter isBefore

    }
}
