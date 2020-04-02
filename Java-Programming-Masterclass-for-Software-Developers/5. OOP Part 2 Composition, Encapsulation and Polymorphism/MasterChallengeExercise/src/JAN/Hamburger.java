package JAN;

public class Hamburger
{
    private String breadRollType;
    private String meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean onion;
    private double price;

    public Hamburger(String breadRollType, String meat, double price)
    {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.lettuce = false;
        this.tomato = false;
        this.carrot = false;
        this.onion = false;
        this.price = price;
    }

    public double returnPrice()
    {
        double priceToShow = price;

        if(lettuce)
        {
            priceToShow += 2.5;
        }

        if(tomato)
        {
            priceToShow += 2;
        }

        if(carrot)
        {
            priceToShow += 1.5;
        }

        if(onion)
        {
            priceToShow += 1;
        }

        return priceToShow;
    }

    public void setLettuce(boolean lettuce)
    {
        if(lettuce)
        {
            System.out.println("Adding lettuce! +2.5$");
        }
        else
        {
            System.out.println("Deleting lettuce! -2.5$");
        }

        this.lettuce = lettuce;
    }

    public void setTomato(boolean tomato)
    {
        if(tomato)
        {
            System.out.println("Adding tomato! +2$");
        }
        else
        {
            System.out.println("Deleting tomato! -2$");
        }

        this.tomato = tomato;
    }

    public void setCarrot(boolean carrot)
    {
        if(carrot)
        {
            System.out.println("Adding carrot! +1.5$");
        }
        else
        {
            System.out.println("Deleting carrot! -1.5$");
        }

        this.carrot = carrot;
    }

    public void setOnion(boolean onion)
    {
        if(onion)
        {
            System.out.println("Adding onion! +1$");
        }
        else
        {
            System.out.println("Deleting onion! -1$");
        }

        this.onion = onion;
    }
}
