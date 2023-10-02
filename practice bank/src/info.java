public class info {

    public String NameHolder;
    public double Fee = 5.25F;
    public double Irate = 3.5F;
    public double Balance;
    public double Deposit(double amount)
    {
        this.Balance+= amount;
        return this.Balance;

    }
    public double Withdraw(double amount)
    {
        this.Balance-=amount;
        return this.Balance;
    }

}
