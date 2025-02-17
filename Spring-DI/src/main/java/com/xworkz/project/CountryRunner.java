package com.xworkz.project;

import com.xworkz.project.bean.Country;
import com.xworkz.project.springconfig.DIConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CountryRunner {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(DIConfiguration.class);
        Country country=applicationContext.getBean(Country.class);

        System.out.println(country);

    }
}
