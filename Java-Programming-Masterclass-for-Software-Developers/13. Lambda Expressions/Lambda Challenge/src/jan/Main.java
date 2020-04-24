package jan;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                String myString = "Lets split this up into an array";
                String [] parts = myString.split(" ");
                for(String part: parts) {
                    System.out.println(part);
                }
            }
        };

        Runnable runnable1 = () -> {
            String myString = "Lets split this up into an array";
            String [] parts = myString.split(" ");
            for(String part: parts) {
                System.out.println(part);
            }
        };

        Function<String,String> lambdaFunction = s -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i = 0; i < s.length(); i++) {
                if(i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }

            return returnVal.toString();
        };

//        System.out.println(lambdaFunction.apply("1234567890"));
        String result = everySecondCharacter(lambdaFunction, "1234567890");
        System.out.println(result);

//        Supplier<String> iLoveJava = () -> "I love Java!";
        Supplier<String> iLoveJava = () -> { return "I love Java!"; };
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);

        List<String> names = Arrays.asList("jan","jano","janek","jasiek","jah","jason","janson");

//        List<String> firstUpperCaseLst = new ArrayList<>();
//        names.forEach(name -> firstUpperCaseLst.add(name.substring(0,1).toUpperCase() + name.substring(1)));
//        firstUpperCaseLst.sort((s1,s2) -> s1.compareTo(s2));
////        firstUpperCaseLst.forEach(s -> System.out.println(s));

//        firstUpperCaseLst.sort(String::compareTo);
//        firstUpperCaseLst.forEach(System.out::println);

        names
                .stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .sorted(String::compareTo)
                .forEach(System.out::println);

        long namesBeginningWithJ = names
                .stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .filter(name -> name.startsWith("J"))
                .count();

        System.out.println("Number of name beginning with J is:" + namesBeginningWithJ);
    }

    public static String everySecondCharacter(Function<String,String> func, String source) {
        return func.apply(source);
    }
}
