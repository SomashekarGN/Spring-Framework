package com.xworkz.project.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CountryDTO {

    private Integer id;
    private String name;
    private Integer noOfState;
    private Long population;
}
