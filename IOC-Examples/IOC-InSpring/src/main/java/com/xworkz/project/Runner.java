package com.xworkz.project;

import com.xworkz.project.dto.CountryDTO;
import com.xworkz.project.service.CountryService;
import com.xworkz.project.springonfig.ConfiguationFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ConfiguationFile.class);
        CountryService countryService=applicationContext.getBean(CountryService.class);

        CountryDTO countryDTO=new CountryDTO();
        //countryDTO.setId(null);
        countryDTO.setName("India");
        countryDTO.setNoOfState(29);
        countryDTO.setPopulation(14000000L);

        CountryDTO countryDTO1=new CountryDTO();
        countryDTO1.setName("Srilanka");
        countryDTO1.setNoOfState(9);
        countryDTO1.setPopulation(500000l);
        countryService.validateAndSave(countryDTO1);
    }
}
