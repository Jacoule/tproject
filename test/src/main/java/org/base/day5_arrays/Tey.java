package org.base.day5_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Tey {
    public static void main(String[] args) {

        Student s1 = new Student(20, 156.2);
        Student s2 = new Student(26, 180.2);
        Student s3 = new Student(23, 166.2);
        Student s4 = new Student(27, 126.2);
        Student[] students = new Student[]{s1, s2, s3, s4};
        System.out.println(Arrays.toString(students));
        // 比较类实现 Comparable 接口 重写 compareTo 方法
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));


        // public static <T> sort(T[] array , Comparator )  接口的匿名内部类


        // Arrays.sort(students, (o1, o2) -> Double.compare(o1.getAge(),o2.getAge()));

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getAge(),o2.getAge());
            }
        });
        System.out.println(Arrays.toString(students));

    }
}
