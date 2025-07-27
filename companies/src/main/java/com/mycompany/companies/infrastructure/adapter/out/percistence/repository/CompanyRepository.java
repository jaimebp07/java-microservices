package com.mycompany.companies.infrastructure.adapter.out.percistence.repository;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.mycompany.companies.domain.model.Company;
import com.mycompany.companies.domain.port.out.CompanyRepositoryPort;
import com.mycompany.companies.infrastructure.adapter.out.percistence.entity.CompanyEntity;
import com.mycompany.companies.infrastructure.adapter.out.percistence.mapper.CompanyEntityMapper;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class CompanyRepository implements CompanyRepositoryPort {

    private CompanyJpaRepository companyJpaRepository;
    private CompanyEntityMapper companyEntityMapper;

    @Override
    public Optional<Company> findByName(String name) {
        //return companyJpaRepository.findByName(name).orElseThrow(() -> new NoSuchElementException("Company not found"));
        throw new UnsupportedOperationException("Unimplemented method 'findByName'");
    }

    @Override
    public Company save(Company company) {
        CompanyEntity companyEntity = companyEntityMapper.toEntity(company);
        return companyEntityMapper.toDomain(companyJpaRepository.save(companyEntity));
    }

    @Override
    public void delete(String name) {
        Company currentCompany = findByName(name).orElseThrow(() -> new NoSuchElementException("Company not found"));
        CompanyEntity companyToDelete = companyEntityMapper.toEntity(currentCompany);
        companyJpaRepository.delete(companyToDelete);
    }

    @Override
    public Company update(Company company, String name) {
        Company currentCompany = findByName(name).orElseThrow(() -> new NoSuchElementException("Company not found"));
        CompanyEntity companyUpdate = companyEntityMapper.toEntity(company);
        CompanyEntity companyToUpdate = companyEntityMapper.toEntity(currentCompany);

        companyToUpdate.setFounder(companyUpdate.getFounder());
        companyToUpdate.setLogo(companyUpdate.getLogo());
        companyToUpdate.setFoundationDate(companyUpdate.getFoundationDate());
        companyToUpdate.setWebSites(companyUpdate.getWebSites());

        return companyEntityMapper.toDomain(companyJpaRepository.save(companyToUpdate));
    }
}
