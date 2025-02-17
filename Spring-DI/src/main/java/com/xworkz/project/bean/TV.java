package com.xworkz.project.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class TV {

    @Value("Samsung QLED 4K")
    private String brand;

    @Autowired
    private Stand stand;
}
