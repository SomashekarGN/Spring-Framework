package com.xworkz.project.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Mobile {

    @Value("Motorola")
    private String Brand;
    @Value("Edge 50 Neo")
    private String model;
    @Value("24999")
    private Double price;
    @Value("2")
    private int noOfSimSupported;
    @Autowired
    private Sim sim;
}
