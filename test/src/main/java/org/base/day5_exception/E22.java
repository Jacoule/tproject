package org.base.day5_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class E22 {
    /**
     * 1.捕获异常 记录异常并相应合适的信息给用户
     */
    public static void main(String[] args)  {
        try {
            test1();
        } catch (Exception e) {
            System.out.println("before");
            e.printStackTrace();
            System.out.println("end");
        }
    }

    public static void test1() throws Exception {
        DateTimeFormatter dateTimeFormatter =
                DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
       String time = "2023年11月05日 08:42";
       LocalDateTime localDateTime = LocalDateTime.parse(time,dateTimeFormatter);
       test2();
    }

    //编译时间异常
    public static void test2() throws Exception {
        InputStream inputStream = new FileInputStream("D:/1.txt");
    }
}
