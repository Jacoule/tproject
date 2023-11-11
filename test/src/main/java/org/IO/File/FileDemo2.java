package org.IO.File;

import org.base.day1_singleton.main;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        File file = new File("test/src/main/java/org/IO/File/a.txt");

        file.exists();//判断文件是否存在
        file.isFile();//判断是否是文件
        file.isDirectory();//判断是否是目录
        file.getName();//获取文件名
        file.length();//获取长度
        file.lastModified();//获取最后的修改时间
        file.getPath();//获取创建文件的时候使用的路径
        file.getAbsoluteFile();//获取绝对路径
    }
}
