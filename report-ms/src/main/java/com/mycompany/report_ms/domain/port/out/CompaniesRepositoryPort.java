package com.mycompany.report_ms.domain.port.out;

import java.util.Optional;

import com.mycompany.report_ms.domain.model.Company;

public interface CompaniesRepositoryPort {

    Optional<Company> getByName(String name);
}
