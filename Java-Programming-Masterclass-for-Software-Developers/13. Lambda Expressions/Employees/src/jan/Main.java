package jan;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Employee john = new Employee("John", 30);
        Employee timothy = new Employee("Timothy", 21);
        Employee jack = new Employee("Jack", 40);
        Employee jim = new Employee("Jimothy", 23);
        Employee red = new Employee("Red", 35);
        Employee charming = new Employee("Prince Charming", 31);


        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(timothy);
        employees.add(jack);
        employees.add(jim);
        employees.add(red);
        employees.add(charming);

        printEmployeesByAge(employees, "Employees over 30", employee -> employee.getAge() > 30);
        printEmployeesByAge(employees, "\nEmployees 30 and younger", employee -> employee.getAge() < 30);
        printEmployeesByAge(employees, "\n Employees youger than 25", new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge() < 25;
            }
        });

        IntPredicate greaterThan15 = i -> i > 15;
        IntPredicate lessThan100 = i -> i < 100;
        System.out.println(greaterThan15.test(10));
        int a = 20;
        System.out.println(greaterThan15.test(a + 15));

        System.out.println(greaterThan15.and(lessThan100).test(50));
        System.out.println(greaterThan15.and(lessThan100).test(15));

        Random random = new Random();
        Supplier<Integer> randomSupplier = () -> random.nextInt(1000);
        for(int i = 0; i < 10; i++) {
            System.out.println(randomSupplier.get());
        }
    }

    private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition) {
        System.out.println(ageText);
        for(Employee employee: employees) {
            if(ageCondition.test(employee)) {
                System.out.println(employee.getName());
            }
        }
    }
}
