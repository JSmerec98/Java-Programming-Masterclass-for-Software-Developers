package JAN;

public class Main
{
    public static void main(String[] args)
    {
//        int count = 6;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        System.out.println();

//        count = 6;
//        do
//        {
//            System.out.println("Count value is " + count);
//            count++;
//
//            if(count > 100)
//                break;
//
//        }   while(count != 6);

        int number = 4;
        int finishnumber = 20;

        int count = 0;
        while(number <= finishnumber)
        {
            number++;
            if(!isEvenNumber(number))
            {
                continue;
            }

            count ++;
            if(count >= 5)
                break;

            System.out.println("Even number " + number);
        }

        System.out.println("Sum is equal to " + count);
    }

    public static boolean isEvenNumber(int i )
    {
        if(i % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
