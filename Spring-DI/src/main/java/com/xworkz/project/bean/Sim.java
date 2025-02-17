package com.xworkz.project.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Sim {

    @Value("Reliance JIO")
    private String brand;
    @Value("249")
    private double pricePerMonth;
    @Value("Yes")
    private String supports5G;


}
