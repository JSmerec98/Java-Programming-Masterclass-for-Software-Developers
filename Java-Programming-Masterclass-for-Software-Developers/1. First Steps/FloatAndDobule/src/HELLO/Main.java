package HELLO;

import java.io.OutputStream;

public class Main {

    public static void main(String[] args)
    {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min = " + myMinFloatValue);
        System.out.println("Float max = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min = " + myMinDoubleValue);
        System.out.println("Double max = " + myMaxDoubleValue);

        int myIntValule = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.0 / 3.0;

        System.out.println("MyIntValue = " + myIntValule);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        double myPounds = 195.5;
        double myKilograms = myPounds * 0.45259237;
        System.out.println("My kilograms = " + myKilograms + "kg");

        double pie = 3.1415927;
        double anotherNumver = 3_000_000.4_231_213;
        System.out.println(anotherNumver);
    }
}
