package jan;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> someBingoNumber = Arrays.asList( "N40","N36", "B12","B6","G13","G49","G50","g64","I23", "I16","O72");

        List<String> gNumbers = new ArrayList<>();

//        someBingoNumber.forEach(number -> {
//            if(number.toUpperCase().startsWith("G")) {
//                gNumbers.add(number);
//                System.out.println(number);
//            }
//        });
//
//        gNumbers.sort((String s1, String s2) -> s1.compareTo(s2));
//        gNumbers.forEach((String s) -> System.out.println(s));

        someBingoNumber.stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);


        Stream<String> ioNumberString = Stream.of("I23","I12","I28","N40","O82");
        Stream<String> inNumberString = Stream.of("N40","N36","I18","I23","O82");

        Stream<String> concatStream = Stream.concat(ioNumberString,inNumberString);
        System.out.println("===========================================");
        System.out.println(concatStream
                .distinct()
                .peek(System.out::println)
                .count());

        Employee john = new Employee("John Smith", 30);
        Employee jack = new Employee("Jack Black", 25);
        Employee ben = new Employee("Ben Dover", 40);
        Employee red = new Employee("Red Green", 22);

        Department hr = new Department("Human Resources");
        hr.addEmployee(ben);
        hr.addEmployee(jack);
        hr.addEmployee(red);

        Department accounting = new Department("Accounting");
        accounting.addEmployee(john);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);

        System.out.println("===========================================");
//        List<String> sortedGNumber = someBingoNumber.stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.startsWith("G"))
//                .sorted()
//                .collect(Collectors.toList());


        List<String> sortedGNumber = someBingoNumber.stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        for(String s: sortedGNumber) {
            System.out.println(s);
        }

        Map<Integer, List<Employee>> groupedByAge = departments.stream()
                .flatMap(department ->  department.getEmployees().stream())
                .collect(Collectors.groupingBy(employee -> employee.getAge()));

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .reduce((e1,e2) -> e1.getAge() < e2.getAge() ? e1 : e2)
                .ifPresent(System.out::println);

        Stream.of("ABC","AC","BAA","CCC","XY","ST")
                .filter(s -> {
                    System.out.println(s);
                    return s.length() == 3;
                })
                .count();
    }
}
