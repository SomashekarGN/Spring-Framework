package com.xworkz.project.repository;

import com.xworkz.project.entity.UserEntity;

import java.util.Collections;
import java.util.List;

public class UserRepositoryImpl implements UserRepository{
    @Override
    public boolean saveUser(UserEntity entity) {
        return false;
    }

    @Override
    public List<UserEntity> getAllUser() {
        return Collections.emptyList();
    }

    @Override
    public void deleteById(int id) {

    }
}
