package JAN;

public class LastDigitChecker
{
    public static boolean hasSameLastDigit(int a, int b, int c)
    {
        if(!isValid(a) || !isValid(b) || !isValid(c))
        {
            return false;
        }

        int lastA = a % 10;
        System.out.println(lastA);

        int lastB = b % 10;
        System.out.println(lastB);

        int lastC = c % 10;
        System.out.println(lastC);


        return lastA == lastB ||
                lastA == lastC ||
                lastB == lastC;
    }

    public static boolean isValid(int x)
    {
        return (x >= 10 && x <= 1000);
    }
}
