package org.base.day5_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式
 */
public class T1 {
    public static void main(String[] args) {
        //1、定义爬取规则
        String regex = "1[2-9]{5}|123";
        String string = "122222 123";
        //2.把正则表达式封装成一个 Pattern 对象
        Pattern pattern = Pattern.compile(regex);

        //3.通过 pattern 去获取查找内容的匹配器对象
        Matcher matcher = pattern.matcher(string);

        //4.定义一个循环开始爬取信息
        while(matcher.find()){
            String S = matcher.group();//获取到了找到的内容了
            System.out.println(S);
        }

        System.out.println(string.matches(regex));
    }

    public static boolean chrackQQ(String s){
        return s!=null && s.matches("[1-9]\\d{5,19}");
    }
}
