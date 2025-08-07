package com.mycompany.report_ms.infrastructure.out.repository;

import java.util.Optional;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.stereotype.Component;

import com.mycompany.report_ms.domain.model.Company;
import com.mycompany.report_ms.domain.port.out.CompaniesRepositoryPort;
import com.mycompany.report_ms.infrastructure.config.LoadBalancerConfiguration;
import com.mycompany.report_ms.infrastructure.out.repository.mapper.CompanyDtoMapper;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
@LoadBalancerClient(name = "companies", configuration = LoadBalancerConfiguration.class)
public class CompaniesRepositoryAdapter implements CompaniesRepositoryPort {

    private final CompaniesFeignClient companiesFeignClient;
    private final CompanyDtoMapper companyDtoMapper;

    @Override
    public Optional<Company> getByName(String name) {

        return this.companiesFeignClient.getByName(name).map(companyDtoMapper::toDomain);
    }
}
