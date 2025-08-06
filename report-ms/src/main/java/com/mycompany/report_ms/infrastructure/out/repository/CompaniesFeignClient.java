package com.mycompany.report_ms.infrastructure.out.repository;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mycompany.report_ms.domain.model.Company;

@FeignClient(name = "companies-crud")
public interface CompaniesFeignClient {

    @GetMapping(path = "/company/{name}")
    Optional<Company> getByName(@PathVariable("name") String name);

}
