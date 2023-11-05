package org.example.day1_singleton;

public class singleton {
    /**
     * 单例设计模式
     * 1、私有构造方法
     * 2、定义一个类变量，记住一个对象
     * 3、定义一个类方法，返回该对象
     * 4、饿汉单例模式指对象在获取对象之前就已经创建好了对象
     */

    private singleton(){}

    private static singleton s = new singleton();

    public static singleton getObject(){return s;}

    //静态代码块，在类加载的时候执行
    static{

    }
    //实例代码块，在对象构造方法之前执行
    {
    }
}
