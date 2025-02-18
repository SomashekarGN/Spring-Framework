package com.xworkz.project.service;

import com.xworkz.project.dto.BookDTO;

public interface BookService {

     void validateAndSave(BookDTO dto);

     void getById(int id);
}
