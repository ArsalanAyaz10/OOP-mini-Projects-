import java.util.*;
public class Std_Array {

    ArrayList<Students> List1 = new ArrayList<>();

    public void add(Students S1) {
        List1.add(S1);
    }

    public void Delete(Students S1) {
        List1.remove(S1);
    }

    public void clear(Students S1) {
        List1.clear();
    }

    public Students Check_ID(int id)
    {
        for (Students S1:List1)
        {
             if (S1.RegID == id)
             {
                 return S1;
             }
        }
        return new Students();
    }

    public Students Check_Name(String name)
    {
        for (Students S1: List1)
        {
            if (S1.getName() == name)
            {
                return S1;
            }
        }
        return new Students();
    }

    public Students Check_Stu(String name,int ID, String program)
    {
        for (Students S1:List1)
        {
            if (S1.RegID == ID || S1.Name == name || S1.Program == program)
            {
                return S1;
            }
        }
        return new Students();
    }

    public Students ComGPA(float gpa)
    {
        for (Students S1:List1)
        {
            if (S1.GPA >= 3.50F)
            {
                System.out.println("High Achiever");
            }

        }
        return new Students();
    }

    public boolean Element_Checker(Students S1)
    {
        if (List1.contains(S1.RegID));
        return true;

}
