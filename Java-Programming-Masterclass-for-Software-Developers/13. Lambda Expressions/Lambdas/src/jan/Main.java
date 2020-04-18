package jan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        new Thread(()->  {
//            System.out.println("Printing from the runnable");
//            System.out.println("Line 2");
//            System.out.format("This is line %d\n", 3);
//        }).start();

        Employee john = new Employee("Jonh", 30);
        Employee timothy = new Employee("Timothy", 21);
        Employee jack = new Employee("Jack", 40);
        Employee jim = new Employee("Jimothy", 23);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(timothy);
        employees.add(jack);
        employees.add(jim);

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });

//        Collections.sort(employees, ( employee1, employee2) ->
//                employee1.getName().compareTo(employee2.getName()));
//
//        for(Employee employee: employees) {
//            System.out.println(employee.getName());
//        }
//
//        String sillyString = doStringStuff(new UpperCouncat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        }, employees.get(0).getName(), employees.get(1).getName());
//        System.out.println(sillyString);

//        UpperCouncat uc = (s1, s2) -> {
//            String result = s1.toUpperCase() + s2.toUpperCase();
//            return result;
//        };
//        String sillyString = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());
//        System.out.println(sillyString);

        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println(s);
    }

    public final static String doStringStuff(UpperCouncat uc, String s1, String s2) {
        return uc.upperAndConcat(s1,s2);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperCouncat {
    String upperAndConcat(String s1, String s2);
}

class AnotherClass {
    public String  doSomething() {

        int count = 0;

        UpperCouncat uc = (s1, s2) -> {
            System.out.println("The Lambda expression's class is " + getClass().getSimpleName());
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };

        System.out.println("The AnotherClass class's name is: " + getClass().getSimpleName());
        return Main.doStringStuff(uc, "String1", "String2");
    }
}