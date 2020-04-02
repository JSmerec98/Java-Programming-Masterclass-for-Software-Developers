package JAN;

public class BankAccount
{
    private String accountNumber;
    private double balance;
    private String customerName;
    private String eMail;
    private String phoneNumber;

    public BankAccount()
    {
        this("56789",2.50,"Default - name", "Default address", "Default phone");
        System.out.println("Empty contructor called");
    }

    public BankAccount(String customerName, String eMail, String phoneNumber)
    {
        this("99999",100.55,customerName,eMail,phoneNumber);
    }

    public BankAccount(String accountNumber, double balance, String customerName, String eMail, String phoneNumber)
    {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.eMail = eMail;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public void seteMail(String eMail)
    {
        this.eMail = eMail;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public String geteMail()
    {
        return eMail;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void deposit(double depositAmount)
    {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdraw(double withdrawalAmount)
    {
        if(this.balance - withdrawalAmount < 0)
        {
            System.out.println("Ony " + this.balance + " available. Withdrawal not processed");
        }
        else
        {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaning balance = " + this.balance);
        }
    }
}
