package com.xworkz.project.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Politician {

        @Value("01")
        private int id;
        @Value("Upendra")
        private String name;
        @Value("Uttama Prajaakeeya Party")
        private String party;

}
