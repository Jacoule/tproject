package org.Collection.Collection;

import org.base.day1_singleton.main;

import java.util.Arrays;

public class CollectionOther {
    /**
     * 可变参数 一种特殊的形参 定义在方法 构造器的形参列表中 格式是：数据类型...参数名称
     * 特点： 可以不传参数给他 ，可以传 1 个或者传多个参数给他 也可以传一个数组给他 。
     * 好处 ： 常常用来灵活的接收数据
     * @param args
     */
    public static void main(String[] args) {
        test();
        test(10,20,30);
        test(new int[]{10,30,90});
    }

    // 一个方法 只能有一个可变参数
    // 一个方法 可变参数只能放在最后的形参位置
    public static void test(int...nums){
        // 可变参数在内部就是一个数组
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
    }

}
