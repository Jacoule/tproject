package org.base.day1_interface_jdk8;


public interface A {

    /**
     * 1、默认方法 必须使用 default 默认被 public 修饰
     * 实例方法 对象的方法 必须使用实现类的对象来访问
     */
    default void test1(){

    }

    /**
     * 私有方法 必须使用 private 修饰 （ jdk 9 后开始支持）
     */
    private void test2(){
        System.out.println("===私有方法=====");
    }

    /**
     * 静态方法 默认会被 public 修饰
     */
    public static void test3(){
        System.out.println("静态方法");
    }



}
