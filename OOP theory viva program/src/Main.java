import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// Define the Book class
class Book {
    private String title;
    private String author;
    private String genre;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Genre: " + genre;
    }
}

// Define a Comparator to sort books by genre
class GenreComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getGenre().compareTo(book2.getGenre());
    }
}

class Ebook extends Book {
    private String format;

    public Ebook(String title, String author, String genre, String format) {
        super(title, author, genre); // Call the superclass constructor
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public String toString() {
        return super.toString() + ", Format: " + format;
    }
}

// Define the main program

