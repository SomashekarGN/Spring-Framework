package com.xworkz.project1.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Movie {
    private int movieId;
    private String title;
    private String genre;

    @Autowired
    public Movie(@Value("67") int movieId,@Value("Anabella") String title,@Value("horror") String genre) {
        this.movieId = movieId;
        this.title = title;
        this.genre = genre;
    }
}
