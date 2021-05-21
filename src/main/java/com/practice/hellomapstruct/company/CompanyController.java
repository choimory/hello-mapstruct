package com.practice.hellomapstruct.company;

import com.practice.hellomapstruct.company.dto.CompanyDto;
import com.practice.hellomapstruct.company.service.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/company")
public class CompanyController {
    private final CompanyService companyService;

    @GetMapping({""})
    public List<CompanyDto> getCompanies(final CompanyDto param, Pageable pageable){
        return companyService.getCompanies(param, pageable);
    }
}
