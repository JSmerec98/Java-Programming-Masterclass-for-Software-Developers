package HELLO;

public class Challenge
{
    public static void main(String[] args)
    {
        double var = 20.00d;

        double secdondVar = 80.00d;

        double sum = (var + secdondVar) * 100.00;

        double rem = sum % 40.00;

        boolean test = (rem == 0) ? true : false;

        System.out.println("Remainder = " + test);

        if(!test)
        {
            System.out.println("Got some remainder");
        }
    }
}
