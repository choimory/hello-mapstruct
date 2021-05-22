package com.practice.hellomapstruct.company.mapper;

import com.practice.hellomapstruct.company.dto.CompanyDto;
import com.practice.hellomapstruct.company.entity.Company;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
@Component
public interface CompanyMapper {
    CompanyDto toDto(Company entity);
    List<CompanyDto> toDto(List<Company> entityList);
    List<CompanyDto> toDto(Page<Company> entityList);

    Company toEntity(CompanyDto dto);
    List<Company> toEntity(List<CompanyDto> dtoList);
    List<Company> toEntity(Page<CompanyDto> dtoList);
}
