package JAN;

public class NumberToWords
{
    public static void main(String[] args)
    {
        System.out.println(getDigitCount(12));
        System.out.println(getDigitCount(0));

    }

    public static void numberToWords(int number)
    {
        if(number < 0)
        {
            System.out.println("Invalid Value");
        }

        int dig1 = getDigitCount(number);
        number = reverse(number);
        int dig2 = getDigitCount(number);

        if(number == 0)
        {
            System.out.println("Zero");
        }

        int digit = 0;
        while(number != 0)
        {
            digit = number % 10;

            switch (digit)
            {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }

            number /= 10;
        }

        if(dig1 != dig2)
        {
            for(int i = 0; i < (dig1 - dig2); i++)
            {
                System.out.print("Zero ");
            }
        }

        System.out.println();
    }

    public static int reverse(int number)
    {
        int reversed = 0;

        while(number != 0)
        {
            reversed = reversed * 10;
            reversed += (number % 10);
            number /= 10;
        }

        return reversed;
    }

    public static int getDigitCount(int number)
    {
        if(number < 0)
        {
            return -1;
        }

        int count = 1;
        number /= 10;
        while(number != 0)
        {
            number /= 10;
            count ++;
        }

        return count;
    }
}
