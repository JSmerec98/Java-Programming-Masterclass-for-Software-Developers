package jan;

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args)
    {
//        StaticTest firstInstance = new StaticTest("1st Instance");
//        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest secoundIntsance = new StaticTest("2nd instance");
//        System.out.println(secoundIntsance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest thirdInstance = new StaticTest("3st Instance");
//        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        // java com.company._static.Main

        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);
    }

    public static int multiply(int number)
    {
        return number * multiplier;
    }
}
