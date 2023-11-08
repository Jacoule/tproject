package org.Collection.Set;

import org.base.day5_arrays.Student;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        /**
         * 基于红黑树实现
         * 1.对于数值类型 Integer Double 默认按照数值本身的大小排序 （ 从小到大 升序 ）
         * 2.对于字符串类型 默认按照首字母的符号的编号升序排序
         * 3.对于自定义的类型 默认是无法直接排序的
         *      -1、类实现 Comparable 接口
         *      -2、调用 TreeSet 有参构造器 设置 Comparator 对象
         */

        //实现 Comparable 接口
        Set<Student> set = new TreeSet<>();
        set.add(new Student(20, 170.0));
        set.add(new Student(20, 150.0));
        set.add(new Student(20, 120.0));
        set.add(new Student(20, 190.0));
        System.out.println(set);


        // 调用TreeSet 的有参构造器 设置 Comparator 对象 比较器对象 就近选择
        Set<Student> set1 = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        set1 = new TreeSet<>((o1, o2) -> o1.getAge() - o2.getAge());
        set1 = new TreeSet<>(Comparator.comparingInt(Student::getAge));

        set1.add(new Student(22, 170.0));
        set1.add(new Student(10, 150.0));
        set1.add(new Student(250, 120.0));
        set1.add(new Student(200, 190.0));
        System.out.println(set1);

    }
}
