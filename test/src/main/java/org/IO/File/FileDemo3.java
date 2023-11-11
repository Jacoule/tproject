package org.IO.File;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    /**
     * 文件的创建 和 删除的相关方法
     * @param args
     */
    public static void main(String[] args) throws Exception {
        File file = new File("D:/b.txt");

        System.out.println(file.createNewFile());

        // 创建文件夹
        File file2 = new File("D:/aaa/bbb/ccc/ddd");
        System.out.println(file2.mkdirs());

        //删除文件 删除文件或者空文件，不能删除非空文件夹,删除的不会进入回收站。
        System.out.println(file.delete());

    }
}
