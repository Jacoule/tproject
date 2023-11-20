package org.IO.File;

import java.io.File;
import java.io.IOException;

public class FileDemo5 {
    public static void main(String[] args) throws IOException {
        searchFile(new File("D:\\QQ"),"QQScLauncher.exe");
    }

    public static void  searchFile(File dir ,String filename) throws IOException {
        if(dir == null || !dir.exists()){
            return ;
        }
        if(dir.isFile() && dir.length()>0){
            if(dir.getName().equals(filename)){
                System.out.println(dir.getAbsoluteFile());
                Runtime runtime = Runtime.getRuntime();
                runtime.exec(dir.getAbsolutePath());
            }
        }
        if (dir.isDirectory()){
            for (File file : dir.listFiles()) {
                searchFile(file,filename);
            }

        }
    }
}
