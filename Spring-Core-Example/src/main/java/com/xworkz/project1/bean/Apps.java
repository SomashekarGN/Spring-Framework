package com.xworkz.project1.bean;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Data
@Component
public class Apps {

    @Value("23")
    private int appId;
    @Value("Namma Yatri")
    private String appName;
    @Value("Cab Booking")
    private String appType;
}
