package com.xworkz.project.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "user_details")
public class UserEntity {

    private Integer userId;
    private  String userName;
    private String userLocation;
    private String email;
    private Long phNumber;

}
