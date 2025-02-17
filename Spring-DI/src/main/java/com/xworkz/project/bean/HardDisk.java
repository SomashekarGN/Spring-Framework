package com.xworkz.project.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class HardDisk {

    @Value("1TB SSD")
    private String storage;

    @Value("Samsung evo 40")
    private String brand;
}
