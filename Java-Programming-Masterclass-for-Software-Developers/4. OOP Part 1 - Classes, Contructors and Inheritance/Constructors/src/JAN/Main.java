package JAN;

public class Main {

    public static void main(String[] args)
    {
//        BankAccount janAccount = new BankAccount(); //"12345", 0.00, "Jan Jano", "myemal@gmail.com", "123 456 789");
//
//        System.out.println(janAccount.getAccountNumber());
//        System.out.println(janAccount.getBalance());
//
//        janAccount.withdraw(100.0);
//        janAccount.deposit(50.0);
//        janAccount.withdraw(100.0);
//
//        BankAccount timsAccount = new BankAccount("Tim","tim@mail.com","12345");
//        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());

        VipCustomer vip = new VipCustomer("Jan", 12345, "jan@gmail.com");
        System.out.println(vip.getName() + " " + vip.getCreditLimit() + " " + vip.getEmailAddress());

        VipCustomer vip2 = new VipCustomer("Jan", 12345);
        System.out.println(vip2.getName() + " " + vip2.getCreditLimit() + " " + vip2.getEmailAddress());

        VipCustomer vip3 = new VipCustomer();
        System.out.println(vip3.getName() + " " + vip3.getCreditLimit() + " " + vip3.getEmailAddress());
    }
}
