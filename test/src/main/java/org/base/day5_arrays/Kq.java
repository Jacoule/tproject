package org.base.day5_arrays;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

public class Kq {
    public static void main(String[] args) {
        //1、 public static String toString(类型[] array) 返回数组的内容
        int[] a1 = new int[]{1,2,3,4,5,6};
        int[] a2 = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(a1));

        //2、拷贝数组  public static 类型[] copyOfRange( 类型[] , 起始索引，终止索引 )
        int[] ints = Arrays.copyOfRange(a1, 0, 2);
        System.out.println(Arrays.toString(ints));

        //3、拷贝数组 指定新数组的长度  public static copyOf(类型[] , int newLength)
        //   数组扩容  空的为 0
        int[] ints1 = Arrays.copyOf(a1, 10);

        // 4、 把数组中所有的数据 ( 原始数据 )  改成新数据，然后存进去
        //  public static setAll(double[] doubleArray , IntToDoubleFunction generator)
        double[] double1 = {0.1,0.2,0.3};
        Arrays.setAll(double1, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                // return double1[value]+=0.1;  会出现问题
                return BigDecimal.valueOf(double1[value]).add(BigDecimal.valueOf(0.1)).doubleValue();
            }
        });
        System.out.println(Arrays.toString(double1));

        // public static 类型[] sort  ( 类型[] ) 升序

    }
}
