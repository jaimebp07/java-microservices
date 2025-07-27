package com.mycompany.companies.domain.port.out;

import java.util.Optional;

import com.mycompany.companies.domain.model.Company;

public interface CompanyRepositoryPort {

    Optional<Company> findByName(String name);

    Company save(Company company);

    void delete(String name);

    Company update(Company company, String name);
    
}
