public class FixedDeposit extends Bank{

    double rate;
    int duration;

    public FixedDeposit(String Name, String contact, int age, String accNumber,int d) {
        super(Name, contact, age, accNumber);
        this.rate = rate;
        this.duration = d;
    }

    @Override
    public void Deposit(double amountin)
    {
        this.Balance+= amountin;
    }
    public void Withdraw(double amountout)
    {
        if (this.duration > 365)
        {
            rate = amountout * 0.05;
            Balance -= rate;
        }
    }
    @Override
    public double ViewBalance()
    {
        return this.Balance;
    }
}
