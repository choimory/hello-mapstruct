package com.practice.hellomapstruct.company.mapper;

import com.practice.hellomapstruct.company.dto.CompanyDto;
import com.practice.hellomapstruct.company.entity.Company;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface CompanyMapper {
    CompanyDto toDto(Company entity);
    List<CompanyDto> toDto(List<Company> entityList);
    List<CompanyDto> toDto(Page<Company> entityList);
}
