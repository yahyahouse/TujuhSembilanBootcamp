package org.example.arutala.gramedia.service;

import org.example.arutala.gramedia.model.CommercialBook;
import org.example.arutala.gramedia.model.DataGramedia;
import org.example.arutala.gramedia.model.Publisher;
import org.example.arutala.gramedia.model.buku.Book;
import org.example.arutala.gramedia.model.buku.Comic;
import org.example.arutala.gramedia.model.buku.EBook;
import org.example.arutala.gramedia.model.buku.Novel;
import org.example.arutala.gramedia.model.penulis.Author;
import org.example.arutala.gramedia.model.penulis.DataPenulis;
import org.example.arutala.gramedia.model.penulis.Mangaka;
import org.example.arutala.gramedia.model.penulis.Novelis;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RepositoryBookImpl implements RepositoryBook {
    private DataGramedia dataGramedia = new DataGramedia();

    @Override
    public List<CommercialBook> getAllBook() {
        return null;
    }

    @Override
    public List<Mangaka> getAllMangaka() {
        return dataGramedia.listMangaka();
    }

    @Override
    public List<Author> getAllAuthor() {
        return dataGramedia.listAuthor();
    }

    @Override
    public List<Novelis> getAllNovelist() {
        return dataGramedia.listNovelis();
    }

    @Override
    public Publisher getProductionCostMax() {
        List<Publisher> publishers = dataGramedia.listPublisher();
        return publishers.stream()
                .max(Comparator.comparingDouble(Publisher::getProductionCost))
                .orElse(null);
    }

    @Override
    public Publisher getProductionCostMin() {
        List<Publisher> publishers = dataGramedia.listPublisher();
        return publishers.stream()
                .min(Comparator.comparingDouble(Publisher::getProductionCost))
                .orElse(null);
    }

    @Override
    public List<DataPenulis> getAuthorByCountry(String country) {
        List<Author> authors = dataGramedia.listAuthor();
        List<Mangaka> mangakas = dataGramedia.listMangaka();
        List<Novelis> novelis = dataGramedia.listNovelis();
        List<DataPenulis> allAuthors = Stream.of(authors, novelis, mangakas)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        return allAuthors.stream().filter(authors1 -> authors1.getcountry().equals(country)).collect(Collectors.toList());
    }

    @Override
    public List<DataPenulis> getAuthorByRangeAge(int minAge, int maxAge) {
        List<Author> authors = dataGramedia.listAuthor();
        List<Mangaka> mangakas = dataGramedia.listMangaka();
        List<Novelis> novelis = dataGramedia.listNovelis();
        List<DataPenulis> allAuthors = Stream.of(authors, novelis, mangakas)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        return allAuthors.stream()
                .filter(author -> author.getAge() >= minAge && author.getAge() <= maxAge)
                .collect(Collectors.toList());
    }

    @Override
    public Book getBookBycheapest() {
        List<Publisher> publishers = dataGramedia.listPublisher();
        List<Author> authors = dataGramedia.listAuthor();
        List<Mangaka> mangakas = dataGramedia.listMangaka();
        List<Novelis> novelis = dataGramedia.listNovelis();
        List<EBook> eBooks = dataGramedia.listBook(authors,publishers);
        List<Comic> comics = dataGramedia.listComic(mangakas,publishers);
        List<Novel> novels = dataGramedia.listNovel(novelis,publishers);
        List<Book> allBooks = Stream.of(eBooks, novels, comics)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        return allBooks.stream()
                .min(Comparator.comparingDouble(Book::getPrice))
                .orElse(null);
    }

    @Override
    public Book getBookByMostExpensive() {
        List<Publisher> publishers = dataGramedia.listPublisher();
        List<Author> authors = dataGramedia.listAuthor();
        List<Mangaka> mangakas = dataGramedia.listMangaka();
        List<Novelis> novelis = dataGramedia.listNovelis();
        List<EBook> eBooks = dataGramedia.listBook(authors,publishers);
        List<Comic> comics = dataGramedia.listComic(mangakas,publishers);
        List<Novel> novels = dataGramedia.listNovel(novelis,publishers);
        List<Book> allBooks = Stream.of(eBooks, novels, comics)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        return allBooks.stream()
                .max(Comparator.comparingDouble(Book::getPrice))
                .orElse(null);
    }

    @Override
    public List<Book> getBookByRangePrice(int minPrice, int maxPrice) {
        List<Publisher> publishers = dataGramedia.listPublisher();
        List<Author> authors = dataGramedia.listAuthor();
        List<Mangaka> mangakas = dataGramedia.listMangaka();
        List<Novelis> novelis = dataGramedia.listNovelis();
        List<EBook> eBooks = dataGramedia.listBook(authors,publishers);
        List<Comic> comics = dataGramedia.listComic(mangakas,publishers);
        List<Novel> novels = dataGramedia.listNovel(novelis,publishers);
        List<Book> allAuthors = Stream.of(eBooks, comics, novels)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        return allAuthors.stream()
                .filter(book -> book.getPrice() >= minPrice && book.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> getBookByCountryPublisher(String country) {
        List<Publisher> publishers = dataGramedia.listPublisher();
        List<Author> authors = dataGramedia.listAuthor();
        List<Mangaka> mangakas = dataGramedia.listMangaka();
        List<Novelis> novelis = dataGramedia.listNovelis();
        List<EBook> eBooks = dataGramedia.listBook(authors,publishers);
        List<Comic> comics = dataGramedia.listComic(mangakas,publishers);
        List<Novel> novels = dataGramedia.listNovel(novelis,publishers);
        List<Book> allBook = Stream.of(eBooks, comics, novels)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        return allBook.stream().filter(book -> book.getPublisher().getCountry().equals(country)).collect(Collectors.toList());
    }

    @Override
    public List<Book> getBookByCountryAuthor(String country) {
        List<Publisher> publishers = dataGramedia.listPublisher();
        List<Author> authors = dataGramedia.listAuthor();
        List<Mangaka> mangakas = dataGramedia.listMangaka();
        List<Novelis> novelis = dataGramedia.listNovelis();
        List<EBook> eBooks = dataGramedia.listBook(authors,publishers);
        List<Comic> comics = dataGramedia.listComic(mangakas,publishers);
        List<Novel> novels = dataGramedia.listNovel(novelis,publishers);
        List<Book> allBook = Stream.of(eBooks, comics, novels)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        return allBook.stream().filter(book -> book.getAuthor().getcountry().equals(country)).collect(Collectors.toList());
    }

    @Override
    public Comic getComicByExpensivePrice() {
        List<Publisher> publishers = dataGramedia.listPublisher();
        List<Mangaka> mangakas = dataGramedia.listMangaka();
        List<Comic> comics = dataGramedia.listComic(mangakas,publishers);
        for (Comic comic : comics) {
            comic.calculatePrice();
        }
        return comics.stream()
                .max(Comparator.comparingDouble(Comic::getPrice))
                .orElse(null);
    }

    @Override
    public List<Comic> getComicByRating(String rating) {
        List<Publisher> publishers = dataGramedia.listPublisher();
        List<Mangaka> mangakas = dataGramedia.listMangaka();
        List<Comic> comics = dataGramedia.listComic(mangakas,publishers);
        for (Comic comic : comics) {
            comic.calculatePrice();
        }
        return comics.stream().filter(comic ->{
            Mangaka mangaka = (Mangaka) comic.getAuthor();
            return mangaka != null && mangaka.getRating().equals(rating);
        }).collect(Collectors.toList());
    }

}
