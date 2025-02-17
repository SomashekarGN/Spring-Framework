package com.xworkz.project.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Movie {

    @Value("Inception")
    private String title;

    @Value("Christopher Nolan")
    private String director;
}
