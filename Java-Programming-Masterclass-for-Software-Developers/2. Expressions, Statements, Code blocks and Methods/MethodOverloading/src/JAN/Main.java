package JAN;

public class Main {

    public static void main(String[] args)
    {
//        int newScore = calculateScore("Jan",500);
//        System.out.println("New score is " + newScore);
//        calculateScore(75);
//        calculateScore();

        double area = AreaCalculator.area(5.0,-1.0);
        System.out.println(area);

        MinutesToYearsAndDays.printYearsAndDays(525600);
        EqualityPrinter.printEqual(1,2,3);
    }

    public static int calculateScore(String playerName, int score)
    {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score)
    {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore()
    {
        System.out.println("No player name, no score");
        return 0;
    }

}
