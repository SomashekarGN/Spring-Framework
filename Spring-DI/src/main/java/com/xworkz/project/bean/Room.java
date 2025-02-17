package com.xworkz.project.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Room {

    @Value("Bedroom")
    private String type;

    @Value("250 sq ft")
    private String size;
}
