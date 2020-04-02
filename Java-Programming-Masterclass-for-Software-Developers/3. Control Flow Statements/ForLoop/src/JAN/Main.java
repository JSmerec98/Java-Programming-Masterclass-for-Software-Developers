package JAN;

public class Main {

    public static void main(String[] args)
    {
        //System.out.println("10000 at 2 % interest = " + calculateInterest(10000.0,2.0));

//        for(int i = 2; i < 9; i++)
//        {
//            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000,i)));
//        }
//
//        for(int i = 8; i > 1; i--)
//        {
//            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000,i)));
//        }

        int primeCount = 0;
        for(int i = 1; i < 8; i++)
        {
            if(isPrime(i))
            {
                primeCount++;
                System.out.println(i + " is prime number!");

                if(primeCount > 3)
                {
                    System.out.println("Exiting the loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n )
    {
        if(n == 1)
            return false;
        for(int i = 2; i <= n/2; i++)
        {
            if(n % i == 0)
                return false;
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate)
    {
        return(amount * (interestRate / 100));
    }
}
