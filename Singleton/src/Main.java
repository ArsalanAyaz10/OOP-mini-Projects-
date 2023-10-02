public class Main {
    public static void main(String[] args) {
//        OOP obj1 = OOP.getInstance();
//        OOP obj2 = OOP.getInstance();

        Singleton S1 = Singleton.getObject("Ahmed");

        System.out.println(S1.getName());
    }
}
//class OOP{
//    static OOP obj;
//    private OOP() {System.out.println("INSTANCE CREATED HERE");}
//    public static OOP getInstance()
//    {
//        if (obj == null)
//        {
//            obj = new OOP();
//        }
//        return obj;
//    }
//}