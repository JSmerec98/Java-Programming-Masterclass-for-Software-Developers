package JAN;

public class Caclulator
{
    private Floor floor;
    private Carpet carpet;

    public Caclulator(Floor floor, Carpet carpet)
    {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost()
    {
        return (floor.getArea() * carpet.getCost());
    }
}
