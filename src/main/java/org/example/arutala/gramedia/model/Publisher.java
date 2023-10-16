package org.example.arutala.gramedia.model;

public class Publisher {
    private String publisherName;
    private String country;
    private Double productionCost;

    public Publisher() {

    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(Double productionCost) {
        this.productionCost = productionCost;
    }

    public Publisher(String publisherName, String country, Double productionCost) {
        this.publisherName = publisherName;
        this.country = country;
        this.productionCost = productionCost;
    }

}
