package com.mycompany.companies.infrastructure.adapter.in.web.DTO;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mycompany.companies.domain.model.WebSite;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyDTO {

    private String name;
    private String founder;
    private String logo;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate foundationDate;
    private List<WebSite> webSites;

}
