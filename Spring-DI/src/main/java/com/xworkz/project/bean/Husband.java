package com.xworkz.project.bean;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Husband {

    @Value("Virat Kholi")
    private String name;
    @Value("34")
    private int age;
    @Value("Cricketer")
    private String occupation;
    @Autowired
    private Wife wife;
}
