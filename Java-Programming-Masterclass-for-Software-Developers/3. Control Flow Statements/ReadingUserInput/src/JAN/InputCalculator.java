package JAN;

import java.util.Scanner;

public class InputCalculator
{
    public static void inputThenPrintSumAndAverage()
    {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while(true)
        {
            boolean test = scanner.hasNextInt();

            if(test)
            {
                int number = scanner.nextInt();
                sum += number;
                count++;
            }
            else
            {
                if(count == 0)
                {
                    System.out.println("SUM = 0 AVG = 0");
                }
                else
                {
                    double avg = sum / (double)count;
                    System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
                }
                break;
            }
        }
    }

    public static void main(String[] args)
    {
        inputThenPrintSumAndAverage();
    }
}
