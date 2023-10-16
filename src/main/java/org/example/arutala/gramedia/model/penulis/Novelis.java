package org.example.arutala.gramedia.model.penulis;

public class Novelis extends DataPenulis {
    private Boolean serial;
    private String rating;

    public Boolean getSerial() {
        return serial;
    }

    public void setSerial(Boolean serial) {
        this.serial = serial;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Novelis() {
    }

    public Novelis(String firstName, String lastName, String country, Integer age, Boolean serial, String rating) {
        super(firstName, lastName, country, age);
        this.serial = serial;
        this.rating = rating;
    }

}

