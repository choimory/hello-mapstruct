package com.practice.hellomapstruct.employee;

import com.practice.hellomapstruct.employee.dto.EmployeeDto;
import com.practice.hellomapstruct.employee.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping({"", "/"})
    public List<EmployeeDto> getEmployees(Pageable pageable){
        return employeeService.getEmployees(pageable);
    }

    @GetMapping({"/{employeeId}"})
    public EmployeeDto getEmployee(@PathVariable Long employeeId){
        return employeeService.getEmployee(EmployeeDto.builder()
                                                        .id(employeeId)
                                                        .build());
    }
}
