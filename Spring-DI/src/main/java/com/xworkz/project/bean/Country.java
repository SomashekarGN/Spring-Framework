package com.xworkz.project.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Country {


    @Value("007")
    private Integer countryId;
    @Value("Bharath")
    private String name;
    @Value("1400000000")
    private Long population;
    @Value("29")
    private Integer noOfStates;
    @Autowired
    private Politician politician;

}
