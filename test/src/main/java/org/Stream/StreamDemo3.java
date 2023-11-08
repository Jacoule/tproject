package org.Stream;

import org.base.day1_singleton.main;
import org.base.day5_arrays.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.zip.CheckedOutputStream;

/**
 * 终结方法
 * 1、forEach
 * 2、long count()
 * 3、max  ( Comparator ) 比较器对象
 * 4、min  ( Comparator ) 比较器对象
 * 5、R collect(Collector collector)
 * 6、Object[] toArray()
 */
public class StreamDemo3 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        Student student1 = new Student(22, 170.0,"何子熊");
        Student student2 = new Student(21, 168.0,"haha");
        Student student3 = new Student(42, 178.0,"kaka");
        Collections.addAll(students,student1,student2,student3);

        //1、计算身高超过168的学生个数
        long count = students.stream().filter(student -> student.getHeight()>168.0).count();
        System.out.println(count);

        //2、 min 拿到排序后结果最左边元素 比较器不同获取到的数据也不同
        Student student = students.stream()
                .min((o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight()))
                .get();
        System.out.println(student);

        // 3、收集 Stream 流 ,返回到一个新的集合中去 ，流只能 collect 一次
        List<Student> collect = students.stream()
                .filter(s -> s.getHeight() > 168.0).toList();

        Set<Student> collect1 = students.stream()
                .filter(s -> s.getHeight() > 168.0)
                .collect(Collectors.toSet());

        // 4、收集168身高以上的 名字和升高 返回 Map 集合
        Map<String, Double> collect2 = students.stream()
                .filter(s -> s.getHeight() > 168.0)
                .distinct()
                .collect(Collectors.toMap(s -> s.getName(), s -> s.getHeight()));
        System.out.println(collect2);

        Map<String,Integer> map = new HashMap<>();
        map.put("hah",23);
        System.out.println(map);

        //5、收集到数组中去 toArray
        Object[] objects = students.stream()
                .filter(s -> s.getHeight() > 168.0)
                .distinct().toArray();
        System.out.println(Arrays.toString(objects));

        Student[] os = students.stream()
                .filter(s -> s.getHeight() > 168.0)
                .distinct().toArray(s->new Student[s]);
        System.out.println(Arrays.toString(os));



    }
}
