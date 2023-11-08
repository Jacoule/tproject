package org.Collection.List;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    /**
     * List<E>   add(intdex ,element) get(index)  set(index ,element) remove(index | element)
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("OI");
        list.add("KO");
        list.add("Tom");

        System.out.println(list);
        //在指定索引位置添加元素
        list.add(2,"何子孝");
        System.out.println(list);
        //get 获取指定索引的元素
        System.out.println(list.get(2));

        // set 使用新的元素替换原有元素 并返回被替换的元素
        System.out.println(list.set(3, "haha"));
        System.out.println(list);
        list.remove(1);

    }
}
