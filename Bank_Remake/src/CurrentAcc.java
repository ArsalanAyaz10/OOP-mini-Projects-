public class CurrentAcc extends Bank {

    public double interest;

    public CurrentAcc(String Name, String contact, int age, String accNumber) {
        super(Name, contact, age, accNumber);
        this.interest = interest;
    }

    @Override
    public void Withdraw(double amount)
    {
        interest  = amount*0.1;
        Balance -=interest;
    }
    @Override
    public void Deposit(double amount)
    {
        this.Balance+=amount;
    }
    @Override
    public double ViewBalance()
    {
        return this.Balance;
    }
}
