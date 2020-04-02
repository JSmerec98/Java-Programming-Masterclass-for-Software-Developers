public class SpeedConverter
{
    public static long toMilesPerHour(double kilometersPerHour)
    {
        if(kilometersPerHour < 0)
            return -1;
        else
        {
            double myMiles =  kilometersPerHour / 1.609;
            long expectedValue = Math.round(myMiles);
            return expectedValue;
        }
    }

    public static void printConversion(double kilometersPerHour)
    {
        if(kilometersPerHour < 0)
            System.out.println("Invalide Value");
        else
        {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

}
