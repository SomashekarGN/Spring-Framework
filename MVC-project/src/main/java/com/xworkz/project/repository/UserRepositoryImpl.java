package com.xworkz.project.repository;

import com.xworkz.project.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository{

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public boolean saveUser(UserEntity entity) {
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public List<UserEntity> getAllUser() {
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        System.out.println(entityManager.createNamedQuery("getAllUser").getResultList());
        return entityManager.createNamedQuery("getAllUser").getResultList();
    }

    @Override
    public void deleteById(int id) {
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.createNamedQuery("deleteUserbyId").setParameter("id",id).executeUpdate();
        entityManager.getTransaction().commit();

    }
}
