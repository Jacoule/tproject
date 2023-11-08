package org.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemoFor {
    public static void main(String[] args) {
        // List 有索引
        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("OI");
        list.add("KO");

        //1. for 循环遍历比 Collection 多的遍历方法
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //2. 迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //3.增强 for 循环 ( forEach遍历 )
        for (String s : list) {
            System.out.println(s);
        }

        //4.Lambda JDK1.8 开始之后支持的
        list.forEach(s -> System.out.println(s));
    }
}
