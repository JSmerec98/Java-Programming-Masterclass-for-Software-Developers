package jan;

public class Main
{
    public static void main(String[] args)
    {
//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//        SomeClass three = new SomeClass("three");
//
//        System.out.println(one.getIntsanceNumber());
//        System.out.println(two.getIntsanceNumber());
//        System.out.println(three.getIntsanceNumber());
//
//        System.out.println(Math.PI);
//
////        Math m = new Math();
//
//        int pw = 1234123;
//        Password password = new ExtendedPassword(pw);
//        password.storePassword();
//
//        password.letMeIn(1);
//        password.letMeIn(4214141);
//        password.letMeIn(2131231);
//        password.letMeIn(0);
//        password.letMeIn(1234123);

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("OWner is " + SIBTest.owner);
    }
}
