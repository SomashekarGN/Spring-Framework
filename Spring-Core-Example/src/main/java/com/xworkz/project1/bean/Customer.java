package com.xworkz.project1.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Customer {
    private int customerId;
    private String customerName;
    private String contactNumber;

    @Autowired
    public Customer(@Value("002") int customerId,@Value("Abhishek Upari") String customerName,@Value("8892463787") String contactNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.contactNumber = contactNumber;
    }
}
