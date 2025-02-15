package com.xworkz.project1.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Student {
    private int studentId;
    private String name;
    private String course;

    @Autowired
    public Student(@Value("0023") int studentId,@Value("Omkar Desai") String name,@Value("Java Full Stack") String course) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
    }
}
