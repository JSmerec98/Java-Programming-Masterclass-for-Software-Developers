package jan;

public class Main {

    public static void main(String[] args) {
        final BankAccount account = new BankAccount("1234-56", 1000.00);

//        Thread trThread1 = new Thread(() -> {
//            account.deposit(300.00);
//            account.withdraw(50.00);
//        });
//
//        Thread trThread2 = new Thread(() -> {
//            account.deposit(203.75);
//            account.withdraw(100.00);
//        });

        Thread trThread1 = new Thread(() -> {
            account.deposit(300.00);
            account.withdraw(50.00);
        });

        Thread trThread2 = new Thread(() -> {
            account.deposit(203.75);
            account.withdraw(100.00);
        });

        trThread1.start();
        trThread2.start();
    }
}
