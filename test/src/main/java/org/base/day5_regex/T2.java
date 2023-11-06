package org.base.day5_regex;

import java.util.Arrays;

public class T2 {
    public static void main(String[] args) {

        // 1、replaceAll 用指定的字符替换正则匹配的内容
        String s1 = "房内噢asd3饭哦按是否能fasf234你非得萨凡纳" ;
        System.out.println(s1.replaceAll("\\w+","-"));
        System.out.println(s1);

        //2、语音系统 解决口吃问题
        String s2 = "是我我我我我嘻嘻嘻嘻哈哈哈哈" ;
        /**(.)一组 .匹配任意字符
         *  \\1为这个组声明一个组号 1 号
         *  + 一个和多个
         *  $1 可以取到第一组那个重复的字
         */
        String regex1 = "(.)\\1+";
        System.out.println(s2.replaceAll(regex1,"$1"));

        //3、把汉字提取出来  \\w+ 字母和数字
        String s4 = "房内噢asd3饭哦按是否能fasf234你非得萨凡纳" ;
        String[] split = s4.split("\\w+");
        System.out.println(Arrays.toString(split));
    }
}
