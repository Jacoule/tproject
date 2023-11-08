package org.Stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * 获取流 并简单操作
 */
public class StreamDemo1 {
    public static void main(String[] args) {
        //获取List集合的 Stream 流
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,"haha","kaka");
        Stream<String> stream = arrayList.stream();

        //获取Set集合的 Stream 流？
        Set<String> set = new HashSet<>();
        Collections.addAll(set,"haha","kaka");
        Stream<String> stream1 = set.stream();
        stream1.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("h");
            }
        }).forEach(s -> System.out.println(s));

        //如何获取Map集合的 Stream 流 ？
        Map<String,Double> map = new HashMap<>();
        map.put("haha",23.2);
        map.put("koko",23.0);
        map.put("lolo",25.9);

        Set<String> keySet = map.keySet();
        Stream<String> ks = keySet.stream();

        Collection<Double> values = map.values();
        Stream<Double> kvs = values.stream();

        Set<Map.Entry<String ,Double>> enties = map.entrySet();
        Stream<Map.Entry<String ,Double>> stream2 = enties.stream();
        stream2.filter(s -> s.getKey().contains("o")).forEach(s-> System.out.println(s.getKey()+"==>"+s.getValue()));

        //数组获取流的范式
        String[] neame2 ={"kaka","haha"};
        Stream<String> stream3 = Arrays.stream(neame2);
        Stream<String> neame21 = Stream.of(neame2);


    }
}
