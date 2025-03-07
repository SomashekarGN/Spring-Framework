package com.xworkz.project.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = "com.xworkz.project")
public class SpringConfiguration {

    @Bean
public LocalContainerEntityManagerFactoryBean getlocalContainerEntityManagerFactoryBean()
{
    LocalContainerEntityManagerFactoryBean bean=new LocalContainerEntityManagerFactoryBean();
    bean.setPackagesToScan("com.xworkz.project.entity");
    bean.setDataSource(getDataSource());
    bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
    bean.setJpaProperties(getJpaProperties());
    return bean;
}

@Bean
    public DataSource getDataSource()
{
    DriverManagerDataSource dataSource=new DriverManagerDataSource();
    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    dataSource.setUrl("jdbc:mysql://localhost:3306/ecomm");
    dataSource.setUsername("root");
    dataSource.setPassword("system");
    return dataSource;
}

private Properties getJpaProperties()
{
    Properties pro=new Properties();
    pro.setProperty("hibernate.show_sql","true");
    pro.setProperty("hibernate.hbm2ddl.auto","update");
    return pro;
}


}
