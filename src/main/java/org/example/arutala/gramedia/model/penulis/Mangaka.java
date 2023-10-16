package org.example.arutala.gramedia.model.penulis;

public class Mangaka extends DataPenulis {

    private String rating;

    public Mangaka() {

    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Mangaka(String firstName, String lastName, String country, Integer age, String rating) {
        super(firstName, lastName, country, age);
        this.rating = rating;
    }
}
