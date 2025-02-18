package com.xworkz.project.repository;

import com.xworkz.project.entity.BookEntity;

public interface BookRepo {

     boolean save(BookEntity entity);

    BookEntity getById(int id);
}
