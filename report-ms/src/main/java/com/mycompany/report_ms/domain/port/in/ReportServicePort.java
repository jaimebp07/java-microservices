package com.mycompany.report_ms.domain.port.in;

public interface ReportServicePort {

    String makeReport(String name);
    String saveReport(String nameReport);
    void deleteReport(String name);
    
}
