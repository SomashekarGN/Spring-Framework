package com.xworkz.project.repository;

import com.xworkz.project.entity.UserEntity;

public interface UserRepository {

    boolean save(UserEntity entity);
}
