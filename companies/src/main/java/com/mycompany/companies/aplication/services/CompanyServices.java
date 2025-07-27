package com.mycompany.companies.aplication.services;

import java.util.NoSuchElementException;
import java.util.Objects;

import org.springframework.stereotype.Service;

import com.mycompany.companies.domain.model.Category;
import com.mycompany.companies.domain.model.Company;
import com.mycompany.companies.domain.port.in.ServicePort;
import com.mycompany.companies.domain.port.out.CompanyRepositoryPort;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CompanyServices implements ServicePort {

    private final CompanyRepositoryPort companyRepositoryPort;

    @Override
    public Company create(Company company) {
        company.getWebSites().forEach(webSite -> {
            if (Objects.isNull(webSite.getCategory())) {
                webSite.setCategory(Category.NONE);
            }
        });
        return companyRepositoryPort.save(company);
    }
    
    @Override
    public Company readByName(String name) {
        return companyRepositoryPort.findByName(name).orElseThrow(() -> new NoSuchElementException("Company not found"));
    }

    @Override
    public Company update(Company company, String name) {
        return companyRepositoryPort.update(company, name);
    }

    @Override
    public void delete(String name) {
        companyRepositoryPort.delete(name);
    }
}
