package org.Collection.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class CollectionException {
    public static void main(String[] args) {

        /**
         *  并发编程异常问题
         */
        List<String> list = new ArrayList<>();
        list.add("李二");
        list.add("张三");
        list.add("李四");
        list.add("李玉刚");
        list.add("王二");
        list.add("李四");


//        try {
//            Iterator<String> iterator = list.iterator();
//            while (iterator.hasNext()) {
//                String s = iterator.next();
//                if (s.contains("李")) {
//                    list.remove(s);
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        //删除名字包含李的元素 会绕过数据
//        for (int i = 0; i < list.size(); i++) {
//            String s = list.get(i);
//            if (s.contains("李")) {
//                list.remove(s);
//                i--;
//            }
//        }
//        System.out.println(list);


        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.contains("李")) {
                //list.remove(s);   // 并发修改异常的错误
                iterator.remove(); // 删除迭代器当前遍历到的数据 每删除一个元素后，相当于在底层做了一个 i-- 操作
            }
        }
        System.out.println(list);

        /**
         * 无法修好的写法
         */
        //增强for（迭代器简化写法） 循环无法解决并发修改异常问题
        for (String s : list) {

        }

        //Lambda 表达式 无法解决并发修改异常问题
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                if(s.contains("李")){
                    list.remove(s);
                }
            }
        });

    }
}
