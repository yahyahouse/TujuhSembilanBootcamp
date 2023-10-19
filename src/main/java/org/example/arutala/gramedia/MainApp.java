package org.example.arutala.gramedia;

import org.example.arutala.gramedia.model.Publisher;
import org.example.arutala.gramedia.model.buku.Book;
import org.example.arutala.gramedia.model.buku.Comic;
import org.example.arutala.gramedia.model.penulis.Author;
import org.example.arutala.gramedia.model.penulis.DataPenulis;
import org.example.arutala.gramedia.model.penulis.Mangaka;
import org.example.arutala.gramedia.model.penulis.Novelis;
import org.example.arutala.gramedia.service.BookServiceImpl;

import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Main Menu");
            System.out.println("1. Book");
            System.out.println("2. Author");
            System.out.println("3. Publisher");
            System.out.println("0. Exit");
            System.out.print("Pilih menu (0-3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    handleBookMenu();
                    break;
                case 2:
                    handleAuthorMenu();
                    break;
                case 3:
                    handlePublisherMenu();
                    break;
                case 0:
                    System.out.println("Terima kasih. Aplikasi selesai.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang sesuai.");
            }
        }
    }

    private static void handleBookMenu() {
        Scanner scanner = new Scanner(System.in);
        BookServiceImpl repositoryBook = new BookServiceImpl();
        Book expensiveBook = repositoryBook.getBookByMostExpensive();
        Book cheapestBook = repositoryBook.getBookBycheapest();
        Book expensiveComic = repositoryBook.getComicByExpensivePrice();
        while (true) {
            System.out.println("Book Menu Searching");
            System.out.println("1. Cari data book yang memiliki price paling Murah.");
            System.out.println("2. Cari data book yang memiliki price paling Mahal.");
            System.out.println("3. Cari data book berdasarkan range Price.");
            System.out.println("4. Cari Comic Berdasarkan Rating mangaka.");
            System.out.println("5. Cari Book berdasarkan Country dari Publishernya.");
            System.out.println("6. Cari Book berdasarkan Country dari Authornya.");
            System.out.println("7. Cari data Comic yang memiliki price paling Mahal.");
            System.out.println("0. Back to Main Menu");
            System.out.print("Pilih menu (0-7): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Book Code : " + cheapestBook.getBookCode());
                    System.out.println("Title : " + cheapestBook.getTitle());
                    System.out.println("Author : " + cheapestBook.getAuthor().getFullName());
                    System.out.println("Publisher : " + cheapestBook.getPublisher().getPublisherName());
                    System.out.println("Price : " + cheapestBook.getPrice());
                    break;
                case 2:
                    System.out.println("Book Code : " + expensiveBook.getBookCode());
                    System.out.println("Title : " + expensiveBook.getTitle());
                    System.out.println("Author : " + expensiveBook.getAuthor().getFullName());
                    System.out.println("Publisher : " + expensiveBook.getPublisher().getPublisherName());
                    System.out.println("Price : " + expensiveBook.getPrice());
                    break;
                case 3:
                    int priceMin = scanner.nextInt();
                    int priceMax = scanner.nextInt();
                    List<Book> authorsInAgeRange = repositoryBook.getBookByRangePrice(priceMin, priceMax);
                    for (Book data : authorsInAgeRange) {
                        System.out.println("Book Code : " + data.getBookCode());
                        System.out.println("Title : " + data.getTitle());
                        System.out.println("Author : " + data.getAuthor().getFullName());
                        System.out.println("Publisher : " + data.getPublisher().getPublisherName());
                        System.out.println("Price : " + data.getPrice());
                        System.out.println();
                    }
                    break;
                case 4:
                    String rating = scanner.next();
                    List<Comic> comicByRating = repositoryBook.getComicByRating(rating);

                    for (Comic data : comicByRating) {
                        Mangaka mangaka = (Mangaka) data.getAuthor();
                        System.out.println("Book Code : " + data.getBookCode());
                        System.out.println("Title : " + data.getTitle());
                        System.out.println("Author : " + data.getAuthor().getFullName());
                        System.out.println("Publisher : " + data.getPublisher().getPublisherName());
                        System.out.println("Price : " + data.getPrice());
                        System.out.println("Rating : "+ mangaka.getRating());
                        System.out.println();
                    }
                    break;
                case 5:
                    String countryPublisher = scanner.next();
                    List<Book> publisherCountry = repositoryBook.getBookByCountryPublisher(countryPublisher);
                    for (Book data : publisherCountry) {
                        System.out.println("Book Code : " + data.getBookCode());
                        System.out.println("Title : " + data.getTitle());
                        System.out.println("Author : " + data.getAuthor().getFullName());
                        System.out.println("Publisher : " + data.getPublisher().getPublisherName());
                        System.out.println("Price : " + data.getPrice());
                        System.out.println();
                    }
                    break;
                case 6:
                    String countryAuthor = scanner.next();
                    List<Book> authorsCountry = repositoryBook.getBookByCountryAuthor(countryAuthor);
                    for (Book data : authorsCountry) {
                        System.out.println("Book Code : " + data.getBookCode());
                        System.out.println("Title : " + data.getTitle());
                        System.out.println("Author : " + data.getAuthor().getFullName());
                        System.out.println("Publisher : " + data.getPublisher().getPublisherName());
                        System.out.println("Price : " + data.getPrice());
                        System.out.println();
                    }
                    break;
                case 7:
                    System.out.println("Book Code : " + expensiveComic.getBookCode());
                    System.out.println("Title : " + expensiveComic.getTitle());
                    System.out.println("Author : " + expensiveComic.getAuthor().getFullName());
                    System.out.println("Publisher : " + expensiveComic.getPublisher().getPublisherName());
                    System.out.println("Price : " + expensiveComic.getPrice());
                    System.out.println();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang sesuai.");
            }
        }
    }

    private static void handleAuthorMenu() {
        BookServiceImpl repositoryBook = new BookServiceImpl();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Author Menu Searching");
            System.out.println("1. Cari Data semua Mangaka.");
            System.out.println("2. Cari Data semua Author.");
            System.out.println("3. Cari Data semua Novelis.");
            System.out.println("4. Cari author berdasarkan Range umur.");
            System.out.println("5. Cari author berdasarkan Country.");
            System.out.println("0. Back to Main Menu");
            System.out.print("Pilih menu (0-5): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    List<Mangaka> mangakaList = repositoryBook.getAllMangaka();
                    mangakaList.stream().forEach(mangaka -> {
                        System.out.println("Name : " + mangaka.getFullName());
                        System.out.println("Country : " + mangaka.getcountry());
                        System.out.println("Age : " + mangaka.getAge());
                        System.out.println("Rating : " + mangaka.getRating());
                        System.out.println();
                    });
                    break;
                case 2:
                    List<Author> authorList = repositoryBook.getAllAuthor();
                    authorList.stream().forEach(author -> {
                        System.out.println("Name : " + author.getFullName());
                        System.out.println("Country : " + author.getcountry());
                        System.out.println("Age : " + author.getAge());
                        System.out.println();
                    });
                    break;
                case 3:
                    List<Novelis> novelists = repositoryBook.getAllNovelist();
                    novelists.stream()
                            .forEach(novelist -> {
                                System.out.println("Name: " + novelist.getFullName());
                                System.out.println("Country: " + novelist.getcountry());
                                System.out.println("Age: " + novelist.getAge());
                                System.out.println("Serial: " + novelist.getSerial());
                                System.out.println("Rating: " + novelist.getRating());
                                System.out.println();
                            });
                    break;
                case 4:
                    int ageMin = scanner.nextInt();
                    int ageMax = scanner.nextInt();
                    List<DataPenulis> authorsInAgeRange = repositoryBook.getAuthorByRangeAge(ageMin, ageMax);
                    for (DataPenulis data : authorsInAgeRange) {
                        System.out.println("Name: " + data.getFullName());
                        System.out.println("Country: " + data.getcountry());
                        System.out.println("Age: " + data.getAge());
                        System.out.println();
                    }
                    break;
                case 5:
                    String country = scanner.next();
                    List<DataPenulis> authorsCountry = repositoryBook.getAuthorByCountry(country);
                    for (DataPenulis data : authorsCountry) {
                        System.out.println("Name: " + data.getFullName());
                        System.out.println("Country: " + data.getcountry());
                        System.out.println("Age: " + data.getAge());
                        System.out.println();
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang sesuai.");
            }
        }
    }

    private static void handlePublisherMenu() {
        BookServiceImpl repositoryBook = new BookServiceImpl();
        Publisher highestCostPublisher = repositoryBook.getProductionCostMax();
        Publisher lowCostPublisher = repositoryBook.getProductionCostMin();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Publisher Menu Searching");
            System.out.println("1. Cari Publisher dengan productionCost paling Mahal.");
            System.out.println("2. Cari Publisher dengan productionCost paling Murah.");
            System.out.println("0. Back to Main Menu");
            System.out.print("Pilih menu (0-2): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Publisher Name: " + highestCostPublisher.getPublisherName());
                    System.out.println("Country : " + highestCostPublisher.getCountry());
                    System.out.println("Production Cost: " + highestCostPublisher.getProductionCost());
                    break;
                case 2:
                    System.out.println("Publisher Name: " + lowCostPublisher.getPublisherName());
                    System.out.println("Country : " + lowCostPublisher.getCountry());
                    System.out.println("Production Cost: " + lowCostPublisher.getProductionCost());
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang sesuai.");
            }
        }
    }
}
