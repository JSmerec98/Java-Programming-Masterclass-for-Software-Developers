package JAN;

public class Main {

    public static void main(String[] args)
    {
	    Hamburger hamburger = new Hamburger("Dark","Medium",10.0);
        System.out.println("Price = " + hamburger.returnPrice() + "$");

        //Adding additions :)

        hamburger.setCarrot(true);
        hamburger.setOnion(true);

        System.out.println("Price = " + hamburger.returnPrice() + "$");

        hamburger.setCarrot(false);
        hamburger.setTomato(true);

        System.out.println("Price = " + hamburger.returnPrice() + "$");

        HealthyBurger healthyBurger = new HealthyBurger("Medium",12.0);
        System.out.println("Healthy burger price = " + healthyBurger.returnPrice() + "$");

        // Adding

        healthyBurger.setBeacon(true);
        healthyBurger.setCarrot(true);
        healthyBurger.setCheese(true);
        healthyBurger.setLettuce(true);
        healthyBurger.setOnion(true);
        healthyBurger.setTomato(true);

        System.out.println("Healthy burger price = " + healthyBurger.returnPrice() + "$");

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("White", "Medium",10.0);
        System.out.println("Deluxe hamburger price = " + deluxeHamburger.returnPrice() + "$");
        deluxeHamburger.setCarrot(true);
        deluxeHamburger.setLettuce(true);
        System.out.println("Deluxe hamburger price = " + deluxeHamburger.returnPrice() + "$");
    }
}
