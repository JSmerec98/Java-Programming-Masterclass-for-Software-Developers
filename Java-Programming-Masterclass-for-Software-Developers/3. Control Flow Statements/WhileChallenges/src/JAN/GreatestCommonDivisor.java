package JAN;

public class GreatestCommonDivisor
{
    public static int getGreatestCommonDivisor(int first, int second)
    {
        if(first < 10 || second < 10)
        {
            return -1;
        }

        int GCD = 0;
        int divisor = 1;
        while(divisor < second || divisor < first)
        {
            if(first % divisor == 0 && second % divisor == 0 )
            {
                GCD = divisor;
            }

            divisor++;
        }

        return GCD;
    }
}
