package org.example.arutala.gramedia.service;

import org.example.arutala.gramedia.model.CommercialBook;
import org.example.arutala.gramedia.model.Publisher;
import org.example.arutala.gramedia.model.buku.Book;
import org.example.arutala.gramedia.model.buku.Comic;
import org.example.arutala.gramedia.model.penulis.Author;
import org.example.arutala.gramedia.model.penulis.DataPenulis;
import org.example.arutala.gramedia.model.penulis.Mangaka;
import org.example.arutala.gramedia.model.penulis.Novelis;

import java.util.List;

public interface BookService {

    List<CommercialBook> getAllBook();

    List<Mangaka> getAllMangaka();
    List<Author> getAllAuthor();
    List<Novelis> getAllNovelist();

    Publisher getProductionCostMax();
    Publisher getProductionCostMin();

    List<DataPenulis> getAuthorByCountry(String country);

    List<DataPenulis> getAuthorByRangeAge(int minAge, int maxAge);

    Book getBookBycheapest();
    Book getBookByMostExpensive();
    List<Book> getBookByRangePrice(int minPrice, int maxPrice);

    List<Book> getBookByCountryPublisher(String country);
    List<Book> getBookByCountryAuthor(String country);

    Comic getComicByExpensivePrice();

    List<Comic> getComicByRating(String rating);

}
