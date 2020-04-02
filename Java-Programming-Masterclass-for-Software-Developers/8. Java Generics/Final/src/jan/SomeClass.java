package jan;

public class SomeClass
{
    private static int classCounter = 0;
    public final int intsanceNumber;
    private final String name;

    public SomeClass(String name)
    {
        this.name = name;
        classCounter++;
        intsanceNumber = classCounter;
        System.out.println(name + " created, instance is " + intsanceNumber);
    }

    public int getIntsanceNumber()
    {
        return intsanceNumber;
    }
}
