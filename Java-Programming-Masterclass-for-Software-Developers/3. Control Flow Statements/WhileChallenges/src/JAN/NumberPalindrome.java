package JAN;

public class NumberPalindrome
{
    public static boolean isPalindrome(int number)
    {
        int x = number;
        int reversed = 0;

        while(x != 0)
        {
            reversed = reversed * 10;

            reversed += (x % 10);
            x /= 10;
        }

        return reversed == number;
    }
}
