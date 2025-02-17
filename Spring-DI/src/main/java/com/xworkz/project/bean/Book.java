package com.xworkz.project.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Book {

    @Value("The Alchemist")
    private String title;

    @Value("Paulo Coelho")
    private String author;
}
