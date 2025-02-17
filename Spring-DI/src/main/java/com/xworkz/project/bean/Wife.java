package com.xworkz.project.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Wife {

    @Value("Anushaka Sharama")
    private String name;
    @Value("32")
    private int age;
    @Value("Actor")
    private String occupation;
    @Value("2017-12-11")
    private String marriageDate;
}
