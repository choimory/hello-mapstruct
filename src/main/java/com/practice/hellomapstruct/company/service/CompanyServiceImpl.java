package com.practice.hellomapstruct.company.service;

import com.practice.hellomapstruct.company.dto.CompanyDto;
import com.practice.hellomapstruct.company.mapper.CompanyMapper;
import com.practice.hellomapstruct.company.repository.CompanyRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CompanyServiceImpl implements CompanyService{
    private final CompanyRepository companyRepository;
    private final CompanyMapper companyMapper;

    @Override
    public List<CompanyDto> getCompanies(CompanyDto param, Pageable pageable) {
        return companyMapper.toDto(companyRepository.findAll(pageable));
    }

    @Override
    public CompanyDto getCompany(CompanyDto param) {
        return companyMapper.toDto(companyRepository.findById(param.getId())
                                                    .orElse(null));
    }
}
