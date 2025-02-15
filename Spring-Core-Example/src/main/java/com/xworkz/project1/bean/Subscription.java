package com.xworkz.project1.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Subscription {
    private int subscriptionId;
    private String planName;
    private double monthlyCost;

    @Autowired
    public Subscription(@Value("56") int subscriptionId,@Value("Prime Memebership") String planName,@Value("149.00") double monthlyCost) {
        this.subscriptionId = subscriptionId;
        this.planName = planName;
        this.monthlyCost = monthlyCost;
    }
}
