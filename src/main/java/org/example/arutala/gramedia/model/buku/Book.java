package org.example.arutala.gramedia.model.buku;

import org.example.arutala.gramedia.model.PriceBookInterface;
import org.example.arutala.gramedia.model.Publisher;
import org.example.arutala.gramedia.model.penulis.DataPenulis;


public abstract class Book implements PriceBookInterface {
    private String bookCode;
    private String title;
    private DataPenulis dataPenulis;
    private Publisher publisher;
    private double price;

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public DataPenulis getAuthor() {
        return dataPenulis;
    }

    public void setAuthor(DataPenulis dataPenulis) {
        this.dataPenulis = dataPenulis;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book(String bookCode, String title, DataPenulis dataPenulis, Publisher publisher, double price) {
        this.bookCode = bookCode;
        this.title = title;
        this.dataPenulis = dataPenulis;
        this.publisher = publisher;
        this.price = price;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "EBook{" +
                "bookCode='" + bookCode + '\'' +
                ", title='" + title + '\'' +
                ", author=" + dataPenulis +
                ", publisher=" + publisher +
                ", price=" + price +
                '}';
    }

}
