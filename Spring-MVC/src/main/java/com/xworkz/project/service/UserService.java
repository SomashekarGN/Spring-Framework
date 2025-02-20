package com.xworkz.project.service;

import com.xworkz.project.dto.UserDTO;

public interface UserService {
    void validateAndSave(UserDTO dto);
}
