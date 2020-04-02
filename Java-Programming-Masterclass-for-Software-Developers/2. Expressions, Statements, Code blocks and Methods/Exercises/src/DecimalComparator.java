public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b)
    {
        a *= 1000;
        b *= 1000;
        int first = (int)a;
        int second = (int)b;
        if(first == second)
            return true;
        else
            return false;
    }


}
