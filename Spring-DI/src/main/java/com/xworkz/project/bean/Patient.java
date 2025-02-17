package com.xworkz.project.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Patient {

    @Value("Rahul Sharma")
    private String name;

    @Value("45")
    private int age;

    @Autowired
    private Address address;
}
