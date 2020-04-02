package JAN;

public class Main
{

    public static void main(String[] args)
    {
        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
        holden.setModel("Commodore");
        System.out.println("Model is " + holden.getModel());

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResults());
        System.out.println("subtract= " + calculator.getSubtractionResults());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResults());
        System.out.println("divide= " + calculator.getDivisionResults());

        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("Smith");
        System.out.println("fullName= " + person.getFullName());
    }
}
