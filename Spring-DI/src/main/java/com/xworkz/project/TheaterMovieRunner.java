package com.xworkz.project;

import com.xworkz.project.bean.Theater;
import com.xworkz.project.springconfig.DIConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TheaterMovieRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DIConfiguration.class);
        Theater theater = applicationContext.getBean(Theater.class);
        System.out.println(theater);
    }
}
