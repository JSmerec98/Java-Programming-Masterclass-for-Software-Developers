package JAN;

public class Bedroom
{
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall31, Ceiling ceiling, Bed bed, Lamp lamp)
    {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall3 = wall31;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp()
    {
        return lamp;
    }

    public void makinBed()
    {
        System.out.println("Bedroom -> Making bed");
        bed.make();
    }
}
