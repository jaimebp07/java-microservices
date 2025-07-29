package com.mycompany.companies.infrastructure.adapter.in.web.DTO;

import com.mycompany.companies.domain.model.Category;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WebSiteDTO {

    private String name;
    private Category category;
    private String description;
}
