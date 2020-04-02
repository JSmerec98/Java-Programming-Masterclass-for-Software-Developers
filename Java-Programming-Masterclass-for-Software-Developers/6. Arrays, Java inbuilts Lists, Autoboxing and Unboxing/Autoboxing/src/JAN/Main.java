package JAN;

import java.util.ArrayList;

class IntClass
{
    private int myValue;

    public IntClass(int myValue)
    {
        this.myValue = myValue;
    }

    public int getMyValue()
    {
        return myValue;
    }

    public void setMyValue(int myValue)
    {
        this.myValue = myValue;
    }
}

public class Main
{

    public static void main(String[] args)
    {
	    String [] strArray = new String[10];
	    int [] intArray = new int [10];

        ArrayList<String> strArraylist = new ArrayList<>();
        strArraylist.add("Jan");

        //ArrayList<int> intArrayList = new ArrayList<int>();

        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(54));

        // LONG WAY
        Integer integer = new Integer(3);
        Double doubleValue = new Double(3.5);

        ArrayList<Integer> integerArrayList = new ArrayList<>();

//        for(int i = 0; i <= 10; i++)
//        {
//            integerArrayList.add(Integer.valueOf(i));
//        }
//
//        for(int i = 0; i <= 10; i++)
//        {
//            System.out.println(i + " ----> " + integerArrayList.get(i).intValue());
//        }

        // SHORT WAY

        Integer myIntValue = 50; // Integer.valueOf(56);
        int myInt = myIntValue; // myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<>();

        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5)
        {
            myDoubleValues.add(dbl);
        }

        for(int i = 0; i<myDoubleValues.size(); i++)
        {
            double value = myDoubleValues.get(i);
            System.out.println(i + " ----> " + value);
        }

    }
}
