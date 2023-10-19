package org.example.arutala.rental.buku.model;

//import lombok.Data;
//import lombok.EqualsAndHashCode;
//
//@EqualsAndHashCode(callSuper = true)
//@Data
public class Comic extends BookForLoan{
    private String genre;

    public Comic() {
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Comic{" +
                "genre='" + genre + '\'' +
                '}';
    }

    public Comic(String bookId, String title, String author, Double bookPrice, double bookLoanPrice, int stock, String genre) {
        super(bookId, title, author, bookPrice, bookLoanPrice, stock);
        this.genre = genre;
        calculateBookLoanPrice();
    }

    @Override
    public void calculateBookLoanPrice() {
        double rateStockPercentage = (getStock() < 10) ? 0.05 : 0.03;
        double rateBookType = 0.10;
        setBookLoanPrice((rateBookType+rateStockPercentage)*getBookPrice());
    }
}
