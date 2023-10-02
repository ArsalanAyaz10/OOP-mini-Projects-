import java.util.*;
import java.time.*;
public class Libary_Info {

    Date dt = new Date();
    private String BookName;
    private String AuthorName;
    public int BookQuantity;
    private float BookPrice;
    private int BookSerialNum;

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName)
    {
        AuthorName = authorName;
    }

    public int getBookQuantity(

    ) {
        return BookQuantity;
    }

    public void setBookQuantity(int bookQuantity) {
        BookQuantity = bookQuantity;
    }

    public float getBookPrice() {
        return BookPrice;
    }
    // there should be a loan system and a buying system
    public void setBookPrice(float bookPrice) {
        if (bookPrice > 2000) {
            BookPrice = bookPrice;
        } else {
            System.out.println("Price must be above Rs 2000");
        }
    }

    public int getBookSerialNum() {

        return BookSerialNum;
    }

    public void setBookSerialNum(int bookSerialNum) {
        if (bookSerialNum >= 8) {
            BookSerialNum = bookSerialNum;
        } else {
            System.out.println("INVALID SERIAL");
        }
    }


    public Libary_Info(String bookName, String authorName, int bookQuantity, float bookPrice, int bookSerialNum) {
        this.setBookName(bookName);
        this.setAuthorName(authorName);
        this.setBookQuantity(bookQuantity);
        this.setBookPrice(bookPrice);
        this.setBookSerialNum(bookSerialNum);
    }

    public void BuyBook(String bookName, String authorName, int bookSerialNum)
    {
       if (bookName== this.BookName || authorName==this.AuthorName || bookSerialNum == this.BookSerialNum)
       {
           if (this.BookQuantity > 0)
           {
               System.out.println("Process Completed");
               System.out.println("Detucted Rs" + this.getBookPrice());
               this.BookQuantity--;
               System.out.println(this.BookQuantity);
           }
           else {
               System.out.println("BOOK SOLD OUT");
           }

        }
       else {
           System.out.println("INVALID DATA NOT FOUND");
       }
    }   // buying system

    public void LoanBook(String bookName,String authorName,int bookSerialNum)
    {
        if (bookName== this.BookName || authorName==this.AuthorName || bookSerialNum == this.BookSerialNum)
        {
            if (this.BookQuantity > 0)
            {
                System.out.println("Today's Date is " + java.time.LocalDate.now());
                System.out.println("Reuturn in 7 Days on" + java.time.LocalDate.now());
                System.out.println("Amount is Rs " + this.BookPrice/7);
                this.BookQuantity--;
                System.out.println(this.BookQuantity);
            }
           else {
            System.out.println("BOOK SOLD OUT");
        }

        }
    } // loan system
}
// there should be a loan system and