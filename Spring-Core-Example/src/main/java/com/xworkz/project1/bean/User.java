package com.xworkz.project1.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {

    @Value("78")
    private int userId;
    @Value("Somashekar")
    private String username;
    @Value("somashekae.xworkz@gmail.com")
    private String email;
}
