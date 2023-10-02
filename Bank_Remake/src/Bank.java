public class Bank {

    //Variables needed for account creation
    private String name;
    private String contact;
    private int Age;
    public String AccNumber;
    public double Balance;

    public Bank(String Name,String contact, int age, String accNumber) {
        name = Name;
        this.contact = contact;
        Age = age;
        AccNumber = accNumber;
        Balance = 0.0;
    }

    //Methods

    public void Deposit(double amount)
    {
        Balance += amount;
    }

    public void Withdraw(double amount)
    {
        this.Balance-=amount;
    }
    public double ViewBalance()
    {
        return Balance;
    }

}
