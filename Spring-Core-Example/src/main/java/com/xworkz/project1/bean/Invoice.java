package com.xworkz.project1.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Invoice {
    private int invoiceId;
    private double amount;
    private String status;

    @Autowired
    public Invoice(@Value("89") int invoiceId,@Value("49999") double amount,@Value("Pre-Paid") String status) {
        this.invoiceId = invoiceId;
        this.amount = amount;
        this.status = status;
    }
}
