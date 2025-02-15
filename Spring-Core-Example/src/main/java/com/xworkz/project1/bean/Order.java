package com.xworkz.project1.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Order {
    private int orderId;
    private int userId;
    private double totalAmount;

    @Autowired
    public Order(@Value("999") int orderId,@Value("505546") int userId,@Value("99999.99") double totalAmount) {
        this.orderId = orderId;
        this.userId = userId;
        this.totalAmount = totalAmount;
    }
}
