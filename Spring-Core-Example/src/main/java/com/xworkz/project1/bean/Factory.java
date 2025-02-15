package com.xworkz.project1.bean;


import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Data
@Component
public class Factory {

    private int id;
    private String ownerName;
    private String factoryType;

    @Autowired
    public Factory(@Value("890") int id,@Value("Adani") String ownerName,@Value("Ports") String factoryType) {
        this.id = id;
        this.ownerName = ownerName;
        this.factoryType = factoryType;
    }
}
