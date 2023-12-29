package org.temp;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(prefix = {"aa","b"})
public class Student {
    String aaname;
    String bbName;
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("name : " +  student);
    }
}
