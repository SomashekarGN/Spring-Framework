package com.xworkz.project;

import com.xworkz.project.bean.Library;
import com.xworkz.project.springconfig.DIConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibraryBooksRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DIConfiguration.class);
        Library library = applicationContext.getBean(Library.class);
        System.out.println(library);
    }
}
