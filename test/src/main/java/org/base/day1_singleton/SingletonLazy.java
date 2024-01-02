package org.base.day1_singleton;

public class SingletonLazy {
    /**
     * 懒汉式单例模式
     * 获取对象的时候才去创建对象
     */
    private static SingletonLazy singletonlazy;
    //构造方法私有化
    private SingletonLazy(){
    }

    public static SingletonLazy getObject(){
        if(singletonlazy==null) {
            singletonlazy = new SingletonLazy();
        }
        return singletonlazy;
    }

}
