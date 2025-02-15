package com.xworkz.project1.bean;


import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class School {

    private int id;
    private String schoolName;
    private String location;

    @Autowired
    public School(@Value("99") int id,@Value("Standard Higher Primary School") String schoolName,@Value("Rajajinagar Bangalore") String location) {
        this.id = id;
        this.schoolName = schoolName;
        this.location = location;
    }
}
