package org.base.day2_enum;

public class Test {
    public static void main(String[] args) {
        A a1 = A.x;
        System.out.println(a1);

        //1.枚举类的构造器是私有的，不能对外创建对象
        //A a1 = new A();

        //2.枚举类的第一行都是常量，记住的是枚举类的对象
        A a2 = A.y;

        //枚举提供了一些额外的 API
        A[] as = A.values();//拿到全部对象
        A a3 = A.valueOf("z");
        System.out.println(a3.name());//z
        System.out.println(a3.ordinal());//拿到索引

        B b1 = B.Y;
        b1.go();

    }


}
