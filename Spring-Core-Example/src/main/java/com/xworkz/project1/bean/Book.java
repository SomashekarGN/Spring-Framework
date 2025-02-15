package com.xworkz.project1.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Book {

    @Value("43")
    private int bookId;
    @Value("Think & Grow Rich")
    private String title;
    @Value("Napolein")
    private String author;
}
