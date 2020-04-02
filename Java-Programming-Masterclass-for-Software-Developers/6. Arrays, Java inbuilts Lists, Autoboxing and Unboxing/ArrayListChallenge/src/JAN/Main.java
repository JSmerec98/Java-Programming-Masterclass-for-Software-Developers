package JAN;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("213 231 123");

    public static void main(String[] args)
    {
        boolean quit = false;
        startPhone();

        while(!quit)
        {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action)
            {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    mobilePhone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;

                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void addNewContact()
    {
        System.out.print("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();

        Contact contact = new Contact(name,phone);

        if(mobilePhone.addNewContact(contact))
        {
            System.out.println("New contact added: name = " + name + ", phone = " + phone);
        }
        else
        {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void updateContact()
    {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();

        Contact existingContactRecord = mobilePhone.queryContact(name);

        if(existingContactRecord == null)
        {
            System.out.println("Contact not found.");
            return;
        }

        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();

        Contact newRecord = Contact.createContact(newName,newNumber);

        if(mobilePhone.updateContact(existingContactRecord,newRecord))
        {
            System.out.println("Successfully upadated record");
        }
        else
        {
            System.out.println("Error updating record");
        }
    }

    private static void removeContact()
    {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();

        Contact existingContactRecord = mobilePhone.queryContact(name);

        if(existingContactRecord == null)
        {
            System.out.println("Contact not found.");
            return;
        }

        if(mobilePhone.removeContact(existingContactRecord))
        {
            System.out.println("Successfully upadated deleted");
        }
        else
        {
            System.out.println("Error deleting record");
        }
    }

    private static void queryContact()
    {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();

        Contact existingContactRecord = mobilePhone.queryContact(name);

        if(existingContactRecord == null)
        {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());
    }

    private static void startPhone()
    {
        System.out.println("Starting phone...");
    }

    private static void printActions()
    {
        System.out.println("\n Available actions: \npress ");
        System.out.println("0 - to shutdown");
        System.out.println("1 - to print contacts");
        System.out.println("2 - to add a new contact");
        System.out.println("3 - to update en existing contact");
        System.out.println("4 - to remove en existing contact");
        System.out.println("5 - query if an existing contact exists");
        System.out.println("6 - to print a list of available actions");

        System.out.println("Chose your actions: ");
    }
}
