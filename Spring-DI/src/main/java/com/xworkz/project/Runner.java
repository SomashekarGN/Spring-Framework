package com.xworkz.project;

import com.xworkz.project.springconfig.DIConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(DIConfiguration.class);
        Integer integer=applicationContext.getBean(Integer.class);
        System.out.println(integer);

        Byte b=applicationContext.getBean(Byte.class);
        System.out.println(b);

        Short s=applicationContext.getBean(Short.class);
        System.out.println(s);

        Long l=applicationContext.getBean(Long.class);
        System.out.println(l);

        Float f=applicationContext.getBean(Float.class);
        System.out.println(f);

        Double d=applicationContext.getBean(Double.class);
        System.out.println(d);

        Boolean boo=applicationContext.getBean(Boolean.class);
        System.out.println(boo);

        String string=applicationContext.getBean("getString",String.class);
        System.out.println(string);

//        String string1=applicationContext.getBean("getStringValue",String.class);
//        System.out.println(string1);

        String string2=applicationContext.getBean("unigue name",String.class);
        System.out.println(string2);

        List list=applicationContext.getBean(List.class);
        list.add(77);
        list.add(88);
        list.add(78);
        System.out.println(list);

 }
}
