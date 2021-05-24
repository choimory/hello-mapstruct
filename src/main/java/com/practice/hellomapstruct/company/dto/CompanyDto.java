package com.practice.hellomapstruct.company.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.practice.hellomapstruct.employee.dto.EmployeeDto;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDto {
    private Long id;
    private String name;
    private String description;
    private String businessType;
    private String address;
    private LocalDateTime foundationDateTime;
    private List<EmployeeDto> employees;
}
