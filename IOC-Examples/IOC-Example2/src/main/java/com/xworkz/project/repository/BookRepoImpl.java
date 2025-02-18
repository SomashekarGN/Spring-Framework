package com.xworkz.project.repository;

import com.xworkz.project.entity.BookEntity;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Component
public class BookRepoImpl implements BookRepo{


    EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyUnit");
    EntityManager manager=emf.createEntityManager();
    @Override
    public boolean save(BookEntity entity) {
        try {
            if(entity!=null)
            {
                manager.getTransaction().begin();
                manager.persist(entity);
                manager.getTransaction().commit();
                return true;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            manager.getTransaction().rollback();

        } finally {
            manager.close();
            emf.close();
        }

        return false;
    }

    @Override
    public BookEntity getById(int id) {
        manager.getTransaction().begin();
        BookEntity bookEntity=manager.find(BookEntity.class,3);
        return bookEntity;
    }
}
