package com.practice.hellomapstruct.employee.service;

import com.practice.hellomapstruct.employee.dto.EmployeeDto;
import com.practice.hellomapstruct.employee.mapper.EmployeeMapper;
import com.practice.hellomapstruct.employee.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    @Override
    public List<EmployeeDto> getEmployees(Pageable pageable) {
        return employeeMapper.toDto(employeeRepository.findAll(pageable));
    }

    @Override
    public EmployeeDto getEmployee(EmployeeDto param) {
        return employeeMapper.toDto(employeeRepository.findById(param.getId())
                                                        .orElse(null));
    }
}
