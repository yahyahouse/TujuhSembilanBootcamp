package org.example.arutala.gramedia.model.buku;

import org.example.arutala.gramedia.model.Publisher;
import org.example.arutala.gramedia.model.penulis.Mangaka;

import java.util.List;

public class Comic extends Book {


    private Boolean volumeSeries;
    private double tax;

    public Comic() {

    }

    public Boolean getVolumeSeries() {
        return volumeSeries;
    }

    public void setVolumeSeries(Boolean volumeSeries) {
        this.volumeSeries = volumeSeries;
    }

    public double getTax() {
        return tax ;
    }

    public void setTax(double tax) {
        this.tax=tax;
    }

    public Comic(String bookCode, String title, Mangaka author, Publisher publisher, double price, Boolean volumeSeries, double tax) {
        super(bookCode, title, author, publisher, price);
        this.volumeSeries = volumeSeries;
        this.tax = tax;
    }


    @Override
    public String toString() {
        return "Comic{" +
                "volumeSeries=" + volumeSeries +
                ", tax=" + tax + "," +
                super.toString() + "}";
    }
    public void calculateTax(Comic comic){
        setTax(comic.getPrice()*0.05);
    }
    @Override
    public void calculatePrice() {
        Mangaka mangaka = (Mangaka) getAuthor();
        boolean isVolumeSeries = getVolumeSeries();
        String rating = mangaka.getRating();

        if ("New Comer".equals(rating)) {
            if (isVolumeSeries) {
                setPrice(getPublisher().getProductionCost() * 1.35);
            } else {
                setPrice(getPublisher().getProductionCost() * 1.25);
            }
        } else if ("Good".equals(rating)) {
            if (isVolumeSeries) {
                setPrice(getPublisher().getProductionCost() * 1.45);
            } else {
                setPrice(getPublisher().getProductionCost() * 1.30);
            }
        } else if ("Best Seller".equals(rating)) {
            if (isVolumeSeries) {
                setPrice(getPublisher().getProductionCost() * 1.50);
            } else {
                setPrice(getPublisher().getProductionCost() * 1.40);
            }
        }
    }

}


