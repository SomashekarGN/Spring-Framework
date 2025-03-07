package com.xworkz.project.service;

import com.xworkz.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository repo;
    @Override
    public void ValidateAndSave() {

    }
}
