package com.mycompany.report_ms.infrastructure.helpers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation. Value;
import org.springframework.stereotype.Component;

import com.mycompany.report_ms.domain.model.Company;

@Component
@Slf4j
public class ReportHelper {

    @Value("${report.template}")
    private String reportTemplate;

    public String readTemplate(Company company) {
        return this.reportTemplate
            .replace("{company}", company.getName())
            .replace("{foundation_date}", company.getFoundationDate().toString())
            .replace("{founder}", company.getFounder())
            .replace("{web_sites}", company.getWebSites().toString());
    }
}