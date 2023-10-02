import javax.xml.bind.SchemaOutputResolver;
import java.util.*;
public class Main {
    public static void main(String[] args) {

     Scanner Scan = new Scanner(System.in);
     Students S1 = new Students();
     Std_Array Student_Data = new Std_Array();

     S1.Name = "Arsalan Ayaz";
     S1.RegID = 2280139;
     S1.Age = 19;
     S1.Program = "BSSE";
        S1.Semester =  "2nd";
//        S1.GPA = 3.46F;

        Students S2 = new Students();

        S2.Name = "Harri";
        S2.RegID = 2280168;
        S2.Age = 19;
        S2.Program = "BSSE-2B";
        S2.Semester = "2nd";
        S2.GPA = 3.75F;

        Student_Data.add(S1);
        Student_Data.add(S2);

        System.out.println(Student_Data.Check_ID(2280139).Name);
        System.out.println(Student_Data.Check_ID(2280168).Name);

        System.out.println(Student_Data.Check_Stu("Arsalan Ayaz",0,"Bsse").GPA);
        System.out.println(Student_Data.Check_Stu("0",2280168,"BSSE-2B").GPA);

        System.out.println(Student_Data.Element_Checker(S1));
    }
}