class Account
{
    private int accountNumber;
    private double balance;
    public Account(int accountNumber, double balance)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public double getBalance() {
        return balance;
    }

    // Using 'protected' means only subclasses (like PremiumAccount) can change the balance freely
    protected void setBalance(double newBalance) {
        this.balance = newBalance;
    }
    public void deposit(double amount)
    {
        balance+=amount;
        System.out.println(amount+" credited");
    }
    public void withdraw(double amount)
    {
        if(balance<amount)
        {
            System.out.println("Insufficient balance");
        }
        else
        {
            balance=balance-amount;
            System.out.println(amount+" withdrawn");
        }
    }
}

class PremiumAccount extends Account
{
    public PremiumAccount(int accountNumber, double b)
    {
        super(accountNumber, b);
    }
    

    public void withdraw(double amount)
    {
        double balance=getBalance();
        if(balance<amount && amount<=5000)
        {
            balance=balance-amount;
            System.out.println(amount+" withdrawn");
        }
        else if(balance>amount)
        {
            balance=balance-amount;
            System.out.println(amount+" withdrawn");
        }
        else
        {
            System.out.println("insufficient balance and over -5000 limit");
        }
        setBalance(balance);
    }
}

public class test3 {
    public static void main(String[] args)
    {
        PremiumAccount obj=new PremiumAccount(777, 0);
        obj.deposit(1000);
        obj.withdraw(4000);
    }
}
