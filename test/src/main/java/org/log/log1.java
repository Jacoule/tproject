package org.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.StreamCorruptedException;

public class log1 {
    // 创建一个Logger日志对象
    public static final Logger LOGGER = LoggerFactory.getLogger("log1");//name 随意

    /*
    日志框架  ：JUL(jcl) 、Log4j（slf4j）、Logback（slf4j）、其他实现
    日志接口 ： JCL 、SLF4J
     */
    public static void main(String[] args) throws FileNotFoundException {
        // LogBack ：core classic access
        // 使用 Logback 日志框架，至少在项目中整合3个模块 ： slf4j-api：日志接口、logback-core、logback-classic
        /*
        System.setOut(new PrintStream(new File("test/src/main/java/org/log/log1.txt")));
        System.out.println("haha");
        */
        try {
            LOGGER.info("begin : =======  ");
            chu(10,0);
            LOGGER.info("success : =========  ");
        }catch (Exception e){
            LOGGER.error("出现bug ========== ");
        }
    }

    public static void chu(int a, int b){
        LOGGER.debug("参数a: "+ a);
        LOGGER.debug("参数b: "+ b);
        int c = a/b;
        System.out.println("The Result is : " + c);
        LOGGER.debug("结果c: "+ c);
    }
}
