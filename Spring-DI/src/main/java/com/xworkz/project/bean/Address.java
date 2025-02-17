package com.xworkz.project.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Address {

    @Value("123 Main Street")
    private String street;

    @Value("Mumbai")
    private String city;

    @Value("400001")
    private String zipCode;
}
