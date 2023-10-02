public class SavingAcc extends Bank{

    double rate;

    public SavingAcc(String Name, String contact, int age, String accNumber) {
        super(Name, contact, age, accNumber);
        this.rate = rate;
    }

    @Override
    public void Deposit(double amountin)
    {
        this.Balance+= amountin;
    }
    public void Withdraw(double amountout)
    {
        rate  = amountout*0.015;
        Balance -=rate;
    }
    @Override
    public double ViewBalance()
    {
        return this.Balance;
    }
}
