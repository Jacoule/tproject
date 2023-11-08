package org.Map.MapInterface;

import org.base.day5_arrays.Student;

import javax.management.MalformedObjectNameException;
import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();//经典代码, 无序、不重复、无索引
        Map<String,Integer> linkdedmap = new LinkedHashMap<>();// 有序（记录了put的顺序）、不重复、无索引

        map.clear();
        map.put("haha",23);
        map.get("haha");//没有则返回null
        map.containsKey("haha");
        map.containsValue(23);
        map.remove("haha");
        Set<String> strings = map.keySet();
        Collection<Integer> values = map.values();
        linkdedmap.put("Kava",20);
        map.isEmpty();
        map.putAll(linkdedmap);
        System.out.println(map);
        new Student();
    }
}
