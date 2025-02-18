package com.xworkz.project;

import com.xworkz.project.springconfig.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ProjectConfig.class);
        applicationContext.getBean();
    }
}
