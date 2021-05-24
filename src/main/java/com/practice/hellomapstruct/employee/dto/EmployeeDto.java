package com.practice.hellomapstruct.employee.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.practice.hellomapstruct.company.dto.CompanyDto;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private Long id;
    private String name;
    private String genderType;
    private LocalDateTime birthDateTime;
    //private CompanyDto company;
}
