package com.xworkz.project.repository;

import com.xworkz.project.entity.UserEntity;

import java.util.List;

public interface UserRepository {

    boolean saveUser(UserEntity entity);

    List<UserEntity> getAllUser();

    void deleteById(int id);

}
