package com.xworkz.project.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.List;

@Data
@Component
public class Dish {

    @Value("Pasta")
    private String name;

    @Autowired
    private List<Ingredient> ingredients;
}
