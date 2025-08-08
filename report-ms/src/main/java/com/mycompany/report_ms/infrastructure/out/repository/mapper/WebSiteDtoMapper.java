package com.mycompany.report_ms.infrastructure.out.repository.mapper;

import org.mapstruct.Mapper;

import com.mycompany.report_ms.domain.model.WebSite;
import com.mycompany.report_ms.infrastructure.out.repository.DTO.WebSiteDTO;

@Mapper(componentModel = "spring")
public interface WebSiteDtoMapper {

    WebSiteDTO toEntity(WebSite webSite);

    WebSite toDomain(WebSiteDTO webSiteDTO);
}