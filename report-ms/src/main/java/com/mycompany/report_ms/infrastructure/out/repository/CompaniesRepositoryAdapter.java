package com.mycompany.report_ms.infrastructure.out.repository;

import java.util.Optional;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.mycompany.report_ms.domain.model.Company;
import com.mycompany.report_ms.domain.port.out.CompaniesRepositoryPort;
import com.mycompany.report_ms.infrastructure.config.LoadBalancerConfiguration;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
@LoadBalancerClient(name = "companies-crud", configuration = LoadBalancerConfiguration.class)
public class CompaniesRepositoryAdapter implements CompaniesRepositoryPort {

    private final CompaniesFeignClient companiesFeignClient;

    @Override
    @GetMapping(path = "/companies-crud/company/(name}")
    public Optional<Company> getByName(String name) {
         return this.companiesFeignClient.getByName(name);
    }
}
