package com.xworkz.project;

import com.xworkz.project.bean.Patient;
import com.xworkz.project.springconfig.DIConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PatientAddressRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DIConfiguration.class);
        Patient patient = applicationContext.getBean(Patient.class);
        System.out.println(patient);
    }
}
