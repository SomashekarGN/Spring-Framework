package com.xworkz.project.repository;

import com.xworkz.project.entity.CountryEntity;
import org.springframework.stereotype.Component;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Component
public class CountryRepoImpl implements CountyRepo{
    @Override
    public boolean save(CountryEntity entity) {
         EntityManagerFactory emf= Persistence.createEntityManagerFactory("abc");
         EntityManager entityManager=emf.createEntityManager();
        System.out.println("Somshekar"+entity);

        try {
            if(entity!=null)
            {
                entityManager.getTransaction().begin();
                entityManager.persist(entity);
                entityManager.getTransaction().commit();
                return true;
            }
            return false;
        } catch (Exception e) {
            System.out.println("Error");
            return false;
        } finally {
            entityManager.close();
            emf.close();
        }
    }
}
