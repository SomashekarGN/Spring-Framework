package com.xworkz.project.dto;


import lombok.*;

@Data
@ToString
public class UserDTO {

    private Integer userId;
    private  String userName;
    private String userLocation;
    private String email;
    private Long phNumber;
    private String password;
    private String reEnterPassword;

}
