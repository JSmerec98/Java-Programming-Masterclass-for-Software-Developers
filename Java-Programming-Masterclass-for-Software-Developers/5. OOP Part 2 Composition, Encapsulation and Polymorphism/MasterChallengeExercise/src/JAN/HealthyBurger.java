package JAN;

public class HealthyBurger extends Hamburger
{
    private boolean cheese;
    private boolean beacon;

    public HealthyBurger(String meat, double price)
    {
        super("Brown rye", meat, price);
        this.cheese = false;
        this.beacon = false;
    }

    @Override
    public double returnPrice()
    {
        double priceToShow = super.returnPrice();

        if(cheese)
        {
            priceToShow += 3;
        }

        if(beacon)
        {
            priceToShow += 3.5;
        }

        return priceToShow;
    }

    public void setCheese(boolean cheese)
    {
        if(cheese)
        {
            System.out.println("Adding cheese! +3$");
        }
        else
        {
            System.out.println("Deleting cheese! -3$");
        }

        this.cheese = cheese;
    }

    public void setBeacon(boolean beacon)
    {
        if(beacon)
        {
            System.out.println("Adding beacon! +3.5$");
        }
        else
        {
            System.out.println("Deleting beacon! -3.5$");
        }

        this.beacon = beacon;
    }

    @Override
    public void setLettuce(boolean lettuce)
    {
        super.setLettuce(lettuce);
    }

    @Override
    public void setTomato(boolean tomato)
    {
        super.setTomato(tomato);
    }

    @Override
    public void setCarrot(boolean carrot)
    {
        super.setCarrot(carrot);
    }

    @Override
    public void setOnion(boolean onion)
    {
        super.setOnion(onion);
    }
}
