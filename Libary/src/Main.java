import java.time.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Libary_Info> lib = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String bookName;
        String authorName;
        int bookQuantity;
        float bookPrice;
        int bookSerialNum;

        bookName = "Alice in Wonderland";
        authorName = " Lewis Carroll";
        bookQuantity = 150;
        bookPrice = 4500f;
        bookSerialNum = 2290123;

//        Libary_Info l1 = new Libary_Info(bookName,authorName,bookQuantity,bookPrice,bookSerialNum);

        lib.add(new Libary_Info(bookName,authorName,bookQuantity,bookPrice,bookSerialNum));

        bookName = "Harry Potter";
        authorName = "JK Rowling";
        bookQuantity = 230;
        bookPrice = 5500f;
        bookSerialNum = 2291135;

//        Libary_Info l2 = new Libary_Info(bookName,authorName,bookQuantity,bookPrice,bookSerialNum);

        lib.add(new Libary_Info(bookName,authorName,bookQuantity,bookPrice,bookSerialNum));


//        l1.BuyBook("Alice in Wonderland","Lewis Carroll",2290123);

        for (Libary_Info book:
              lib) {
            book.LoanBook("Alice in Wonderland","Lewis Carroll",2290123);
            book.LoanBook("Alice in Wonderland","Lewis Carroll",2290123);
            book.LoanBook("Alice in Wonderland","Lewis Carroll",2290123);
        }
    }
}