package com.xworkz.project1.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Flight {
    private int flightId;
    private String airline;
    private String destination;

    @Autowired
    public Flight(@Value("615") int flightId,@Value("Indigo") String airline,@Value("Bengaluru") String destination) {
        this.flightId = flightId;
        this.airline = airline;
        this.destination = destination;
    }
}
