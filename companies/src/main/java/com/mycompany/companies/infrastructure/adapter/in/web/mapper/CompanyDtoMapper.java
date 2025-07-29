package com.mycompany.companies.infrastructure.adapter.in.web.mapper;

import org.mapstruct.Mapper;

import com.mycompany.companies.domain.model.Company;
import com.mycompany.companies.infrastructure.adapter.in.web.DTO.CompanyDTO;

@Mapper(componentModel = "spring", uses = { WebSiteDtoMapper.class })
public interface CompanyDtoMapper {

    CompanyDTO toDTO(Company company);

    Company toDomain(CompanyDTO companyEntity);
}
