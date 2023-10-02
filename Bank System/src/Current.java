public class Current extends Bank {

    public float Irate = 0.01f;

    public Current(float IRate, String Fname, String Lname, int Age, double balance) {
        super(Fname, Lname, Age, balance);
    }

    @Override
    public double Deposit(double amountin) {
        this.balance += amountin;
        return this.balance;
    }

    @Override
    public double Withdraw(double amountout) {
        if (balance > amountout) {
            balance -= amountout;
            balance*=Irate;
            return this.balance;
        }
        System.out.println("INSUFFICENT BALANCE");
       return amountout;
    }
}

