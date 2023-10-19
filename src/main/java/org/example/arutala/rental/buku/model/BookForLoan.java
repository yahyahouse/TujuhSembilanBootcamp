package org.example.arutala.rental.buku.model;

//import lombok.Data;
//import lombok.EqualsAndHashCode;

//@EqualsAndHashCode(callSuper = true)
//@Data
public abstract class BookForLoan extends Book implements LoanInterface{
    private double bookLoanPrice;
    private int stock;

    public double getBookLoanPrice() {
        return bookLoanPrice;
    }

    public void setBookLoanPrice(double bookLoanPrice) {
        this.bookLoanPrice = bookLoanPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "BookForLoan{" +
                "bookLoanPrice=" + bookLoanPrice +
                ", stock=" + stock +
                '}';
    }

    public BookForLoan(String bookId, String title, String author, Double bookPrice, double bookLoanPrice, int stock) {
        super(bookId, title, author, bookPrice);
        this.bookLoanPrice = bookLoanPrice;
        this.stock = stock;
    }

    public BookForLoan(){

    }

}
