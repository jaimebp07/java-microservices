package com.mycompany.report_ms.aplication.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mycompany.report_ms.domain.model.Company;
import com.mycompany.report_ms.domain.port.in.ReportServicePort;
import com.mycompany.report_ms.domain.port.out.CompaniesRepositoryPort;
import com.mycompany.report_ms.infrastructure.helpers.ReportHelper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ReportService implements ReportServicePort{

    private final CompaniesRepositoryPort companiesRepositoryPort;
    private final ReportHelper reportHelper;

    @Override
    public String makeReport(String name) {
        Optional<Company> companyService = this.companiesRepositoryPort.getByName(name);
        return reportHelper.readTemplate(companyService.get());
    }

    @Override
    public String saveReport(String nameReport) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveReport'");
    }

    @Override
    public void deleteReport(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteReport'");
    }

}
