package JAN;

public class Main {

    public static void main(String[] args)
    {
        Bank bank = new Bank("Goliath National Bank");

        if(bank.addBranch("Branch one"))
        {
            System.out.println("Branch one created!");
        }

        bank.addCustomer("Branch one","Jonn", 50.05);
        bank.addCustomer("Branch one","Jim", 122.33);
        bank.addCustomer("Branch one", "Tim", 124.54);

        bank.addBranch("Branch two");
        bank.addCustomer("Branch two", "Bob", 124.12);

        bank.addCustomerTransaction("Branch one", "Jim", 124.12);
        bank.addCustomerTransaction("Branch one", "Jim", 124.13);
        bank.addCustomerTransaction("Branch one", "John", 1500.56);

        bank.listCustomers("Branch one", true);
        bank.listCustomers("Branch two", true);

        bank.addBranch("Melbourne");
        if(!bank.addCustomer("Melbourne","Brian",5.54))
        {
            System.out.println("Error Melbourne branch does not exists");
        }

        if(!bank.addBranch("Branch two"))
        {
            System.out.println("Branch two branch already exists");
        }

        if(!bank.addCustomerTransaction("Branch two", "Fergus", 125.43))
        {
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomer("Branch one","Jim", 123.42))
        {
            System.out.println("Customer Jim already exists");
        }


    }
}
