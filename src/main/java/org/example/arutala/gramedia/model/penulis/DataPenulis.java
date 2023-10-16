package org.example.arutala.gramedia.model.penulis;

public abstract class DataPenulis {
    private String firstName;
    private String lastName;
    private String country;
    private Integer age;

    public DataPenulis() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getcountry() {
        return country;
    }

    public void setcountry(String country) {
        this.country = country;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public DataPenulis(String firstName, String lastName, String country, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.age = age;
    }
    public String getFullName(){
        return firstName+" "+lastName;
    }

}
