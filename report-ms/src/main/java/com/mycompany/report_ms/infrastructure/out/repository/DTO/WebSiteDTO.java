package com.mycompany.report_ms.infrastructure.out.repository.DTO;

import com.mycompany.report_ms.domain.model.Category;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WebSiteDTO {

    private String name;
    private Category category;
    private String description;
}
