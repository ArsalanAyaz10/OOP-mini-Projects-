public class Main {
    public static void main(String[] args) {

       info Acc1,Acc2,Acc3;

       Acc1 = new info();
       Acc2 = new info();
       Acc3 = new info();

        Acc1.NameHolder ="Arsalan Ayaz";
        Acc2.NameHolder ="Zohaib Hasan";
        Acc3.NameHolder ="Sameer Ahmed";

        Acc1.Deposit(1000);
        Acc2.Deposit(2000);
        Acc3.Deposit(3000);


        Acc2=Acc1;

        Acc1.Deposit(15000);

       System.out.println(Acc1.NameHolder);
        System.out.println(Acc1.Balance);

        System.out.println(Acc2.NameHolder);
        System.out.println(Acc2.Balance);

        System.out.println(Acc3.NameHolder);
        System.out.println(Acc3.Balance);

    }
}