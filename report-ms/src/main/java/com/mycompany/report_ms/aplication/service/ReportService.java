package com.mycompany.report_ms.aplication.service;

import org.springframework.stereotype.Service;

import com.mycompany.report_ms.domain.port.in.ReportServicePort;
import com.mycompany.report_ms.domain.port.out.CompaniesRepositoryPort;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ReportService implements ReportServicePort{

    private final CompaniesRepositoryPort companiesRepositoryPort;

    @Override
    public String makeReport(String name) {
        return this.companiesRepositoryPort.getByName(name).orElseThrow().getName();
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
