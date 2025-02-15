package com.xworkz.project1.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class ShoppingCart {

    @Value("45")
    private int cartId;
    @Value("54000786")
    private int userId;
    @Value("4")
    private int totalItems;
}
