package org.base.day5_exception;

import org.base.day1_singleton.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;

public class E2 {
    /**
     * 异常的处理  throws try catch
     */
    public static void main(String[] args)  {

        try {
            test1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DateTimeParseException e) {
            e.printStackTrace();
        }
        System.out.println("===============");

    }

    public static void test1() throws FileNotFoundException , DateTimeParseException {
        DateTimeFormatter dateTimeFormatter =
                DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
       String time = "2023年11月05日 08:42";
       LocalDateTime localDateTime = LocalDateTime.parse(time,dateTimeFormatter);
       test2();
    }

    //编译时间异常
    public static void test2() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("D:/1.txt");
    }
}
