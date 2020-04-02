package JAN;

public class LargestPrime
{
    public static void main(String[] args)
    {
        System.out.println(getLargestPrime(45));
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }

        int greatestDivisor = 0;
        int greatestPrime = 0;
        int numberOfDivisors = 0;

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                greatestDivisor = i;

                for (int j = 1; j <= greatestDivisor; j++) {
                    if (greatestDivisor % j == 0) {
                        numberOfDivisors++;
                    }
                }
                if (numberOfDivisors == 2) {
                    greatestPrime = greatestDivisor;
                    numberOfDivisors = 0;
                }
            }
        }
        return greatestPrime;
    }
}
