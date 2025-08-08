package com.mycompany.report_ms.infrastructure.out.repository.mapper;

import org.mapstruct.Mapper;

import com.mycompany.report_ms.domain.model.Company;
import com.mycompany.report_ms.infrastructure.out.repository.DTO.CompanyDTO;

@Mapper(componentModel = "spring", uses = { WebSiteDtoMapper.class })
public interface CompanyDtoMapper {

    CompanyDTO toDTO(Company company);

    Company toDomain(CompanyDTO companyDTO);
}
