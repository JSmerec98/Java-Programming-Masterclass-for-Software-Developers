package JAN;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args)
    {
	    Customer customer = new Customer("John", 51.23);
	    Customer antoherCustomer;

	    antoherCustomer = customer;

	    antoherCustomer.setBalance(12.42);

        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());


        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for(int i = 0; i < intList.size(); i++)
        {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1,2);

        for(int i = 0; i < intList.size(); i++)
        {
            System.out.println(i + ": " + intList.get(i));
        }


    }
}
