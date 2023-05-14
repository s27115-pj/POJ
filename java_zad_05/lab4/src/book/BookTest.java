package book;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class BookTest {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        // Dodajemy kilka obiektów klasy Book
        Book book1 = new Book();
        book1.setTitle("1984");
        book1.setAuthor("George Orwell");
        book1.setNumberOfPages(328);
        books.add(book1);

        Book book2 = new Book();
        book2.setTitle("Animal Farm");
        book2.setAuthor("George Orwell");
        book2.setNumberOfPages(112);
        books.add(book2);

        // Dodajemy kilka obiektów klasy PaperBook
        PaperBook paperBook1 = new PaperBook();
        paperBook1.setTitle("Brave New World");
        paperBook1.setAuthor("Aldous Huxley");
        paperBook1.setNumberOfPages(288);
        paperBook1.setReleaseYear(1932);
        books.add(paperBook1);

        PaperBook paperBook2 = new PaperBook();
        paperBook2.setTitle("Fahrenheit 451");
        paperBook2.setAuthor("Ray Bradbury");
        paperBook2.setNumberOfPages(249);
        paperBook2.setReleaseYear(1953);
        books.add(paperBook2);

        // Dodajemy kilka obiektów klasy Ebook
        Ebook ebook1 = new Ebook();
        ebook1.setTitle("The Hitchhiker's Guide to the Galaxy");
        ebook1.setAuthor("Douglas Adams");
        ebook1.setNumberOfPages(193);
        ebook1.setFormat("EPUB");
        ebook1.setSize(438);
        books.add(ebook1);

        Ebook ebook2 = new Ebook();
        ebook2.setTitle("The Lord of the Rings");
        ebook2.setAuthor("J.R.R. Tolkien");
        ebook2.setNumberOfPages(1216);
        ebook2.setFormat("MOBI");
        ebook2.setSize(3279);
        books.add(ebook2);

        // Sortowanie książek po tytule z użyciem wyrażenia lambda
        Function<Book, String> getTitle = Book::getTitle;
        Comparator<Book> byTitle = Comparator.comparing(getTitle);
        books.sort(byTitle);

        // Wypisanie posortowanej listy na ekranie
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Number of pages: " + book.getNumberOfPages());

            if (book instanceof PaperBook paperBook) {
                System.out.println("Release year: " + paperBook.getReleaseYear());
            } else if (book instanceof Ebook ebook) {
                System.out.println("Format: " + ebook.getFormat());
                System.out.println("Size: " + ebook.getSize() + " KB");
            }

            System.out.println();
        }

    }
}