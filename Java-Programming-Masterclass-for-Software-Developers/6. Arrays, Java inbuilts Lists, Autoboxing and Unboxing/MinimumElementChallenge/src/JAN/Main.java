package JAN;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Enter the count: \r");
        int count = scanner.nextInt();

        int [] array = readIntegers(count);

        System.out.println("Minimum value of array is " + findMin(array));
    }

    public static int [] readIntegers(int number)
    {
        int [] array = new int[number];

        System.out.println("Enter the integers: \r");

        for(int i = 0; i < array.length; i++)
        {

            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int findMin(int [] array)
    {
        int min = Integer.MAX_VALUE;

        for (int value : array)
        {
            if (value < min)
            {
                min = value;
            }
        }

        return min;
    }
}
