package org.example.arutala.gramedia.model;

import org.example.arutala.gramedia.model.buku.EBook;
import org.example.arutala.gramedia.model.penulis.DataPenulis;

public abstract class CommercialBook {
    private EBook EBookCode;
    private EBook title;
    private DataPenulis firstName;
    private DataPenulis lastName;

    public EBook getBookCode() {
        return EBookCode;
    }

    public void setBookCode(EBook EBookCode) {
        this.EBookCode = EBookCode;
    }

    public EBook getTitle() {
        return title;
    }

    public void setTitle(EBook title) {
        this.title = title;
    }

    public DataPenulis getFirstName() {
        return firstName;
    }

    public void setFirstName(DataPenulis firstName) {
        this.firstName = firstName;
    }

    public DataPenulis getLastName() {
        return lastName;
    }

    public void setLastName(DataPenulis lastName) {
        this.lastName = lastName;
    }

    public CommercialBook(EBook EBookCode, EBook title, DataPenulis firstName, DataPenulis lastName) {
        this.EBookCode = EBookCode;
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
