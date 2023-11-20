package org.Other;


import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class getBytes {
    /**
     * byte[] getBytes()
     * bute[] getBytes(String charsetName)
     *
     *************************************
     *
     * Java代码完成对字符的解码
     * String(byte[] bytes)
     * String (byte[] bytes,String charsetName)
     * @param args
     */
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 1、编码
        String data = "a我b";
        byte[] bytes = data.getBytes();
        System.out.println(Arrays.toString(bytes));

        // 2、按照指定的字符集编码
        byte[] bytes1 = data.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1));

        // 3、解码
        String s2 = new String(bytes);
        System.out.println(s2);

        System.out.println(new String(bytes1,"GBK"));


    }
}
