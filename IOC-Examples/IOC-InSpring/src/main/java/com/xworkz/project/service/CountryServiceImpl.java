package com.xworkz.project.service;

import com.xworkz.project.dto.CountryDTO;
import com.xworkz.project.entity.CountryEntity;
import com.xworkz.project.repository.CountyRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CountryServiceImpl implements CountryService{

    @Autowired
    CountyRepo countyRepo;

    @Override
    public void validateAndSave(CountryDTO dto) {
        CountryEntity entity=new CountryEntity();
        BeanUtils.copyProperties(dto,entity);
        countyRepo.save(entity);
    }
}
