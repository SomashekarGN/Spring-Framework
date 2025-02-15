package com.xworkz.project1.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Hotel {

    @Value("001")
    private int hotelId;
    @Value("The President Hotel")
    private String hotelName;
    @Value("4.9")
    private double rating;
}
