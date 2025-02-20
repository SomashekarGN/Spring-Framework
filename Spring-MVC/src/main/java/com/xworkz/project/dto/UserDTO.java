package com.xworkz.project.dto;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDTO {

    private Integer id;

    private String firstName;

    private String lastName;

    private String email;

    private Long phoneNumber;



}
