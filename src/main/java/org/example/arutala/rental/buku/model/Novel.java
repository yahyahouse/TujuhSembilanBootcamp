package org.example.arutala.rental.buku.model;

//import lombok.Data;
//import lombok.EqualsAndHashCode;
//
//@EqualsAndHashCode(callSuper = true)
//@Data
public class Novel extends BookForLoan {
    private boolean isASeries;

    public boolean isASeries() {
        return isASeries;
    }

    public void setASeries(boolean ASeries) {
        isASeries = ASeries;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "isASeries=" + isASeries +
                '}';
    }

    public Novel(String bookId, String title, String author, Double bookPrice, double bookLoanPrice, int stock, boolean isASeries) {
        super(bookId, title, author, bookPrice, bookLoanPrice, stock);
        this.isASeries = isASeries;
        calculateBookLoanPrice();
    }
    public Novel(){

    }
    @Override
    public void calculateBookLoanPrice() {
        double rateStockPercentage = (getStock() < 10) ? 0.05 : 0.03;
        double rateBookType =0.05;
        setBookLoanPrice((rateBookType+rateStockPercentage)*getBookPrice());
    }
}
