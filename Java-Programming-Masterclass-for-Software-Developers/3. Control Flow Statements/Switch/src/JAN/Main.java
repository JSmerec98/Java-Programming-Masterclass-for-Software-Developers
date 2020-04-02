package JAN;

public class Main {

    public static void main(String[] args)
    {
//	    int value = 2;
//
//	    if(value == 1)
//        {
//            System.out.println("Value was 1");
//        }
//	    else if(value == 2)
//        {
//            System.out.println("Value was 2");
//        }
//	    else
//        {
//            System.out.println("Was not 1 or 2");
//        }

	    int switchValue = 3;

	    switch(switchValue)
        {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3 or a 4 or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char character = 'G';

        switch (character)
        {
            case 'A':
                System.out.println("The character is A");
                break;
            case 'B':
                System.out.println("The character is B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(character + " is the character");
                break;
            default:
                System.out.println("The character was not found");
        }

        

        String month = "JUNE";

        switch (month.toLowerCase())
        {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
