package book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Book book1 = new Book();
        book1.setTitle("To Kill a Mockingbird");
        book1.setAuthor("Harper Lee");
        book1.setNumberOfPages(281);
        books.add(book1);

        Book book2 = new Book();
        book2.setTitle("The Catcher in the Rye");
        book2.setAuthor("J.D. Salinger");
        book2.setNumberOfPages(224);
        books.add(book2);

        Book book3 = new Book();
        book3.setTitle("Lord of the Flies");
        book3.setAuthor("William Golding");
        book3.setNumberOfPages(224);
        books.add(book3);

        Book book4 = new Book();
        book4.setTitle("Brave New World");
        book4.setAuthor("Aldous Huxley");
        book4.setNumberOfPages(288);
        books.add(book4);

        Book book5 = new Book();
        book5.setTitle("Fahrenheit 451");
        book5.setAuthor("Ray Bradbury");
        book5.setNumberOfPages(249);
        books.add(book5);

        Book book6 = new Book();
        book6.setTitle("The Great Gatsby");
        book6.setAuthor("F. Scott Fitzgerald");
        book6.setNumberOfPages(180);
        books.add(book6);

        Book book7 = new Book();
        book7.setTitle("1984");
        book7.setAuthor("George Orwell");
        book7.setNumberOfPages(328);
        books.add(book7);

        Book book8 = new Book();
        book8.setTitle("Pride and Prejudice");
        book8.setAuthor("Jane Austen");
        book8.setNumberOfPages(435);
        books.add(book8);

        Book book9 = new Book();
        book9.setTitle("The Picture of Dorian Gray");
        book9.setAuthor("Oscar Wilde");
        book9.setNumberOfPages(254);
        books.add(book9);

        Book book10 = new Book();
        book10.setTitle("The Hobbit");
        book10.setAuthor("J.R.R. Tolkien");
        book10.setNumberOfPages(366);
        books.add(book10);

        // Sortowanie listy książek po tytule
        Collections.sort(books, Comparator.comparing(Book::getTitle));

        // Wyświetlenie posortowanej listy książek
        for (Book book : books) {
            System.out.println(book.getTitle() + " - " + book.getAuthor() + " (" + book.getNumberOfPages() + " pages)");
        }
    }
}