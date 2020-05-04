package jan;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class BanAccountTestPArameterized {

    private BankAccount account;
    private double amount;
    private boolean branch;
    private double expected;

    public BanAccountTestPArameterized(double amount, boolean branch, double expected) {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @org.junit.Before
    public void setup() {
        account = new BankAccount("Jan","Smerecki",1000.00,BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][] {
                {100.00,true,1100.00},
                {200.00,true,1200.00},
                {300.24,true,1300.24},
                {1000.00,true,2000.00}
        });
    }

    @org.junit.Test
    public void deposit() {
        account.deposit(amount, branch);
        assertEquals(expected, account.getBalance());
    }
}
