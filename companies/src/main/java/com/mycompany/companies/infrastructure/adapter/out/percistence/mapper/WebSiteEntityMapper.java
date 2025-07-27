package com.mycompany.companies.infrastructure.adapter.out.percistence.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.mycompany.companies.domain.model.WebSite;
import com.mycompany.companies.infrastructure.adapter.out.percistence.entity.WebSiteEntity;

@Mapper(componentModel = "spring")
public interface WebSiteEntityMapper {

    WebSiteEntityMapper INSTANCE = Mappers.getMapper(WebSiteEntityMapper.class);

    @Mapping(target = "id", ignore = true) // Same as CompanyEntity, id is generated
    WebSiteEntity toEntity(WebSite webSite);

    WebSite toDomain(WebSiteEntity webSiteEntity);
}
