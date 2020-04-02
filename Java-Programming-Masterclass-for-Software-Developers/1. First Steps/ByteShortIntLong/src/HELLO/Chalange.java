package HELLO;

public class Chalange
{
    public static void main(String[] args)
    {
        byte myByte = 8;
        short myShort = 16;
        int myInt = 32;

        long myLong = 50000L + 10L*(myByte + myInt + myShort);
        System.out.println(myLong);

        short shortTotal = (short)(1000 + 10 *(myByte + myInt + myShort));
        System.out.println(shortTotal);
    }
}
