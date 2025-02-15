package com.xworkz.project1.bean;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Transaction {
    private int transactionId;
    private double amount;
    private String transactionType;

    @Autowired
    public Transaction(@Value("34") int transactionId,@Value("49999.99") double amount,@Value("Credit") String transactionType) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.transactionType = transactionType;
    }
}
