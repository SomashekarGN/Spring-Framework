package com.xworkz.project.service;

import com.xworkz.project.dto.UserDTO;

import java.util.List;

public interface UserService {

    boolean validateAndSave(UserDTO dto);

    List<UserDTO> getAllUser();

    void deleteUserById(int id);

    boolean updateUser(UserDTO dto);

    UserDTO getUserById(int id);
}
