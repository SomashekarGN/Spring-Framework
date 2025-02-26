package com.xworkz.project.controller;


import com.xworkz.project.dto.UserDTO;
import com.xworkz.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Component
public class UserController {

    @Autowired
    UserService userservice;

    public UserController() {
        System.out.println("UserController Object Selected...!");
    }

    @RequestMapping("addUser")
    public String addUser(UserDTO dto, Model model)
    {
        userservice.validateAndSave(dto);
        model.addAttribute("name",dto.getFirstName());
        return "response.jsp";
    }
}
