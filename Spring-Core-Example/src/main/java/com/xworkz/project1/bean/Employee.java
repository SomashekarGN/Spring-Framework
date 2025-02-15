package com.xworkz.project1.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Employee {

    @Value("3498")
    private int employeeId;
    @Value("Harmann")
    private String employeeName;
    @Value("Air Hostress")
    private String department;
}
