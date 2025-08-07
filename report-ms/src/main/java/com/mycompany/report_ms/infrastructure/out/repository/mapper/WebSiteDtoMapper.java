package com.mycompany.report_ms.infrastructure.out.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mycompany.report_ms.domain.model.WebSite;
import com.mycompany.report_ms.infrastructure.out.repository.DTO.WebSiteDTO;

@Mapper(componentModel = "spring")
public interface WebSiteDtoMapper {

    WebSiteDtoMapper INSTANCE = Mappers.getMapper(WebSiteDtoMapper.class);

    WebSiteDTO toEntity(WebSite webSite);

    WebSite toDomain(WebSiteDTO webSiteEntity);
}