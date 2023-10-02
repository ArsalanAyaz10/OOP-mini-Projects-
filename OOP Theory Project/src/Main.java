import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        library.Project_Info();

        boolean Condition = false;

        while (true)

        {
            System.out.println("1. Add Book");
            System.out.println("2. Select Book and Update Progress");
            System.out.println("3. View Book Status");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            scanner.nextLine(); // to empty the buffer for further inputs

            switch (choice) {
                case 1:
                    System.out.print("Enter book name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter author name: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter serial number: ");
                    String serialNumber = scanner.nextLine();

                    Book book = new Book(name, author, serialNumber);
                    library.addBook(book);

                    System.out.println("Book added successfully!");
                    System.out.println();
                    break;

                case 2:
                    if (library.getBooks().isEmpty()) // if .isEmpty() is True
                    {
                        System.out.println("No books added yet!");
                        System.out.println();
                        break;
                    }

                    System.out.println("Select a book:");
                    for (int i = 0; i < library.getBooks().size(); i++)
                    {
                        Book b = library.getBookByIndex(i);
                        System.out.println((i + 1) + ". " + b.getB_Name() + " by " + b.getB_Author());
                    }
// above for loop prints the total books with author names
                    System.out.print("Enter book index: ");
                    int bookIndex = scanner.nextInt();
                    scanner.nextLine();

                    Book selectedBook = library.getBookByIndex(bookIndex - 1);
//Above line of code minuses the entered undex as arraylist starts at 0

                    System.out.print("Enter chapters read: ");
                    int todayChapter = scanner.nextInt();
                    System.out.print("Enter time read (in minutes): ");

                    int timeRead = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter summary of what you read today: ");
                    String todaySummary = scanner.nextLine();

                    System.out.println("Progress updated successfully!");

                    System.out.println("Has Book been Completed(Y,N)?");
                   String status = scanner.nextLine();

                    selectedBook.UpdateChapter(todayChapter);
                    selectedBook.UpdateTime(timeRead);
                    selectedBook.updateSummary(todaySummary);
//updates the entered time,chpt,summary everything user reads book
                   switch (status){
                       case "Y":
                           System.out.println("YES.................");
                           selectedBook.markCompleted();
                           System.out.println();
                           saveCompletedBookData(selectedBook,library);
                           Condition = true;
                           break;
                       case "N":
                           System.out.println("NO....................");
                           break;
                       default:
                           System.out.println("Invalid input");
                           break;
                   }

//switch case is for confirmation if the book has been completed or not




                    System.out.println();
                    break;

                case 3:
                    if (library.getBooks().isEmpty()) {
                        System.out.println("No books added yet!");
                        System.out.println();
                        break;
                    }

                    System.out.println("Book Status:");
                    for (int i = 0; i < library.getBooks().size(); i++) {
                        Book b = library.getBookByIndex(i);
                        System.out.println("Book #" + (i + 1));
                        System.out.println("Name: " + b.getB_Name());
                        System.out.println("Author: " + b.getB_Author());
                        System.out.println("Serial Number: " + b.getB_SNO());
                        System.out.println("Chapters Read: " + b.getChap());
                        System.out.println("Time Read: " + b.getTime() + " minutes");
                        System.out.println("Summary: " + b.getSummary());
//above lines prints the total status of all books in inventory
                        if (Condition == true){
                            System.out.println("Book Completed");
                        }else {
                            System.out.println("Book not Complete");
                        }


                        System.out.println();

                    }

                    System.out.println();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    saveBookData(library);
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    System.out.println();
                    break;
            }
        }
    }

        private static void saveBookData(Library library) {
            try (PrintWriter writer = new PrintWriter("book_data.txt")) {
                for (Book book : library.getBooks()) {
                    writer.println("######################################");
                    writer.println("Name: " + book.getB_Name());
                    writer.println("Author: " + book.getB_Author());
                    writer.println("Serial Number: " + book.getB_SNO());
                    writer.println("Chapters Read: " + book.getChap());
                    writer.println("Time Read: " + book.getTime() + " minutes");
                    writer.println("Summary: " + book.getSummary());
                    writer.println();
                }
            } catch (FileNotFoundException e) {
                System.out.println("Failed to save book data: " + e.getMessage());

            }
    }
//above code writes the overall data IF program exits on user input of case 4
                private static void saveCompletedBookData(Book book, Library library) {
                    try (PrintWriter writer = new PrintWriter(new FileWriter("completed_books.txt", true))) {
                        writer.println("++++++++++++++++++++++++++++++++++++++++");
                        writer.println("Name: " + book.getB_Name());
                        writer.println("Author: " + book.getB_Author());
                        writer.println("Serial Number: " + book.getB_SNO());
                        writer.println("Chapters Read: " + book.getChap());
                        writer.println("Time Read: " + book.getTime() + " minutes");
                        writer.println("Summary: " + book.getSummary());
                        writer.println();

                    } catch (IOException e) {
                        System.out.println("Failed to save completed book data: " + e.getMessage());
                    }
                }
                //above code saves the complete data if the book is complete
    }




