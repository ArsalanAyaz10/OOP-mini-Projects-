import java.util.*;
public class Stu_Data {

    Date dt = new Date();

    int year = dt.getYear() - 1900;
    private String Name;
    private String Department;
    private int Age;
    private String RegID;
    private static int  counter = 0;

    public Stu_Data(String name, String department) {
        this.setName(name);
        this.setDepartment(department);
        this.setRegID();
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        if (name.length() >=5) {
            Name = name;
        }
        else {
            System.out.println("Name must be 5 characters long");
        }
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        if (age>=18 ) {
            this.Age = age;
        }
        else {System.out.println("Under 18 INVALID!");}
    }

    public String getRegID() {
        return RegID;
    }

    public void setRegID() {
        RegID = this.Department.substring(0,2) + year + this.counter;
        this.counter++;
    }
}
