package com.mycompany.companies.infrastructure.adapter.in.web.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mycompany.companies.domain.model.WebSite;
import com.mycompany.companies.infrastructure.adapter.in.web.DTO.WebSiteDTO;

@Mapper(componentModel = "spring")
public interface WebSiteDtoMapper {

    WebSiteDtoMapper INSTANCE = Mappers.getMapper(WebSiteDtoMapper.class);

    WebSiteDTO toEntity(WebSite webSite);

    WebSite toDomain(WebSiteDTO webSiteEntity);
}
