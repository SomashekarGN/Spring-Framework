package com.xworkz.project1.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Product {

    @Value("89")
    private int productId;
    @Value("XOR Helmet")
    private String productName;
    @Value("49999.99")
    private double price;
}
