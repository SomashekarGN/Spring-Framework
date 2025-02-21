package com.xworkz.project.entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "customer_details")
public class CustomerEntity {

    private Integer customerId;
    private String customerName;
    private Integer accountNumber;
}
