package JAN;

public class Main {

    public static void main(String[] args)
    {
        Dog dog = new Dog("Yorkie");
        dog.eat();
        dog.breath();

        Parrot parrot = new Parrot("Ara");
        parrot.breath();
        parrot.eat();
        parrot.fly();

        Pengiun pengiun = new Pengiun("Emperor");
        pengiun.fly();
    }
}
