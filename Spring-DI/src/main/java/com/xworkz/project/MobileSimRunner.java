package com.xworkz.project;

import com.xworkz.project.bean.Mobile;
import com.xworkz.project.springconfig.DIConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MobileSimRunner {

    public static void main(String[] args) {

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(DIConfiguration.class);
        Mobile mobile=applicationContext.getBean(Mobile.class);
        System.out.println(mobile);

    }
}
