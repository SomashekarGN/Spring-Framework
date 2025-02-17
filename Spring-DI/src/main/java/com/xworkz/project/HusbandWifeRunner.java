package com.xworkz.project;

import com.xworkz.project.bean.Husband;
import com.xworkz.project.springconfig.DIConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HusbandWifeRunner {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(DIConfiguration.class);
        Husband husband=applicationContext.getBean(Husband.class);
        System.out.println(husband);

    }
}
