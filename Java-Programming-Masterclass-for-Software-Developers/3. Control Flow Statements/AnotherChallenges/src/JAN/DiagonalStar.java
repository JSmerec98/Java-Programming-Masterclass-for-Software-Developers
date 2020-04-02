package JAN;

public class DiagonalStar
{
    public static void printSquareStare(int number)
    {
        if(number < 5)
        {
            System.out.println("Invalid Value");
            return;
        }

        for(int i = 0; i < number; i++)
        {
            for(int j = 0; j < number; j++)
            {
                if(i == 0 || j == 0 || i == number - 1 || j == number - 1 || i == j || j == (number)-2 - i + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        printSquareStare(10);
    }
}
