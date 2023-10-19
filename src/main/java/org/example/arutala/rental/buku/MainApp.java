package org.example.arutala.rental.buku;

import org.example.arutala.rental.buku.controller.MenuController;
import org.example.arutala.rental.buku.model.BookForLoan;
import org.example.arutala.rental.buku.model.LoanBookOrder;
import org.example.arutala.rental.buku.repository.BookForLoanRepository;
import org.example.arutala.rental.buku.repository.LoanOrderRepository;

import javax.xml.bind.ValidationException;
import java.util.List;

public class MainApp {
    public static void main(String[] args) throws ValidationException {
        MenuController menuController = new MenuController();
        menuController.mainMenu();
    }
}
