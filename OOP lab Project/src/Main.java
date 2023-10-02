import java.util.*;
public class Main {
    public static void main(String[] args) {

        Library_ArrayList lib = new Library_ArrayList();
        Scanner scan = new Scanner(System.in);


        Book b1 = new Book("far from the madding crowd","thomas hardy","Adventure","2280139",1500,35);
        Book b2 = new Book("Fumbled","Osho","Adventure","2280191",24100,15);
        Book b3 = new Book("Very Small Shops","John Stones","Architecture","2260121",7600,120);
        Book b4 = new Book("The Adventures of Huckleberry Finn","Mark Twain","Adventure","2280131",3540,89);
        UserRecord U1 = new UserRecord("Zohaib",1001);

        String g;


        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);
        lib.addBook(b4);

        System.out.println("Enter Genre to Search for Books:");
        g = scan.nextLine();
       lib.displayBooksByGenre(g);


        System.out.println("Enter Serial No to Search for Books:");
        g = scan.nextLine();
        lib.displayBooksByGenre(g);

        System.out.println("Enter UserName to loan Book");
       System.out.println(lib.LoanBook("Arsalan","1004","2280139",2));


    }
}