package com.xworkz.project.controller;


import com.xworkz.project.dto.UserDTO;
import com.xworkz.project.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Component
public class UserController {


    UserService userservice;

    public UserController() {
        System.out.println("UserController Object Selected...!");
    }

    public String addUser(UserDTO dto)
    {
        userservice.validateAndSave(dto);
        return "response.jsp";
    }
}
