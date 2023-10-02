import java.util.*;

public class UserAuntication {

    private ArrayList<Bank> accounts = new ArrayList();
    private Scanner scan = new Scanner(System.in);

//    public UserAuntication(ArrayList<Bank> accounts, Scanner scan) {
//        this.accounts = accounts;
//        this.scan = scan;
//    }

    public void app() {
        while (true) {
            System.out.println("------Banking System------");
            System.out.println("1.Create Account!");
            System.out.println("2.Login");
            System.out.println("3.Sign Up");
            System.out.println("Enter your Choice!");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Existing System......");
                    System.exit(0);
                default:
                    System.out.println("INVALID CHOICE TRY AGAIN");
            }
        }
    }

    private void createAccount() {
        System.out.println("Enter Account Name:");
        String AccNumber = scan.next();
        System.out.println("Enter User Name:");
        String name = scan.next();
        System.out.print("Enter age: ");
        int age = scan.nextInt();
        System.out.print("Enter contact: ");
        String contact = scan.next();

        System.out.print("Enter account type (" +
                "1. Current," +
                " 2. Savings," +
                " 3. Forex," +
                " 4. Fixed Deposit): ");
        int accountType = scan.nextInt();

        switch (accountType) {
            case 1:
                CurrentAcc Current = new CurrentAcc(AccNumber, name, age, contact);
                accounts.add(Current);
                System.out.println("Current account created successfully!");
                break;
            case 2:
                SavingAcc saving = new SavingAcc(AccNumber, name, age, contact);
                accounts.add(saving);
                System.out.println("Savings Account Created successfully");
            case 3:
                Forex forexAcc = new Forex(AccNumber, name, age, contact);
                accounts.add(forexAcc);
                System.out.println("Forex account created successfully!");
                break;
            case 4:
                System.out.print("Enter duration (in days): ");
                int duration = scan.nextInt();
                FixedDeposit FDAcc = new FixedDeposit(AccNumber, name, age, contact, duration);
                accounts.add(FDAcc);
                System.out.println("Fixed deposit account created successfully!");
                break;
            default:
                System.out.println("Invalid account type! Please try again.");

        }
    }

    private void login()
    {
        System.out.println("Enter Account Number: ");
        String AccNumber = scan.next();

        Bank acc = getAccount(AccNumber);
        if(acc == null)
        {
            System.out.println("ACCOUNT NOT FOUND! PLEASE CREATE ONE !");
            return;
        }

        System.out.println("Logged INTO ACCOUNT" + AccNumber);
        System.out.println("Account Holder: ");
        //System.out.println("Account balance: " + account.getBalance());
    }
    private Bank getAccount(String Accnumber)
    {
        for(Bank account :accounts)
        {
            if(account.AccNumber.equals(Accnumber));
            return account;
        }
        return null;
    }

}