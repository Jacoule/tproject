package org.IO.IO;

import java.io.FileInputStream;
import java.io.InputStream;

public class IODemo2 {
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
        byte[] buffer = new byte[3];
        int length = in.read(buffer);
        // 读取完毕返回 -1
        String s = new String(buffer,0,length);
        System.out.println(length+":"+s);

        // 每次读取多个字节 读取性能得到了提升，但是读取汉字输出还是会乱码
        while ((length = in.read(buffer))!=-1){
            String s1 = new String(buffer, 0, length);
            System.out.print(s1);
        }
        in.close();
    }
}
