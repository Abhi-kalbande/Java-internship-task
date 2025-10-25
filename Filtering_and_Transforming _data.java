import java.util.*;
import java.util.stream.*;

public class SimpleTransform {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ravi", "Anuj", "Ramesh", "Vidya");
        List<String> filtered = names.stream()
                                     .filter(n -> n.startsWith("R"))
                                     .map(String::toUpperCase)
                                     .collect(Collectors.toList());
        System.out.println(filtered);
    }
}
