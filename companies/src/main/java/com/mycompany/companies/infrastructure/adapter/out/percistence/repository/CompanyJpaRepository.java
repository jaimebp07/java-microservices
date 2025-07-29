package com.mycompany.companies.infrastructure.adapter.out.percistence.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.companies.infrastructure.adapter.out.percistence.entity.CompanyEntity;

public interface CompanyJpaRepository extends JpaRepository<CompanyEntity, Long> {
    Optional<CompanyEntity> findByName(String name);
}
