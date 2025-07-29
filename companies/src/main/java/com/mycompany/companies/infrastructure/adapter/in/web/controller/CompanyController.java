package com.mycompany.companies.infrastructure.adapter.in.web.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.companies.domain.model.Company;
import com.mycompany.companies.domain.port.in.ServicePort;
import com.mycompany.companies.infrastructure.adapter.in.web.DTO.CompanyDTO;
import com.mycompany.companies.infrastructure.adapter.in.web.mapper.CompanyDtoMapper;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = "company")
@AllArgsConstructor
@Slf4j
@Tag(name = "Companies resource")
public class CompanyController {

    private final ServicePort companyService;
    private final CompanyDtoMapper companyDtoMapper;

    @Operation(summary = "get a company given a company name")
    @GetMapping(path = "{name}")
    public ResponseEntity<CompanyDTO> get(@PathVariable String name) {
        log.info("GET: company ()", name);
        return ResponseEntity.ok(companyDtoMapper.toDTO(this.companyService.readByName(name)));
    }

    @Operation(summary = "Save in DB h company given a company from body")
    @PostMapping
    public ResponseEntity<CompanyDTO> post(@RequestBody CompanyDTO companyDTO) {
        log.info("Post: company ()", companyDTO.getName());
        return ResponseEntity.created(URI.create(this.companyService.create(companyDtoMapper.toDomain(companyDTO)).getName())).build();
    }

    @Operation(summary = "update in DB a company given a company from body")
    @PutMapping(path = "{name}")
    public ResponseEntity<CompanyDTO> put(@RequestBody CompanyDTO companyDTO, @PathVariable String name) {
        log.info("PUT: company ({})", name);
        Company company = this.companyService.update(companyDtoMapper.toDomain(companyDTO), name);
        return ResponseEntity.ok(companyDtoMapper.toDTO(company));
    }

    @Operation(summary = "delete in DB a company given a company name")
    @DeleteMapping(path ="{name}")
    public ResponseEntity <? > delete(@PathVariable String name) {
        log.info("DELETE: company ()", name);
        this.companyService.delete(name);
        return ResponseEntity.noContent().build();
    }
}
