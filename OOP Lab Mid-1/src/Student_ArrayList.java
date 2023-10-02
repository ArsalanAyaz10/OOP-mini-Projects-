import java.util.*;
public class Student_ArrayList {

    Date dt = new Date();
    private String Name;
    private String Department;
    private String Section;
    private String RegID;
    public  int counter= 0;

    public Student_ArrayList() {
        System.exit(counter);
    }


    public String getRegID() {
        return RegID;
    }

    int year = dt.getYear()-1900;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        Section = section;
    }

    public Student_ArrayList(String name, String department, String section) {
       this.setName(name);
       this.setDepartment(department);
       this.setSection(section);
       this.setRegID();
    }

    public String setRegID()
    {
        RegID = this.year + this.Department.substring(0,2)+this.counter;
        counter++;
        return RegID;
    }
}
