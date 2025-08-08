package com.mycompany.report_ms.infrastructure.out.repository;

import java.util.Optional;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.stereotype.Repository;

import com.mycompany.report_ms.domain.model.Company;
import com.mycompany.report_ms.domain.port.out.CompaniesRepositoryPort;
import com.mycompany.report_ms.infrastructure.config.LoadBalancerConfiguration;
import com.mycompany.report_ms.infrastructure.out.repository.DTO.CompanyDTO;
import com.mycompany.report_ms.infrastructure.out.repository.mapper.CompanyDtoMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
@LoadBalancerClient(name = "companies", configuration = LoadBalancerConfiguration.class)
public class CompaniesRepositoryAdapter implements CompaniesRepositoryPort {

    private final CompaniesFeignClient companiesFeignClient;
    private final CompanyDtoMapper companyDtoMapper;

    @Override
    public Optional<Company> getByName(String name) {
        Optional<CompanyDTO> companyDtoOptional = companiesFeignClient.getByName(name);
        return companyDtoOptional.map(companyDtoMapper::toDomain);
    }
}
