package org.Stream;

import org.base.day5_arrays.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamDemo2 {
    /**
     * 流的中间方法  返回新的流 重点掌握
     *  1、filter
     *  2、sorted  可以传入一个比较器
     *  3、limit
     *  4、skip   跳过前面几个对象
     *  5、distinct  去重皂操作 --自定义的类需要重写 hashCode 和 equals 方法
     *  6、map   对元素进行加工 返回新的流
     *  7、concat 连接流
     *
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student(22, 170.0,"何子熊");
        Student student2 = new Student(21, 168.0,"haha");
        Student student3 = new Student(42, 178.0,"kaka");
        Collections.addAll(students,student1,student2,student3);

        //1、找出年龄 20-30 的学生 年龄降序排序（默认升序）  输出
        students.stream().filter(student -> student.getAge()>=20 && student.getAge()<=30 )
                .sorted(((o1, o2) -> Double.compare(o2.getAge(),o1.getAge())))
                .forEach(s-> System.out.println(s));


        //2、取出身高前2的学生并输出
        students.stream().sorted((o1, o2) -> Double.compare(o2.getHeight(),o1.getHeight()))
                .limit(2)
                .forEach(System.out::println);

        //3、取出身高倒数的2名学生
        students.stream().sorted((o1, o2) -> Double.compare(o2.getHeight(),o1.getHeight()))
                .skip(students.size()-2).forEach(System.out::println);

        //4、找出升高超过168的学生名字，并去重
        students.stream().filter(student -> student.getHeight()>168.0)
                .map(student -> student.getName())
                .distinct()
                .forEach(System.out::println);
    }
}
