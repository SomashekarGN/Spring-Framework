package com.xworkz.project.service;

import com.xworkz.project.dto.UserDTO;
import com.xworkz.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userrepo;
    @Override
    public boolean validateAndSave(UserDTO dto) {

        return false;
    }

    @Override
    public List<UserDTO> getAllUser() {
        return Collections.emptyList();
    }

    @Override
    public void deleteUserById(int id) {

    }
}
