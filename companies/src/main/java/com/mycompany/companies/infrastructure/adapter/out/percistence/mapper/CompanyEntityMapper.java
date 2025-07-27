package com.mycompany.companies.infrastructure.adapter.out.percistence.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.mycompany.companies.domain.model.Company;
import com.mycompany.companies.infrastructure.adapter.out.percistence.entity.CompanyEntity;

@Mapper(componentModel = "spring", uses = { WebSiteEntityMapper.class })
public interface CompanyEntityMapper {

    CompanyEntityMapper INSTANCE = Mappers.getMapper(CompanyEntityMapper.class);

    @Mapping(target = "id", ignore = true)
    CompanyEntity toEntity(Company company);

    Company toDomain(CompanyEntity companyEntity);

}
