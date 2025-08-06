package com.mycompany.report_ms.infrastructure.in.web;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.report_ms.domain.port.in.ReportServicePort;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping(path = "report")
@AllArgsConstructor
public class ReportController {

    private final ReportServicePort reportService;

    @GetMapping( path = "{name}" )
    public ResponseEntity<Map<String, String>> makeReport(@PathVariable("name") String name){
        Map<String, String> report = Map.of("report",this.reportService.makeReport(name));
        return ResponseEntity.ok(report);
    }
}
