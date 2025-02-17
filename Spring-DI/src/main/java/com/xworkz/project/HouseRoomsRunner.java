package com.xworkz.project;

import com.xworkz.project.bean.House;
import com.xworkz.project.springconfig.DIConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HouseRoomsRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DIConfiguration.class);
        House house = applicationContext.getBean(House.class);
        System.out.println(house);
    }
}
