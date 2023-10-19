package org.example.arutala.gramedia.repository;

import org.example.arutala.gramedia.model.Publisher;
import org.example.arutala.gramedia.model.buku.Book;
import org.example.arutala.gramedia.model.buku.EBook;
import org.example.arutala.gramedia.model.buku.Comic;
import org.example.arutala.gramedia.model.buku.Novel;
import org.example.arutala.gramedia.model.penulis.Author;
import org.example.arutala.gramedia.model.penulis.Mangaka;
import org.example.arutala.gramedia.model.penulis.Novelis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataGramedia {
    public static void main(String[] args) {
        DataGramedia dataGramedia = new DataGramedia();
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
        allBooks.stream().forEach(book-> System.out.println(book.getPrice()));
        comics.stream().forEach(comic -> System.out.println(comic.getTax()));
    }
    public List<Publisher> listPublisher() {
        List<Publisher> publishers = new ArrayList<>();
        publishers.add(new Publisher("Bloomsbury", "United Kingdom", 30.0));
        publishers.add(new Publisher("Gramedia", "Indonesia", 50.0));
        publishers.add(new Publisher("Mizan", "Indonesia", 25.0));
        publishers.add(new Publisher("Shueisha", "Japan", 25.0));
        publishers.add(new Publisher("Elex Media Kompuntindo", "Indonesia", 12.0));
        publishers.add(new Publisher("Gramedia Pustaka Utama", "Indonesia", 15.0));
        publishers.add(new Publisher("Lion Hudson", "England", 15.0));
        publishers.add(new Publisher("O Reilly Media", "USA", 30.0));
        publishers.add(new Publisher("Harper One", "USA", 25.0));
        return publishers;
    }

    public List<Author> listAuthor() {
        List<Author> authors = new ArrayList<>();
        authors.add(new Author("Haidar", "Musyafa", "Indonesia", 30));
        authors.add(new Author("Bert", "Bates", "United State", 50));
        authors.add(new Author("Barry", "Burd", "United State", 52));
        authors.add(new Author("Mark", "Manson", "United State", 38));
        authors.add(new Author("Andi", "Susanto", "Indonesia", 32));
        authors.add(new Author("Adi", "Sutanto", "Indonesia", 27));
        return authors;
    }

    public List<EBook> listBook(List<Author> authors, List<Publisher> publishers) {
        List<EBook> EBooks = new ArrayList<>();
        EBooks.add(new EBook("Book - 001", "Memahami Hamka", authors.get(0), publishers.get(2), 0.0));
        EBooks.add(new EBook("Book - 002", "Head First Java: Your Brain on Java - A Learner's Guide", authors.get(1), publishers.get(7), 0.0));
        EBooks.add(new EBook("Book - 003", "Java For Dummies", authors.get(2), publishers.get(7), 0.0));
        EBooks.add(new EBook("Book - 004", "Flutter For Dummies", authors.get(2), publishers.get(7), 0.0));
        EBooks.add(new EBook("Book - 005", "The Subtle Art of Not Giving", authors.get(3), publishers.get(8), 0.0));
        EBooks.add(new EBook("Book - 006", "Will", authors.get(3), publishers.get(8), 0.0));
        EBooks.add(new EBook("Book - 007", "Sejarah Indonesia", authors.get(4), publishers.get(5), 0.0));
        EBooks.add(new EBook("Book - 008", "Teknologi Baru", authors.get(4), publishers.get(4), 0.0));
        for (EBook eBook : EBooks) {
            eBook.calculatePrice();
        }
        return EBooks;
    }

    public List<Novelis> listNovelis() {
        List<Novelis> novelis = new ArrayList<>();
        novelis.add(new Novelis("J.K", "Rowling", "England", 57, true, "Best Seller"));
        novelis.add(new Novelis("Tere", "Liye", "Indonesia", 35, true, "Best Seller"));
        novelis.add(new Novelis("Dee", "Lestari", "Indonesia", 30, true, "Good"));
        novelis.add(new Novelis("Faisal", "Syahreza", "Indonesia", 40, true, "New Comer"));
        novelis.add(new Novelis("Julia", "Golding", "England", 41, false, "Best Seller"));
        return novelis;
    }

    public List<Novel> listNovel(List<Novelis> novelis, List<Publisher> publishers) {
        List<Novel> novels = new ArrayList<>();
        novels.add(new Novel("Novel - 001", "Harry Potter and the Philosopher's Stone", novelis.get(0), publishers.get(0), 0.0, "Fantasy"));
        novels.add(new Novel("Novel - 002", "Harry Potter and the Chamber of Secrets", novelis.get(0), publishers.get(0), 0.0, "Fantasy"));
        novels.add(new Novel("Novel - 003", "Harry Potter and the Prisoner of Azkaban", novelis.get(0), publishers.get(0), 0.0, "Fantasy"));
        novels.add(new Novel("Novel - 004", "Ayah Aku Berbeda", novelis.get(1), publishers.get(1), 0.0, "Drama"));
        novels.add(new Novel("Novel - 005", "Madre", novelis.get(2), publishers.get(1), 0.0, "Drama"));
        novels.add(new Novel("Novel - 006", "Lagu untuk Renjana", novelis.get(3), publishers.get(2), 0.0, "Drama"));
        novels.add(new Novel("Novel - 007", "Semoga Lekas Lega", novelis.get(3), publishers.get(2), 0.0, "Drama"));
        novels.add(new Novel("Novel - 008", "The Abbey Mystery", novelis.get(4), publishers.get(6), 0.0, "Fiction"));
        for (Novel novel : novels) {
            novel.calculatePrice();
        }
        return novels;
    }

    public List<Mangaka> listMangaka() {
        List<Mangaka> mangakas = new ArrayList<>();
        mangakas.add(new Mangaka("Masashi", "Kishimoto", "Japan", 48, "Best Seller"));
        mangakas.add(new Mangaka("Yoshihiro", "Togashi", "Japan", 56, "Good"));
        mangakas.add(new Mangaka("Eiichiro", "Oda", "Japan", 57, "Best Seller"));
        mangakas.add(new Mangaka("Rizki", "Anwar", "Indonesia", 25, "New Comer"));
        mangakas.add(new Mangaka("Yusuf", "Fadli", "Indonesia", 32, "New Comer"));
        return mangakas;
    }


    public List<Comic> listComic(List<Mangaka> mangakas, List<Publisher> publishers) {
        List<Comic> comics = new ArrayList<>();
        comics.add(new Comic("Comic - 001", "Uzumaki Naruto", mangakas.get(0), publishers.get(3),0.0,true, 0.0));
        comics.add(new Comic("Comic - 002", "The Worst Client", mangakas.get(0), publishers.get(3),0.0,true, 0.0));
        comics.add(new Comic("Comic - 003", "For the Sake of Dreams...!!",mangakas.get(0), publishers.get(3),0.0,true, 0.0));
        comics.add(new Comic("Comic - 004", "Hunter X Hunter : The Day of Departure",mangakas.get(1), publishers.get(3),0.0,true, 0.0));
        comics.add(new Comic("Comic - 005", "Hunter X Hunter : A Struggle in the Mist", mangakas.get(1), publishers.get(3),0.0,true, 0.0));
        comics.add(new Comic("Comic - 006", "One Piece", mangakas.get(2), publishers.get(1),0.0,true, 0.0));
        comics.add(new Comic("Comic - 007", "Petualangan di Indonesia", mangakas.get(3), publishers.get(5),0.0,true, 0.0));
        comics.add(new Comic("Comic - 008", "Petualangan di Jakarta", mangakas.get(4), publishers.get(4),0.0,true, 0.0));
        for (Comic comic : comics) {
            comic.calculatePrice();
            comic.calculateTax(comic);
        }
        return comics;
    }

}
