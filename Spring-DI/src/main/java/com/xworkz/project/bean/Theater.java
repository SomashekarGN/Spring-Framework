package com.xworkz.project.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Theater {

    @Value("PVR Cinemas")
    private String name;

    @Autowired
    private Movie movie;
}
