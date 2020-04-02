package JAN;

import java.util.Scanner;

public class ReadingUserInputChallenge
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int i = 1;
        int sum = 0;

        while(true)
        {
            System.out.println("Enter number #" + i + ":");

            boolean test = scanner.hasNextInt();

            if(test)
            {
                int number = scanner.nextInt();
                sum += number;
                i++;
                if(i > 10)
                {
                    break;
                }
            }
            else
            {
                System.out.println("Invalid Number");
            }

            scanner.nextLine();
        }

        System.out.println("Sum is equal to " + sum);

        scanner.close();
    }


}
