package com.xworkz.project1.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Teacher {

    @Value("45")
    private int teacherId;
    @Value("Shlipa Dalwayi")
    private String name;
    @Value("Java")
    private String subject;
}
