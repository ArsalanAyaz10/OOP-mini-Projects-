import java.util.*;
public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        ArrayList<Stu_Data> stu = new ArrayList<>();
        String NAME= "NULL";
        String Department = "null";
        Person p = new Person(NAME,Department);



        System.out.println("Enter Full Name with space saperated");
       NAME =  scan.nextLine();

        System.out.println("Enter Department with space saperated");
        Department =  scan.nextLine();

        System.out.println("Your Name initials are:");
        System.out.println( p.getInitial() );


    }
}