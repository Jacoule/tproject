package org.IO.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class IODemo3 {
    public static void main(String[] args) throws Exception {
        // 1、读取文件大小 ，创建字节数组
        InputStream in = new FileInputStream("test\\src\\main\\java\\org\\IO\\IO\\a.txt");
        File f = new File("test\\src\\main\\java\\org\\IO\\IO\\a.txt");
        long size = f.length();
        byte[] buffer = new byte[(int) size];

        int length = in.read(buffer);
        System.out.println(new String(buffer));

        System.out.println(size +":"+length);

        // 2、
        byte[] bytes = in.readAllBytes();
        System.out.println(new String(bytes));
    }
}
