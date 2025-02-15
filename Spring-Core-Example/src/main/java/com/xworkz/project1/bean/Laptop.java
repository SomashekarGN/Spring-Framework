package com.xworkz.project1.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Laptop {

    @Value("45")
    private int laptopId;
    @Value("HP")
    private String brand;
    @Value("145000.00")
    private double price;
}
