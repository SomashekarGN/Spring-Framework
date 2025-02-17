package com.xworkz.project.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Ingredient {

    @Value("Tomato Sauce")
    private String name;

    @Value("100g")
    private String quantity;
}
