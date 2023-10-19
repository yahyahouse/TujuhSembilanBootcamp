package org.example.arutala.rental.buku.service;

import org.example.arutala.rental.buku.model.BookForLoan;
import org.example.arutala.rental.buku.model.LoanBookOrder;
import org.example.arutala.rental.buku.model.Member;

import javax.xml.bind.ValidationException;

public class ValidationService {
    public void validationLoanID(LoanBookOrder loanBookOrder) throws ValidationException {
        if (loanBookOrder == null) {
            throw new ValidationException("ID peminjaman tidak ditemukan atau tidak sesuai");
        }
    }

    public void validationBookID(BookForLoan bookForLoan) throws ValidationException {
        if (bookForLoan == null) {
            throw new ValidationException("Buku dengan ID tersebut tidak ditemukan atau tidak susuai");
        }
    }

    public void validationMember(Member member) throws ValidationException {
        if (member == null) {
            throw new ValidationException("Member dengan ID tersebut tidak ditemukan atau tidak sesuai.");
        }
    }

    public void validationLoanDuration(int loanDuration) throws ValidationException {
        if (loanDuration < 0) {
            throw new ValidationException("loan duration tidak sesuai");
        }
    }
    public void validationMenuInput(String input) throws Exception {
        if (!(input.equals("0") || input.equals("1")||input.equals("2")||input.equals("3")||input.equals("4"))) {
            throw new Exception("Input tidak valid. Pilih 0-4.");
        }
    }

}
