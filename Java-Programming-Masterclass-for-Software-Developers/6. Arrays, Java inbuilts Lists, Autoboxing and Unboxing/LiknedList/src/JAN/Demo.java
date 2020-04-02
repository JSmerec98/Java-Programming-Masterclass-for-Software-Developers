package JAN;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo
{
    public static void main(String[] args)
    {
        LinkedList<String> placesToVisit = new LinkedList<>();

//        placesToVisit.add("Kraków");
//        placesToVisit.add("Wrocław");
//        placesToVisit.add("Warszawa");
//        placesToVisit.add("Gdańsk");
//        placesToVisit.add("Szczecin");
//        placesToVisit.add("Katowice");
//        placesToVisit.add("Rzeszów");
//
//        printList(placesToVisit);
//
//        placesToVisit.add(1,"Wieliczka");
//        printList(placesToVisit);
//
//        placesToVisit.remove(4);
//        printList(placesToVisit);

        addInOrder(placesToVisit,"Kraków");
        addInOrder(placesToVisit,"Warszawa");
        addInOrder(placesToVisit,"Augustów");
        addInOrder(placesToVisit,"Rzeszów");
        addInOrder(placesToVisit,"Chorzów");
        addInOrder(placesToVisit,"Rymanów");
        addInOrder(placesToVisit,"Białystok");
        addInOrder(placesToVisit,"Gdańsk");
        addInOrder(placesToVisit,"Zamość");
        printList(placesToVisit);

        addInOrder(placesToVisit,"Wrocław");
        addInOrder(placesToVisit,"Warszawa");
        printList(placesToVisit);

        visit(placesToVisit);


    }

    private static void printList(LinkedList<String> linkedList)
    {
        Iterator <String> i = linkedList.iterator();

        while (i.hasNext())
        {
            System.out.println("Now visiting " + i.next());
        }

        System.out.println("=====================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList,String newCity)
    {
        ListIterator<String> i = linkedList.listIterator();

        while(i.hasNext())
        {
            int comparison = i.next().compareTo(newCity);

            if(comparison == 0)
            {
                // equal do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            }
            else if(comparison > 0)
            {
                // new city should appear before this one
                i.previous();
                i.add(newCity);
                return true;
            }
            else if(comparison < 0)
            {
                // move on next city
            }
        }

        i.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> cities)
    {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty())
        {
            System.out.println("No cities in the list");
            return;
        }
        else
        {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit)
        {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action)
            {
                case 0:
                    System.out.println("Vacation over!");
                    quit = true;
                    break;

                case 1:
                    if(!goingForward)
                    {
                        if(listIterator.hasNext())
                        {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext())
                    {
                        System.out.println("Now visiting " + listIterator.next());
                    }
                    else
                    {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if(goingForward)
                    {
                        if(listIterator.hasPrevious())
                        {
                            listIterator.previous();
                        }

                        goingForward = false;
                    }
                    if(listIterator.hasPrevious())
                    {
                        System.out.println("Now visiting " + listIterator.previous());
                    }
                    else
                    {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;

            }
        }

    }

    private static void printMenu()
    {
        System.out.println("Available actions: \npress");
        System.out.println("0 - to quit");
        System.out.println("1 - go to next city");
        System.out.println("2 - go to previous city");
        System.out.println("3 - print menu options");
    }
}
