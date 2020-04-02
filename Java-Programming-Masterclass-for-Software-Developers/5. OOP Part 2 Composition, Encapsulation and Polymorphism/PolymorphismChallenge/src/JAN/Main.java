package JAN;

import java.util.MissingFormatArgumentException;

class Car
{
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(String name, int cylinders)
    {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public boolean isEngine()
    {
        return engine;
    }

    public int getCylinders()
    {
        return cylinders;
    }

    public int getWheels()
    {
        return wheels;
    }

    public String getName()
    {
        return name;
    }

    public String startEngine()
    {
        return "Starting engine in car class";
    }

    public String accelerate()
    {
        return "Accelerating in car class";
    }

    public String brake()
    {
        return "Braking in car class";
    }
}

class Audi extends Car
{
    public Audi(String name, int cylinders)
    {
        super(name, cylinders);
    }

    @Override
    public String startEngine()
    {
        return "Starting engine in audi class";
    }

    @Override
    public String accelerate()
    {
        return "Accelerate in audi class";
    }

    @Override
    public String brake()
    {
        return "Braking in audi class";
    }
}

class Mercedes extends Car
{
    public Mercedes(String name, int cylinders)
    {
        super(name, cylinders);
    }

    @Override
    public String startEngine()
    {
        return "Starting engine in mercedes class";
    }

    @Override
    public String accelerate()
    {
        return "Accelerate in mercedes class";
    }

    @Override
    public String brake()
    {
        return "Braking in mercedes class";
    }
}

class Jeep extends Car
{
    public Jeep(String name, int cylinders)
    {
        super(name, cylinders);
    }

    @Override
    public String startEngine()
    {
        return "Starting engine in jeep class";
    }

    @Override
    public String accelerate()
    {
        return "Accelerate in jeep class";
    }

    @Override
    public String brake()
    {
        return "Braking in jeep class";
    }
}


public class Main {

    public static void main(String[] args)
    {
        Car car = new Car("Base car",8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Audi audi = new Audi("A4",6);
        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());

        Mercedes mercedes = new Mercedes("CLS",8);
        System.out.println(mercedes.startEngine());
        System.out.println(mercedes.accelerate());
        System.out.println(mercedes.brake());

        Jeep jeep = new Jeep("Jeep",12);
        System.out.println(jeep.startEngine());
        System.out.println(jeep.accelerate());
        System.out.println(jeep.brake());

    }
}
