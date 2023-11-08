package org.Collection.Set;

import java.rmi.Naming;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        /**
         * Set 要用的常用方法就是 Collection 集合常用的
         */
        //创建了一个 HashSet 的经典对象 一行经典代码 HashSet 无序、不重复、无索引
        Set<Integer> set1 = new HashSet<>();
        //有序 不重复 无索引
        Set<Integer> set2 = new LinkedHashSet<>();
        //可排序（升序）  不重复 无索引
        Set<Integer> set3 = new TreeSet<>();

    }
}
