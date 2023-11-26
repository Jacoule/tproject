package org.xmlprolog;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class pro {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileReader("test/src/main/java/org/xmlprolog/user.properties"));
        System.out.println(properties);

        System.out.println(properties.getProperty("user"));

        Set<String> keys = properties.stringPropertyNames();
        for (String key : keys) {
            System.out.println(key +" =====>"+properties.getProperty(key));
        }

        properties.forEach((k,v)-> System.out.println(k+"=====>"+v));

        properties.setProperty("haha","io");

        //字节输出流 OutputStream
        // 字符输出流  Writer
        properties.store(new FileWriter("test/src/main/java/org/xmlprolog/user2.properties"),"something");
    }





}
