package com.xworkz.project1.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Fish {
    @Value("Pleaco")
    private String fishName;
    @Value("SaltWater")
    private String fishType;
    @Value("200.00")
    private double price;

    @Autowired
    public Fish(@Value("Shark") String fishName,@Value("Salt Water Fish") String fishType,@Value("150.00") double price) {
        this.fishName = fishName;
        this.fishType = fishType;
        this.price = price;
    }
}
