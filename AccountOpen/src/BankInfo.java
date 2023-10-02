public class BankInfo {

    private String Name;
    private int AccNumber;
    private byte Age;
    public float Fee = 0.025F;
    public float Irate = 0.05F;
    private double Balance = 0;
    private int Passcode;


  public String getName()
  {
      return Name;
  }
  public String setName(String n)
  {
      Name = n;
      return n;
  }

    public int setAccNumber(int num)
    {
        AccNumber = num;
        return num;
    }
    public int getAccNumber()
    {
        return AccNumber;
    }

    public byte setAge(byte A)
    {
        if (A>=18)
        {
            Age = A;
            return Age;
        }
        else
        {
            System.out.println("Age less than 18");
        }
        return 0;
    }
    public byte getAge()
    {
        return Age;
    }

    public int setPasscode(int passcode)
    {
        this.Passcode=passcode;
        return passcode;
    }
    public int getPasscode()
    {
        return Passcode;
    }

    public double Deposit(double amount)
    {
        if (amount>=50000)
        {
            this.Balance+=amount*Irate;
        }
        else
        {
            this.Balance+=amount;
        }
        return Balance;
    }

    public BankInfo(String name, int accNumber, byte age, double balance, int passcode) {
       this.setName(name);
        this.setAccNumber(accNumber);
        this.setAge(age);
        this.setBalance(balance);
        this.setPasscode(passcode);
    }

    public double Withdraw(double amountout)
    {
        if (amountout >50000)
        {
            this.Balance -= amountout * Fee;
        }
        else
        {
            this.Balance -= amountout;
        }
        return this.Balance;
    }

    public Double setBalance(double balance)
    {
        this.Balance=balance;
        return getBalance();
    }
    public Double getBalance()
    {
        return Balance;
    }
}
