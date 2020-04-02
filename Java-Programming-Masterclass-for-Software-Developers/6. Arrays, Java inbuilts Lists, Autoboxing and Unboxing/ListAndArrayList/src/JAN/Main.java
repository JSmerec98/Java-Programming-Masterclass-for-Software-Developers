package JAN;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args)
    {
        boolean quit = false;
        int choice = 0;
        printIntructions();
        while(!quit)
        {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 0:
                    printIntructions();
                    break;
                case 1:
                    groceryList.printGorceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();

                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printIntructions()
    {
        System.out.println("\n Press");
        System.out.println("\t 0 - print choice");
        System.out.println("\t 1 - print list");
        System.out.println("\t 2 - add");
        System.out.println("\t 3 - modify");
        System.out.println("\t 4 - remove");
        System.out.println("\t 5 - search");
        System.out.println("\t 6 - quit");
    }

    public static void addItem()
    {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem()
    {
        System.out.print("Current item name: ");
        String itemNo = scanner.nextLine();

        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();

        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void remove()
    {
        System.out.print("Enter item number: ");
        String itemNuber = scanner.nextLine();

        groceryList.removeGroceryItem(itemNuber);
    }

    public static void searchForItem()
    {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();

        if(groceryList.onFile(searchItem))
        {
            System.out.println("Found " + searchItem + " in our grocery list");
        }
        else
        {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }

    public static void processArrayList()
    {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String [] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
