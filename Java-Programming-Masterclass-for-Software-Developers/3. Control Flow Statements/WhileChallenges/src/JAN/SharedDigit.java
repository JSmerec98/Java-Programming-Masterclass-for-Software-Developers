package JAN;

public class SharedDigit
{
    public static boolean hasSharedDigit(int a, int b)
    {
        if(a < 10 || a > 99 || b < 10 || b > 99)
        {
            return false;
        }

        int lastA = a % 10;
        int lastB = b % 10;
        a = a / 10;
        b = b / 10;
        if(a == b || lastA == lastB || a == lastB || b == lastA)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
