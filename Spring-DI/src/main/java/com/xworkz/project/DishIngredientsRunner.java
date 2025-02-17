package com.xworkz.project;

import com.xworkz.project.bean.Dish;
import com.xworkz.project.springconfig.DIConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DishIngredientsRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DIConfiguration.class);
        Dish dish = applicationContext.getBean(Dish.class);
        System.out.println(dish);
    }
}
