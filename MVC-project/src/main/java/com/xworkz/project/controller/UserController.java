package com.xworkz.project.controller;


import com.xworkz.project.dto.UserDTO;
import com.xworkz.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/")
@Component
public class UserController {

    @Autowired
    UserService userservice;

    public UserController() {
        System.out.println("UserController Object Selected...!");
    }

    @RequestMapping("addUser")
    public String addUser(UserDTO dto, Model model) {
        userservice.validateAndSave(dto);
        model.addAttribute("name", dto.getFirstName());
        return "response.jsp";
    }


    @RequestMapping("fetchUser")
    public String fetchUserById(@RequestParam("userId") String id, Model model) {
        UserDTO dto = userservice.getUserById(Integer.parseInt(id));
        model.addAttribute("user", dto);
        return "updateuser.jsp";

    }

    public String updateUser(UserDTO dto,Model model)
    {
       boolean userUpdated=userservice.updateUser(dto);
       if(userUpdated)
       {
           model.addAttribute("msg","User Data Updated Successfull...");
       }
       else {
           model.addAttribute("msg","User Data Update Failed...!");

       }
       return "updateuser.jsp";
    }

}
