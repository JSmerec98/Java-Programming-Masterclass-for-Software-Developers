package JAN;

public class SecondsAndMinutes
{
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args)
    {
        System.out.println(getDurationString(60,0));
        System.out.println(getDurationString(312241));
    }

    public static String getDurationString(int minutes, int seconds)
    {
        if(minutes < 0 || seconds < 0 || seconds > 59)
            return INVALID_VALUE_MESSAGE;

        int hours = minutes / 60;
        minutes %= 60;

        String h = hours + "h ";
        if(hours < 10)
            h = "0" + h;

        String m = minutes + "m ";
        if(minutes < 10)
            m = "0" + m;

        String s = seconds + "s ";
        if(seconds < 10)
            s = "0" + s;

        return (h + m + s);
    }

    public static String getDurationString(int seconds)
    {
        if(seconds < 0)
            return INVALID_VALUE_MESSAGE;

        int minutes = seconds / 60;
        seconds %= 60;

        return getDurationString(minutes,seconds);
    }
}
