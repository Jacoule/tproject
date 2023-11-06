package org.Collection.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class col1 {
    public static void main(String[] args) {
        // 集合
        Collection<String> collection = new ArrayList<>(); // 多态写法

        collection.add("java");
        //collection.clear();
        collection.isEmpty();
        collection.size();
        collection.contains("java");
        // 删除元素  如果有多个元素 则默认删除第一个元素
        collection.remove("Java");
        Object[] objects = collection.toArray();
        System.out.println(Arrays.toString(objects));

        String[] strings = collection.toArray(new String[collection.size()]);
        System.out.println("打印数组的引用"+ strings);
        System.out.println(Arrays.toString(strings));

        System.out.println("==把一个集合的全部数据导入到另一个集合===============");
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("Java");
        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Python");

        collection1.addAll(collection2);
        System.out.println(collection1);
    }
}
