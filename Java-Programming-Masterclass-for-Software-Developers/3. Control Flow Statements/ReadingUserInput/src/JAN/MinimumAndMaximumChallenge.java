package JAN;

import javax.print.DocFlavor;
import javax.swing.*;
import java.util.Scanner;

public class MinimumAndMaximumChallenge
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//        boolean first = true;

        while (true)
        {
            System.out.println("Enter number:");
            boolean test = scanner.hasNextInt();

            if(test)
            {
                int number = scanner.nextInt();
//                if(first )
//                {
//                    first = false;
//                    min = number;
//                    max = number;
//                }

                if(number > max)
                {
                    max = number;
                }
                if(number < min)
                {
                    min = number;
                }
            }
            else
            {
                break;
            }
        }

        System.out.println("Max is equal to " + max);
        System.out.println("Min is equal to " + min);

        scanner.close();
    }
}
