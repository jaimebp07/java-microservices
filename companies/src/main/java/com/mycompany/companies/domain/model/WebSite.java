package com.mycompany.companies.domain.model;

public class WebSite {

    private String name;
    private Category category;
    private String description;

    public WebSite(String name, Category category, String description) {
        this.name = name;
        this.category = category;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setCategory( Category category){
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }
}
