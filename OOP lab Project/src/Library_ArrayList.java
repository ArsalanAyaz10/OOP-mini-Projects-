import java.util.*;
public class Library_ArrayList {
    public ArrayList<Book> books = new ArrayList<>();



    public void addBook(Book B1) {
        books.add(B1);
    }

    //    public void AddAllBooks(Book B1,Book B2,Book B3)
//    {
//        books.addAll(B1);
//    }

    public void removeBook(Book B1) {
        books.remove(B1);
    }

    public List<Book> displayBooksByGenre(String genre) {
        System.out.println("Books in the " + genre + " genre:");

        List<Book> matchingBooks = new ArrayList<>();

        for (Book b : books) {
            if (Objects.equals(b.getGenre(), genre)) {
                System.out.println("Title: " + b.getB_Name() + ", Author: " + b.getB_Author() + ", Serial No: " + b.getSerialNo());
                matchingBooks.add(b);
            }
        }
        return matchingBooks;
    }

    public Book getBySerialNo(String Sno) {
        boolean found_Sno = false;
        System.out.println("Book of the Serial Number:" + Sno + "is:");
        for (Book b : books) {
            if (b.getSerialNo().equalsIgnoreCase(Sno)) {
                System.out.println("Title: " + b.getB_Name() + ", Author: " + b.getB_Author() + ", Genre: " + b.getGenre());
                found_Sno = true;
            }
        }
        return null;
    }
String loan = "Loaned Succesfully";
    public String LoanBook(String UserName, String RegID, String bookSerialNum, int quantity) {
        for (Book b : books) {
            b.UpdateQuantity(quantity);
            if (Objects.equals(bookSerialNum, b.getSerialNo())) {
                if (quantity <= b.getB_Quantity()) {
                    System.out.println("Book Bought by:" + UserName + "of Regestration ID:" + RegID + "Are:\n" +
                            "Details of books:\n"
                            + b.getB_Name() + ", Author: " + b.getB_Author() + ", Genre: " + b.getGenre());

                }
            }
        }
        System.out.println();
        return loan;
    }


    public void BuyBook(String UserName, String RegID, String bookSerialNum, int quantity, float Price) {
        boolean Buy = false;
        for (Book b : books) {
            if (Objects.equals(bookSerialNum, b.getSerialNo())) {
                if (quantity <= b.getB_Quantity()) {
                    System.out.println("Book Bought by:" + UserName + "of Regestration ID:" + RegID + "Are:\n" +
                            "Details of books:\n"
                            + b.getB_Name() + ", Author: " + b.getB_Author() + ", Genre: " + b.getGenre() + "Of Price" + Price);
                    b.UpdateQuantity(quantity);
                    Buy = true;
                } else {
                    System.out.println("Book Sold Out");
                }

            } else {
                System.out.println("NO MATCH FOUND");
            }

        }
    }

}
