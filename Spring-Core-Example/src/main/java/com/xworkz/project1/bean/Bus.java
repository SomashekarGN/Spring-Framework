package com.xworkz.project1.bean;


import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Data
@Component
public class Bus {

    private int id;
    private String busName;
    private int busCapacity;

    @Autowired
    public Bus(@Value("001") int id,@Value("VRL") String busName,@Value("40") int busCapacity) {
        this.id = id;
        this.busName = busName;
        this.busCapacity = busCapacity;
    }
}
