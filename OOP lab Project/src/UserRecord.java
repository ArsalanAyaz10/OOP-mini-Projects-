import java.util.ArrayList;
import java.util.List;

public class UserRecord {
    private String userName;
    private int userRegID;
    private List<Book> booksPurchased;
    private List<Book> booksLoaned;

    public UserRecord(String userName, int userRegID) {
        this.userName = userName;
        this.userRegID = userRegID;
        this.booksPurchased = new ArrayList<>();
        this.booksLoaned = new ArrayList<>();
    }

    // Methods to add purchased and loaned books

    public void addPurchasedBook(Book book) {
        booksPurchased.add(book);
    }

    public void addLoanedBook(Book book) {
        booksLoaned.add(book);
    }

    // Method to generate bill for purchased books

    public void generateBillForPurchasedBooks() {
        System.out.println("Generating bill for purchased books - User: " + userName);

        double totalAmount = 0.0;

        for (Book book : booksPurchased) {
            System.out.println("Title: " + book.getB_Name());
            System.out.println("Author: " + book.getB_Author());
            System.out.println("Serial No: " + book.getSerialNo());
            System.out.println("Price: $" + book.getB_Price());

            totalAmount += book.getB_Price();
        }

        System.out.println("Total Amount: $" + totalAmount);
        System.out.println();
    }

    // Method to generate bill for loaned books

    public void generateBillForLoanedBooks() {
        System.out.println("Generating bill for loaned books - User: " + userName);

        double totalAmount = 0.0;
        double loanFee = 0.0;

        for (Book book : booksLoaned) {
            System.out.println("Title: " + book.getB_Name());
            System.out.println("Author: " + book.getB_Author());
            System.out.println("Serial No: " + book.getSerialNo());
            System.out.println("Price: $" + book.getB_Price());

            totalAmount += book.getB_Price();
            loanFee += calculateLoanFee(book);
        }

        System.out.println("Total Amount: $" + totalAmount);
        System.out.println("Loan Fee: $" + loanFee);
        double totalAmountDue = totalAmount + loanFee;
        System.out.println("Total Amount Due: $" + totalAmountDue);
        System.out.println();
    }

    private double calculateLoanFee(Book book) {
        return book.getB_Price() * 0.1;
    }
}
