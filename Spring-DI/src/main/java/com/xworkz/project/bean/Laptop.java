package com.xworkz.project.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Laptop {

    @Value("ASUS Vivobook 14")
    private String model;

    @Value("Intel Core i5")
    private String processor;

    @Autowired
    private HardDisk hardDisk;
}
