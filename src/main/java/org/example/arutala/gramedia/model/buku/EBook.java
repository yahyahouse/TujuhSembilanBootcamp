package org.example.arutala.gramedia.model.buku;

import org.example.arutala.gramedia.model.Publisher;
import org.example.arutala.gramedia.model.penulis.Author;
import org.example.arutala.gramedia.model.penulis.DataPenulis;

public class EBook extends Book {

    public EBook(String bookCode, String title, DataPenulis dataPenulis, Publisher publisher, double price) {
        super(bookCode, title, dataPenulis, publisher, price);
    }

    public EBook() {

    }


    @Override
    public void calculatePrice() {
        setPrice(getPublisher().getProductionCost()*1.25);
    }
}
