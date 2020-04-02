package JAN;

public class FlourPackProblem
{
    public static boolean canPack(int bigCount, int smallCount, int goal)
    {
        if(bigCount < 0 || smallCount < 0 || goal < 0)
        {
            return false;
        }

        int bigCountNeeded = Math.min(goal / 5, bigCount);
        int smallCountNeeded = goal - bigCountNeeded * 5;
        return  bigCount >= bigCountNeeded && smallCount >= smallCountNeeded;
    }
}
