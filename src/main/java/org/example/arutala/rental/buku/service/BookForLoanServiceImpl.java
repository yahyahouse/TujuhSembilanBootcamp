package org.example.arutala.rental.buku.service;

import org.example.arutala.rental.buku.model.BookForLoan;
import org.example.arutala.rental.buku.model.LoanBookOrder;
import org.example.arutala.rental.buku.model.Member;
import org.example.arutala.rental.buku.repository.BookForLoanRepository;
import org.example.arutala.rental.buku.repository.LoanOrderRepository;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class BookForLoanServiceImpl implements BookForLoanService {
    private final BookForLoanRepository repositoryBookForLoan = new BookForLoanRepository();
    private final LoanOrderRepository loanOrderRepository = new LoanOrderRepository();
    private final AtomicInteger no = new AtomicInteger(1);

    @Override
    public List<BookForLoan> getAllBookForLoan() {
        return repositoryBookForLoan.getAllBookForLoan();
    }

    @Override
    public void saveLoanBook(Member member, BookForLoan bookForLoan, int loanDuration) {
        LoanBookOrder loanBookOrder = new LoanBookOrder();
        loanBookOrder.setLoanID("Ord-" + String.format("%03d", no.getAndIncrement()));
        loanBookOrder.setMember(member);
        loanBookOrder.setLoanBook(bookForLoan);
        loanBookOrder.setLoanDuration(loanDuration);
        loanOrderRepository.saveData(loanBookOrder);
    }

    @Override
    public BookForLoan getBookByID(String bookID) {
        List<BookForLoan> bookForLoans = repositoryBookForLoan.getAllBookForLoan();
        return bookForLoans.stream()
                .filter(bookForLoan -> bookForLoan.getBookId().equals(bookID))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<LoanBookOrder> getAllDataLoanOrder() {
        return loanOrderRepository.getAllLoanOrder();
    }

    @Override
    public LoanBookOrder getDataLoanOrderByID(String loanID) {
        List<LoanBookOrder> loanBookOrders = loanOrderRepository.getAllLoanOrder();
        return loanBookOrders.stream()
                .filter(loanBookOrder -> loanBookOrder.getLoanID().equals(loanID))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void deleteLoanBook(LoanBookOrder loanBookOrder) {
        loanOrderRepository.deleteData(loanBookOrder);
    }

    @Override
    public void decreaseStock(String bookId) {
        BookForLoan book = getBookByID(bookId);
        if (book != null) {
            int currentStock = book.getStock();
            book.setStock(currentStock - 1);
        }
    }

    @Override
    public void increaseStock(String bookId) {
        BookForLoan book = getBookByID(bookId);
        if (book != null) {
            int currentStock = book.getStock();
            book.setStock(currentStock + 1);

        }
    }


}
