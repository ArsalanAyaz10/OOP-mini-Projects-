import java.util.*;
public class Main {

    public static void main(String[] args) {

    String name = "null";
    String department = "null";
    String Section = "null";

//        Quiz_tru Truck = new Quiz_tru();
        Scanner Scan = new Scanner(System.in);
        ArrayList<Student_ArrayList> DATA = new ArrayList<>();
        ArrayList<Stu_Data> list = new ArrayList<>();

       for (int i=0;i<3;i++)
       {
           System.out.print("Enter Name:");
           name =Scan.nextLine();

           System.out.print("Enter department:");
           department =Scan.nextLine();

           System.out.print("Enter Section:");
           Section =Scan.nextLine();

       }

        DATA.add(new Student_ArrayList(name,department,Section));
       DATA.remove((1));

        System.out.println();


//        for (Student_ArrayList stu: DATA)
//        {
//            System.out.println("Student Information:");
//            System.out.println("Name: "+ stu.getName() + "Depmartment: " + stu.getDepartment() + "RegID: " + stu.getRegID());
//        }

    }

}