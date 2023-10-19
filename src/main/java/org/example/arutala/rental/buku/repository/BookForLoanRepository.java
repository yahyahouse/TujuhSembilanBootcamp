package org.example.arutala.rental.buku.repository;

import org.example.arutala.rental.buku.model.BookForLoan;
import org.example.arutala.rental.buku.model.Comic;
import org.example.arutala.rental.buku.model.Novel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookForLoanRepository {

    private List<BookForLoan> bookList;

    public BookForLoanRepository() {
        initializeBookList();
    }

    public List<BookForLoan> getAllBookForLoan() {
        return bookList;
    }

    public void initializeBookList() {
        List<Comic> comicList = new ArrayList<>();
        comicList.add(new Comic("Comic-001", "Uzumaki Naruto", "Masashi Kisimoto", 55000.0, 0, 10, "Shounen"));
        comicList.add(new Comic("Comic-002", "The Worst Client", "Masashi Kisimoto", 35000.0, 0, 20, "Shounen"));
        comicList.add(new Comic("Comic-003", "For the Sake of Dreams...!!", "Masashi Kisimoto", 35000.0, 0, 15, "Shounen"));
        comicList.add(new Comic("Comic-004", "Hunter X Hunter : The Day of Departure", "Yoshihiro Togashi", 50000.0, 0, 15, "Fantasy"));
        comicList.add(new Comic("Comic-005", "Hunter X Hunter : A Struggle in the Mist", "Yoshihiro Togashi", 80000.0, 0, 25, "Fantasy"));
        List<Novel> novelList = new ArrayList<>();
        novelList.add(new Novel("Novel-001", "Harry Potter and the Philosopher's Stone", "J.K Rowling", 150000.0, 0, 10, true));
        novelList.add(new Novel("Novel-002", "Harry Potter and the Chamber of Secrets", "J.K Rowling", 150000.0, 0, 10, true));
        novelList.add(new Novel("Novel-003", "Harry Potter and the Prisoner of Azkaban", "J.K Rowling", 200000.0, 0, 15, true));
        novelList.add(new Novel("Novel-004", "Ayah Aku Berbeda", "Tere Liye", 35000.0, 0, 15, false));
        novelList.add(new Novel("Novel-005", "Madre", "Dee Lestari", 80000.0, 0, 10, false));

        bookList = Stream.of(comicList, novelList)
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

}
