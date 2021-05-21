package com.practice.hellomapstruct.company.service;

import com.practice.hellomapstruct.company.dto.CompanyDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CompanyService {
    List<CompanyDto> getCompanies(CompanyDto param, Pageable pageable);
    CompanyDto getCompany(CompanyDto param);
}
