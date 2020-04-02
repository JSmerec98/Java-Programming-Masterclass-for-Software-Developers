package JAN;

public class Challenge
{
    public static void main(String[] args)
    {
        System.out.println(calcFeetAndInchesToCentimeters(5, 9));
        System.out.println(calcFeetAndInchesToCentimeters(100));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches)
    {
        if(feet >= 0 && (inches >= 0 && inches <= 12))
        {
            return ((inches * 2.54) + (feet * 12)*2.54);

        }
        else
            return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches)
    {
        if(inches >= 0)
        {
            double feet = (int)inches / 12;
            double reamaningInches = (int)inches % 12;

            return calcFeetAndInchesToCentimeters(feet,reamaningInches);
        }
        else
            return -1;
    }
}
