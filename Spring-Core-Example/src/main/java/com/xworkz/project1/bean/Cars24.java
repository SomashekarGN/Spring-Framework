package com.xworkz.project1.bean;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Cars24 {

    @Value("1200")
    private int carId;
    @Value("M4")
    private String model;
    @Value("BMW")
    private String brand;
}

