package org.IO.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class IODemo1 {
    /**
     * IO流 输入流、输出流
     * IO流
     *      -字节流：适合操作所有类型的文件 ：比如音频、视频、图片、文本文件的复制、转移等
     *      ········字节输入流：InputStream(abstract class)  -> FileInputStream (实现类)
     *      ........字节输出流：OutputStream -> FileOutputStream
     *      -字符流：只适合操作纯文本文件 ： txt、Java文件
     *      ········字符输入流：Reader -> FileReader
     *      ········字符输入流：Writer -> FileWriter
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {
        InputStream in = new FileInputStream("test\\src\\main\\java\\org\\IO\\IO\\a.txt");
        // 每次读取一个字节 没有数据返回-1
        int b1 = in.read();
        System.out.println((char)b1);

        int b;
        while((b=in.read())!= -1){
            System.out.print((char)b);
        }

        // 汉字会乱码
        // 流使用完毕要关闭 释放底层资源
        in.close();

    }
}
