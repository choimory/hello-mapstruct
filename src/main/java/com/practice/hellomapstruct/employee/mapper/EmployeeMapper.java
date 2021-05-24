package com.practice.hellomapstruct.employee.mapper;

import com.practice.hellomapstruct.employee.dto.EmployeeDto;
import com.practice.hellomapstruct.employee.entity.Employee;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface EmployeeMapper {
    EmployeeDto toDto(Employee entity);
    List<EmployeeDto> toDto(List<Employee> entityList);
    List<EmployeeDto> toDto(Page<Employee> entityList);

    Employee toEntity(EmployeeDto dto);
    List<Employee> toEntity(List<EmployeeDto> dtoList);
    List<Employee> toEntity(Page<EmployeeDto> dtoList);
}
