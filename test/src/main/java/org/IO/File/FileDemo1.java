package org.IO.File;


import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
/**
 * File 可以代表文件、也可以代表文件夹
 * File 封装的对象仅仅是一个路径名，这个路径可以是存在的，也允许是不存在的。
 */

        File f1 = new File("F:\\tproject\\test\\src\\main\\java\\org\\IO\\File\\a.txt");
        //相对路径模块名  不带盘符 ，默认到当前工程下的目录寻找文件  模块名
        File f2 = new File("test\\src\\main\\java\\org\\IO\\File"+File.separator+"a.txt");
        File f3 = new File("D:"+File.separator+"a.txt");
        System.out.println(f3.exists());

    }
}
