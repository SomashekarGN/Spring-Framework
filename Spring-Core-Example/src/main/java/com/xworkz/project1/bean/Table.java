package com.xworkz.project1.bean;


import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Table {

    private int id;
    private String brandName;
    private double price;

    @Autowired
    public Table(@Value("90") int id,@Value("Nilkamal") String brandName,@Value("49999.99") double price) {
        this.id = id;
        this.brandName = brandName;
        this.price = price;
    }
}
