import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String args[]) {
        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features.forEach(n -> System.out.println(n));

        features.forEach(System.out::println);

        System.out.println("******************");

        List<String> languages = Arrays.asList("Java", "Java8", "Scala", "C++", "Haskell", "Lisp");
        filter(languages, (str) -> str.startsWith("J"));

        System.out.println("******************");
        Predicate<String> startWithJ = (str) -> str.startsWith("J");
        Predicate<String> fiveLetterLong = (str) -> str.length() == 5;
        languages.stream().filter(startWithJ.and(fiveLetterLong)).forEach(System.out::println);
    }

    public static void filter(List<String> names, Predicate<String> condition) {
        names.stream().filter((name) -> (condition.test(name))).forEach((name) -> {
            System.out.println(name + " ");
        });
        //换种方法来写
        names.stream().filter((name) -> (condition.test(name))).forEach(System.out::println);
    }
}
