package com.mycompany.companies.domain.port.in;

import com.mycompany.companies.domain.model.Company;

public interface ServicePort {

    Company create(Company company);
    Company readByName(String name);
    Company update(Company company, String name);
    void delete(String name);
}
