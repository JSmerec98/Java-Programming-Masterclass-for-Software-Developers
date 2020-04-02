package JAN;

public class DeluxeHamburger extends Hamburger
{
    private boolean chips;
    private boolean drink;

    public DeluxeHamburger(String breadRollType, String meat, double price)
    {
        super(breadRollType, meat, price);
        this.chips = true;
        System.out.println("Adding chips! +4$");
        this.drink = true;
        System.out.println("Adding drink! +5$");
    }

    @Override
    public double returnPrice()
    {
        double priceToShow = super.returnPrice();

        // chips
        priceToShow += 4;
        // drink
        priceToShow += 5;

        return priceToShow;
    }

    @Override
    public void setLettuce(boolean lettuce)
    {
        System.out.println("Cannot add!");
    }

    @Override
    public void setTomato(boolean tomato)
    {
        System.out.println("Cannot add!");
    }

    @Override
    public void setCarrot(boolean carrot)
    {
        System.out.println("Cannot add!");
    }

    @Override
    public void setOnion(boolean onion)
    {
        System.out.println("Cannot add!");
    }
}
