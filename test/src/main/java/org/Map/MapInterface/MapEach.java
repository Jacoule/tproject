package org.Map.MapInterface;

import java.rmi.Naming;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapEach {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();//经典代码, 无序、不重复、无索引
        map.put("haha",23);

        //1、遍历集合、增强 for 循环
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key+"====>"+map.get(key));
        }

        //2、Entry
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+"====>"+entry.getValue());
        }

        //3、Lambda 表达式
        map.forEach(new BiConsumer<>() {
            @Override
            public void accept(String k, Integer v) {
                System.out.println(k + "========>" + v);
                System.out.println(k + "========>" + v);
            }
        });

        map.forEach((k, v) -> {
            System.out.println(k + "========>" + v);
            System.out.println(k + "========>" + v);
        });

        map.forEach((k, v) -> System.out.println(k+"========>"+v));

    }
}
