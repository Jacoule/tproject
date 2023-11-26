package org.xmlprolog;

import java.io.*;
import java.util.Properties;

public class pro2 {
    public static void main(String[] args) throws Exception {

        File file = new File("test/src/main/java/org/xmlprolog/user9.txt");
        // file.renameTo(new File(file.getParent(),"user3.properties"));
        file.renameTo(new File("test/src/main/java/org/xmlprolog/user9.properties"));

        Properties properties = new Properties();
        // 字节输入流
         properties.load(new FileInputStream("test/src/main/java/org/xmlprolog/user9.properties"));
        // 字节输入流test/src/main/java/org/xmlprolog/user9.properties
        // properties.load(new FileReader("test/src/main/java/org/xmlprolog/user9.properties"));

        properties.forEach((k,v)->{
            System.out.println(k+"===>"+v);
        });

    }
}
