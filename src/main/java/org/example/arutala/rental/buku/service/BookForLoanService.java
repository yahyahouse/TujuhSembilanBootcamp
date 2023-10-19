package org.example.arutala.rental.buku.service;

import org.example.arutala.rental.buku.model.BookForLoan;
import org.example.arutala.rental.buku.model.LoanBookOrder;
import org.example.arutala.rental.buku.model.Member;

import java.util.List;

public interface BookForLoanService {
    List<BookForLoan> getAllBookForLoan();

    void saveLoanBook(Member member, BookForLoan bookForLoan, int loanDuration);

    BookForLoan getBookByID(String bookID);

    List<LoanBookOrder> getAllDataLoanOrder();

    LoanBookOrder getDataLoanOrderByID(String loanID);

    void deleteLoanBook(LoanBookOrder loanBookOrder);

    void decreaseStock(String bookId);

    void increaseStock(String bookId);

}
