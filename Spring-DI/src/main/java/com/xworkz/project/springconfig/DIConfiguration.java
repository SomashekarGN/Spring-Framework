package com.xworkz.project.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.xworkz.project")
public class DIConfiguration {

    @Bean
    public Integer getInteger()
    {
        return new Integer(43);
    }

    @Bean
    public Byte getByte()
    {
        return  new Byte((byte) 1);
    }


    @Bean
    public Short getShort()
    {
        return  new Short((short)3);
    }

    @Bean
    public Long getLong()
    {
     return new Long(45);
    }

    @Bean
    public Float getFlost()
    {
        return new Float(45.55);
    }

    @Bean
    public Double getDouble()
    {
        return new Double(46.66);
    }

    @Bean
    public Boolean getBoolean()
    {
        return new Boolean(true);
    }

    @Bean
    public String getString()
    {
        return new String("String Returned");
    }

    @Bean("unigue name")
    public String getStringValue()
    {
      return new String("String");
    }

    @Bean
    public List getList()
    {
       return new ArrayList();
    }
}
