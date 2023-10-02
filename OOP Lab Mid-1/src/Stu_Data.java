import java.util.*;
public class Stu_Data {

    ArrayList<Student_ArrayList> List = new ArrayList<>();

    public void add(Student_ArrayList stu)
    {
        List.add(stu);
    }


    public Student_ArrayList getViaRegID(String id)
    {
        for (Student_ArrayList stu:
             List)
        {
            if (stu.getRegID() == id)
            {
                return stu;
            }
        }
        return new Student_ArrayList();
    }
}
