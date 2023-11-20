package org.IO.File;

import org.base.day2_enum.C;

import java.awt.*;
import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {

//        File file = new File("D://");
//
//        // 获取当前目录下的一级文件名称 到一个新数组中去返回
//        String[] name = file.list();
//        for (String s : name) {
//            System.out.println(s);
//        }


        /**
         * 主调是文件 或者路径不存在时 返回 null
         * 主调是空文件夹是 返回一个长度为 0 的数组
         * 当主调是一个有内容的文件夹时，将里面所有的一级文件和文件夹的路径放在 File 数组中返回（包含隐藏文件）
         * 主调是一个文件夹时，但是  没有权限访问改文件夹时，返回 null
         */
        // 获取当前目录下所有的"一级文件对象"到一个文件对象数组中去 （重点）
//        for (File listFile : file.listFiles()) {
//            System.out.println(listFile.getAbsoluteFile());
//        }

        File file2 = new File("C:\\Users\\He'zi'xiao\\Desktop\\简历pdf");
        int i=0;
        for (File listFile : file2.listFiles()) {
            String name1 = listFile.getName();
            String first = name1.substring(0,name1.indexOf("-"));
            System.out.println(first);
            String last = name1.substring(name1.indexOf("-"));
            String newName = first+last;

            System.out.println("Parent path : "+listFile.getParent());
            listFile.renameTo(new File(listFile.getParent(),newName));
        }


    }
}
