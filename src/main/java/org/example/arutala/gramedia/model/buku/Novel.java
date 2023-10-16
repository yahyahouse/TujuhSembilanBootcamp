package org.example.arutala.gramedia.model.buku;

import org.example.arutala.gramedia.model.Publisher;
import org.example.arutala.gramedia.model.penulis.Mangaka;
import org.example.arutala.gramedia.model.penulis.Novelis;

public class Novel extends Book {
    private String genre;

    public Novel() {

    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Novel(String bookCode, String title, Novelis author, Publisher publisher, double price, String genre) {
        super(bookCode, title, author, publisher, price);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "genre=" + genre + "," +
                super.toString() + "}";
    }

    @Override
    public void calculatePrice() {
        Novelis novelis = (Novelis) getAuthor();
        String rating = novelis.getRating();
        if ("New Comer".equals(rating)) {
            setPrice(getPublisher().getProductionCost() * 1.25);
        } else if ("Good".equals(rating)) {
            setPrice(getPublisher().getProductionCost() * 1.35);
        } else if ("Best Seller".equals(rating)) {
            setPrice(getPublisher().getProductionCost() * 1.50);

        }
    }
}
