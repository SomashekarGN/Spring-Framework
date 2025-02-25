package com.xworkz.project.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    public SpringWebInitializer() {
        System.out.println("Web Init is invoked..!");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("getRootConfigClasses is invoked...!");
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("getServletConfigClasses Invoked...!");
        return new Class[]{SpringConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("getServletMapping is invoked...!");
        return new String[]{"/"};
    }
}
