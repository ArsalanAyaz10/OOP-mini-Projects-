import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BookManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        // Add some example books
        books.add(new Book("Spice and Wolf", "Isuna Hasekura", "Fantasy, Economics"));
        books.add(new Book("The detective is already dead", "Nogoju", "Mystery, Science Fiction"));
        books.add(new Book("Sword Art Online", "Reki Kawahara", "Science Fiction, Reincarnation, Other World"));
        books.add(new Ebook("Moby Dick","Herman Melville", "Fantasy, Sea Adventure","PDF"));
        books.add(new Ebook("Tempest", "William Shakespeare ", "Mystery, Fantasy, Desert Island","EPUB 3"));
        books.add(new Ebook("Fahrenheit 451 ", "Ray Bradbury", "Science Fiction, Future, Prediction","EPUB 3"));

        while (true) {
            System.out.println("1. Add a book");
            System.out.println("2. Sort books by genre");
            System.out.println("3. View Physical Books");
            System.out.println("4. View Ebooks");
            System.out.println("5. View All Books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter genre: ");
                    String genre = scanner.nextLine();
                    books.add(new Book(title, author, genre));
                    System.out.println("Book added!");
                    break;
                case 2:
                    // Sort books by genre
                    System.out.println("Enter genre to view:");
                    String selectedGenre = scanner.nextLine();

                    System.out.println("Books in the " + selectedGenre + " genre:");
                    for (Book book : books) {
                        String[] bookGenres = book.getGenre().split(", ");
                        for (String genre1 : bookGenres) {
                            if (genre1.equalsIgnoreCase(selectedGenre)) {
                                System.out.println(book);
                                break; // Exit the inner loop since we found a match
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Physical Books:");
                    for (Book book : books) {
                        if (!(book instanceof Ebook)) {
                            System.out.println(book);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Ebooks:");
                    for (Book book : books) {
                        if (book instanceof Ebook) {
                            System.out.println(book);
                        }
                    }
                    break;
                case 5:
                    System.out.println("All Books:");
                    for (Book book : books) {
                        System.out.println(book);
                    }
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }
}