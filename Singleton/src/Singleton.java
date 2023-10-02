public class Singleton {

   private static Singleton Instance;
   private String Name;
   private Singleton(String name){this.Name = name;}

    public String getName() {return Name;}

    public void setName(String name) {Name = name;}

    public static Singleton getObject(String name)
    {
        if (Instance == null)
        {Instance = new Singleton(name);}
        return Instance;
    }
}
