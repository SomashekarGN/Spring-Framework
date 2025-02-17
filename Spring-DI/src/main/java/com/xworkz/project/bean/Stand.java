package com.xworkz.project.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Stand {

    @Value("Wooden Stand")
    private String material;

    @Value("Black")
    private String color;
}
