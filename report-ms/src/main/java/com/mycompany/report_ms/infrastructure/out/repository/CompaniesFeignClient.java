package com.mycompany.report_ms.infrastructure.out.repository;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mycompany.report_ms.infrastructure.out.repository.DTO.CompanyDTO;

@FeignClient(name = "companies")
public interface CompaniesFeignClient {

    @GetMapping(path = "/companies-crud/company/{name}")
    Optional<CompanyDTO> getByName(@PathVariable("name") String name);

}
