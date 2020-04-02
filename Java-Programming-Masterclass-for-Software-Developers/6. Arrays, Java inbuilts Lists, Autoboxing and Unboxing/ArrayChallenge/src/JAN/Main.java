package JAN;

import java.util.Scanner;

public class Main
{
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
	    int [] array = getIntegers(5);

	    printArray(array);
	    array = sortIntegers(array);
	    printArray(array);
    }

    public static int [] getIntegers(int number)
    {
        int [] array = new int[number];
        System.out.println("Enter " + number + " integers: \r");

        for(int i = 0; i < array.length; i++)
        {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int [] array)
    {
        System.out.println("Array:");
        for(int i = 0; i < array.length; i++)
        {
            System.out.println("Element " + i + ". = " + array[i]);
        }
    }

    public static int [] sortIntegers(int [] array)
    {
        int [] sortedArray = new int [array.length];

        int max = Integer.MIN_VALUE;
        int newMax = Integer.MAX_VALUE;

        for(int j = 0; j < sortedArray.length; j++)
        {
            for (int i = 0; i < array.length; i++)
            {
                if (array[i] > max && array[i] < newMax)
                {
                    max = array[i];
                }
            }

            sortedArray[j] = max;
            newMax = max;
            max = Integer.MIN_VALUE;
        }

        return sortedArray;
    }
}
