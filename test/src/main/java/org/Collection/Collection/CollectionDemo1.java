package org.Collection.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollectionDemo1 {
    public static void main(String[] args) {

        /**
         *  集合存储的是对象的地址
         */

        Collection<String> collection = new ArrayList<>(); // 多态写法
        collection.add("12300");
        collection.add("Java");
        collection.add("Tom");

        //  1、 获取迭代器  使用迭代器遍历集合
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
        /**
         * .for 快捷键
         * */

        System.out.println("=======================");
        //  2、增强 for 循环可以用来遍历集合(Collection)或数组   本质是迭代器遍历集合的简化写法
        for (String s : collection){
            System.out.println(s);
        }

        System.out.println("forEach=======================");
        collection.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        collection.forEach((String s)-> {
                System.out.println(s);
            }
        );

        // Lambda 表达式
        collection.forEach(s -> {
                    System.out.println(s);
                }
        );

        collection.forEach(s -> System.out.println(s));

        //方法引用
        collection.forEach(System.out::println);

    }
}
