package com.xworkz.project.service;

import com.xworkz.project.dto.UserDTO;

import java.util.Collections;
import java.util.List;

public class UserServiceImpl implements UserService{
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
