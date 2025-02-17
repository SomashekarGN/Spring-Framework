package com.xworkz.project;

import com.xworkz.project.bean.TV;
import com.xworkz.project.springconfig.DIConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TVStandRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DIConfiguration.class);
        TV tv = applicationContext.getBean(TV.class);
        System.out.println(tv);
    }
}
