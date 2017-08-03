import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ListTest {
    public static void main(String args[]) {
        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features.forEach(n -> System.out.println(n));
    }
}
