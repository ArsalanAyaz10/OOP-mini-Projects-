public class Forex extends Bank{
    double iRate;

    public Forex(String Name, String contact, int age, String accNumber) {
        super(Name, contact, age, accNumber);
        this.iRate = iRate;
    }

    @Override
    public void Deposit(double amountin)
    {
        this.Balance+= amountin;
    }
    public void Withdraw(double amountout)
    {
        iRate  = amountout*0.04;
        Balance -=iRate;
    }
    @Override
    public double ViewBalance()
    {
        return this.Balance;
    }
}
