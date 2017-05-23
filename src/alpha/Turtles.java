package alpha;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ronald on 20/10/16.
 */
public class Turtles {
    public static void main(String[] args) {

        String[] ninja = {"Raphael", "Leonardo", "Donatello", "Michelangelo"};

        List<String> turtles = Arrays.asList(ninja);

        System.out.println("Using the for Each loop...");
        for (String turtle : turtles) {
            System.out.println(turtle);
        }
        System.out.println("Using the lambda expression and functional operator...");
        turtles.forEach((turtle) -> System.out.println(turtle));

        System.out.println("Using double colon operator...");
        turtles.forEach(System.out::println);
    }
    /*
    Lambda expressions, also known as closures, function literals, or simply lambdas, describe a
    set of futures defined in JAVA Specification Request (JSR).
     */
}
