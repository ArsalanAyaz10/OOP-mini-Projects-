public abstract class Bank {

        private String Fname;
        private String Lname;
        private double Acc_No;
        private int Age;
        public double balance;

    public Bank(String fname, String lname, int age, double balance)
    {
        this.Fname = fname;
        this.Lname = lname;
        this.Age = age;
        this.balance = balance;
    }

    public String getFname() {
            return Fname;
        }

        public void setFname(String fname) {
            Fname = fname;
        }

        public String getLname() {
            return Lname;
        }

        public void setLname(String lname) {
            Lname = lname;
        }

        public double getAcc_No() {
            return Acc_No;
        }

        public void setAcc_No(double acc_No) {
            Acc_No = acc_No;
        }

        public int getAge() {
            return Age;
        }

        public void setAge(int age) {
            Age = age;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        // Methods Below



    public abstract double Deposit(double amountin);
    public abstract  double Withdraw(double amountout);


//        public double Deposit(double amountin)
//        {
//            this.balance += amountin;
//            return this.balance;
//        }
//
//        public double Withdraw(double amountout)
//        {
//            double amountout
//        }
    }

