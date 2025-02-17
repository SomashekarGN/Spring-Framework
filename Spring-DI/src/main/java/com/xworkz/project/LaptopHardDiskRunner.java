package com.xworkz.project;

import com.xworkz.project.bean.Laptop;
import com.xworkz.project.springconfig.DIConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LaptopHardDiskRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DIConfiguration.class);
        Laptop laptop = applicationContext.getBean(Laptop.class);
        System.out.println(laptop);
    }
}
