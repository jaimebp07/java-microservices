package com.mycompany.report_ms.domain.model;

import java.time.LocalDate;
import java.util.List;


public class Company {

    private String name;
    private String founder;
    private String logo;
    private LocalDate foundationDate;
    private List<WebSite> webSites;

    public Company(){}
    
    public Company(String name, String founder, String logo, LocalDate foundationDate, List<WebSite> webSites) {
        this.name = name;
        this.founder = founder;
        this.logo = logo;
        this.foundationDate = foundationDate;
        this.webSites = webSites;
    }

    public String getName() {
        return name;
    }

    public void  setName(String name){
        this.name = name;
    }

    public String getFounder() {
        return founder;
    }

    public void  setFounder(String founder){
        this.founder = founder;
    }

    public String getLogo() {
        return logo;
    }

    public void  setLogo(String logo){
        this.logo = logo;
    }

    public LocalDate getFoundationDate() {
        return foundationDate;
    }

    public void  setFoundationDate(LocalDate foundationDate){
        this.foundationDate = foundationDate;
    }

    public List<WebSite> getWebSites() {
        return webSites;
    }

    public void  setWebSites(List<WebSite> webSites){
        this.webSites = webSites;
    }
}
