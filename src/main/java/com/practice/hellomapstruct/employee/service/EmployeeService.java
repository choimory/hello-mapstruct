package com.practice.hellomapstruct.employee.service;

import com.practice.hellomapstruct.employee.dto.EmployeeDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDto> getEmployees(Pageable pageable);
    EmployeeDto getEmployee(EmployeeDto param);
}
