package org.base.day5_arrays;

import lombok.Data;

import java.util.Objects;


@Data
public class Student implements Comparable<Student>{
    Integer age;
    Double height;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Student student = (Student) o;
        return Objects.equals(age, student.age) && Objects.equals(height, student.height) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, height, name);
    }

    public Student() {

    }

    public Student(Integer age, Double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public Student(Integer age , Double height) {
        this.age=age;
        this.height= height;
    }



    // 可以调用Arrays.sort 方法
    @Override
    public int compareTo(Student o) {
        // 约定 左边的值大于右边的值返回正数 升序排序
        //return this.age-o.age;
        return Double.compare(this.height,o.height);
    }

}
