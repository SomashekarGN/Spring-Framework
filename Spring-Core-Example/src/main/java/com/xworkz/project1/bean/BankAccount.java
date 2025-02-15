package com.xworkz.project1.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class BankAccount {
    private int accountId;
    private String accountHolder;
    private double balance;

    @Autowired
    public BankAccount(@Value("45") int accountId,@Value("Vijaya Mallaya") String accountHolder,@Value("50000000.00") double balance) {
        this.accountId = accountId;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
}

