public class Fixed_Deposit extends Bank{
    private float irate = 0.05f;

    public Fixed_Deposit(String fname, String lname, int age, double balance) {
        super(fname, lname, age, balance);
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
            balance *= irate;
            return this.balance;
        }
        System.out.println("NOT ENOUGH MONEY IN ACCOUNT");
        return amountout;
    }

}
