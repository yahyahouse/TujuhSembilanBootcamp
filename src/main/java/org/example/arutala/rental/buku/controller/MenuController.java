package org.example.arutala.rental.buku.controller;

import org.example.arutala.rental.buku.model.BookForLoan;
import org.example.arutala.rental.buku.model.LoanBookOrder;
import org.example.arutala.rental.buku.model.Member;
import org.example.arutala.rental.buku.service.*;

import javax.xml.bind.ValidationException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;


public class MenuController {
    private BookForLoanService bookForLoanService = new BookForLoanServiceImpl();
    private MemberService memberService = new MemberServiceImpl();
    private ValidationService validationService = new ValidationService();

    Scanner scanner = new Scanner(System.in);


    public void mainMenu() {
        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("Main Menu:");
                System.out.println("1. Data All Book For Loan");
                System.out.println("2. Loan");
                System.out.println("3. Return");
                System.out.println("4. Data All Loan Book Order");
                System.out.println("0. Exit");
                System.out.print("Pilih menu (1-5): ");
                String choice = scanner.next();
                switch (choice) {
                    case "1":
                        //data all book for loan
                        menuGetBookForLoan();
                        break;
                    case "2":
                        // loan
                        menuGetBookForLoan();
                        menuLoanBook();
                        break;
                    case "3":
                        //return
                        menuDataLoanBookOrders();
                        menuReturnBook();
                        break;
                    case "4":
                        //data all loan book order
                        menuDataLoanBookOrders();
                        break;
                    case "0":
                        System.out.println("Terima kasih. Keluar dari program.");
                        exit = true;
                        break;
                    default:
                        validationService.validationMenuInput(choice);
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void menuGetBookForLoan() {
        String[] displayTampilan = {
                "No",
                "Book ID",
                "Title",
                "Author",
                "Stock"
        };
        AtomicInteger no = new AtomicInteger(1);
        System.out.println("+----+-----------------+-----------------------------------------------+--------------------+-------+");
        System.out.printf("| %-2s | %-15s | %-45s | %-18s | %-5s |\n", displayTampilan);
        System.out.println("+----+-----------------+-----------------------------------------------+--------------------+-------+");
        bookForLoanService.getAllBookForLoan().forEach(book -> {
            String[] displayValues = {
                    String.valueOf(no.getAndIncrement()),
                    book.getBookId(),
                    book.getTitle(),
                    book.getAuthor(),
                    String.valueOf(book.getStock())
            };
            System.out.printf("| %-2s | %-15s | %-45s | %-18s | %-5s |\n", displayValues);
        });
        System.out.println("+----+-----------------+-----------------------------------------------+--------------------+-------+");
        System.out.println("| 0 | Kembali Ke Main Menu                                  |");
    }

    public void menuDataLoanBookOrders() {
        String[] displayTampilan = {
                "No",
                "Loan ID",
                "Member Name",
                "Book ID",
                "Title",
                "Book Loan Price",
                "Loan Duration",
                "Loan Fee"
        };
        AtomicInteger no = new AtomicInteger(1);
        System.out.println("+----+---------+-------------+-------------+-----------------------------------------------+----------------------+---------------+----------------------+");
        System.out.printf("| %-2s | %-7s | %-11s | %-11s | %-45s | %-20s | %-13s | %-20s |\n", displayTampilan);
        System.out.println("+----+---------+-------------+-------------+-----------------------------------------------+----------------------+---------------+----------------------+");
        bookForLoanService.getAllDataLoanOrder().forEach(bookLoan -> {
            String[] displayValues = {
                    String.valueOf(no.getAndIncrement()),
                    bookLoan.getLoanID(),
                    bookLoan.getMember().getMemberName(),
                    bookLoan.getLoanBook().getBookId(),
                    bookLoan.getLoanBook().getTitle(),
                    String.valueOf(bookLoan.getLoanBook().getBookLoanPrice()),
                    String.valueOf(bookLoan.getLoanDuration()),
                    String.valueOf(bookLoan.getLoanFee())
            };
            System.out.printf("| %-2s | %-7s | %-11s | %-11s | %-45s | %-20s | %-13s | %-20s |\n", displayValues);
        });
        System.out.println("+----+---------+-------------+-------------+-----------------------------------------------+----------------------+---------------+----------------------+");
        System.out.println("| 0 | Kembali Ke Main Menu                                  |");
    }

    public void menuLoanBook() {
        try {
            System.out.print("Masukan Member ID : ");
            String memberId = scanner.next();
            System.out.println("Masukan Book ID : ");
            String bookId = scanner.next();
            System.out.println("Masukan Lama Meminjam : ");
            int loanDuration = scanner.nextInt();
            validationService.validationLoanDuration(loanDuration);
            Member member = memberService.getMemberByID(memberId);
            validationService.validationMember(member);
            BookForLoan bookForLoan = bookForLoanService.getBookByID(bookId);
            validationService.validationBookID(bookForLoan);
            bookForLoan.calculateBookLoanPrice();
            bookForLoanService.saveLoanBook(member, bookForLoan, loanDuration);
            bookForLoanService.decreaseStock(bookId);
            System.out.println("Loan Success!");
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
    }

    public void menuReturnBook() {
        try {
            System.out.print("Masukan Loan ID : ");
            String loanId = scanner.next();
            LoanBookOrder loanBookOrder = bookForLoanService.getDataLoanOrderByID(loanId);
            validationService.validationLoanID(loanBookOrder);
            loanBookOrder.getLoanBook().calculateBookLoanPrice();
            bookForLoanService.increaseStock(loanBookOrder.getLoanBook().getBookId());
            bookForLoanService.deleteLoanBook(loanBookOrder);
            System.out.println("Return Book Success!");
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
    }

}
