package org.base.day5_arrays;

import lombok.Data;

@Data
public class Student implements Comparable<Student>{
    Integer age;
    Double height;

    public Student() {

    }

    Student(Integer age ,Double height) {
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
