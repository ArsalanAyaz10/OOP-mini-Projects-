public class Person {

    private String Name;
    private static int Counter= 0;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        if (name.length() > 5)
        {Name = name+ this.Counter;}
    }
    public Person(String name, String department) {
        this.setName(name);
    }
    public String getInitial()
    {
        return this.Name.charAt(0)  +
                this.Name.substring(this.Name.indexOf(" ") + 1,
                        this.Name.indexOf(" ") + 2);
        return this.Name.substring(0,1);
    }


}
