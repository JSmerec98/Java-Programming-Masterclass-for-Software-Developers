package JAN;

import java.util.Calendar;

public class Main {

    public static void main(String[] args)
    {
        // Area
        WallArea wallArea = new WallArea(5,4);
        System.out.println("Area = " + wallArea.getArea());

        wallArea.setHeight(-1.5);
        System.out.println("width = " + wallArea.getWidth());
        System.out.println("height = " + wallArea.getHeight());
        System.out.println("area = " + wallArea.getArea());

        // Point
        Point first = new Point(6,5);
        Point second = new Point(3,1);
        System.out.println("distance(0,0) = " + first.distance());
        System.out.println("distance(second) = " + first.distance(second));
        System.out.println("distance(2,2) = " + first.distance(2,2));
        Point point = new Point();
        System.out.println("distance() = " + point.distance());

        // Carpet
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Caclulator caclulator = new Caclulator(floor,carpet);
        System.out.println("total = " + caclulator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4,4.5);
        caclulator = new Caclulator(floor,carpet);
        System.out.println("tota = " + caclulator.getTotalCost());

        // Complex Number
        ComplexNumber one = new ComplexNumber(1.0,1.0);
        ComplexNumber number = new ComplexNumber(2.5,-1.5);
        one.add(1,1);
        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real = " + number.getReal());
        System.out.println("number.imaginary = " + number.getImaginary());

    }
}
