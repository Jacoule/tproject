package org.Collection.Collection;

import org.base.day2_enum.C;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        //1、public static <T> boolean addAll( Collection < ? supper T> , T...elements )
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"haha","kaka");

        //2、public static void shuffle(List<?> list ) 打乱集合中元素的位置
        Collections.shuffle(list);

        //3.排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

        //4.
    }
}
