package com.xworkz.project.service;

import com.xworkz.project.dto.BookDTO;
import com.xworkz.project.entity.BookEntity;
import com.xworkz.project.repository.BookRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookServiceImpl implements BookService{

    @Autowired
    BookRepo bookRepo;

    @Override
    public void validateAndSave(BookDTO dto) {

        BookEntity entity=new BookEntity();
        BeanUtils.copyProperties(dto,entity);
        bookRepo.save(entity);

    }

    @Override
    public void getById(int id) {

        BookEntity entity=bookRepo.getById(id);
        if (entity!=null)
        {
            System.out.println(entity);
            System.out.println("Entity exsisted. fetch successfull...!");
        }
        else{
            System.out.println("No data found for the provided id");
        }

    }
}
