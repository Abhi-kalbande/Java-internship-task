import java.util.*;
import java.util.stream.*;

public class LoopToStreamExamples {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 5, 8, 11, 14);
        List<String> names = Arrays.asList("Amit", "Ravi", "John", "Neha", "Ankita");
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));

        // Print elements
        System.out.println("1. Printing elements using loop:");
        for (int n : numbers) System.out.print(n + " ");
        System.out.println("\nUsing Stream:");
        numbers.stream().forEach(System.out::print);
        System.out.println("\n");

        // Filter even numbers
        System.out.println("2. Filter even numbers:");
        List<Integer> evens = new ArrayList<>();
        for (int n : numbers) if (n % 2 == 0) evens.add(n);
        System.out.println("Loop: " + evens);
        System.out.println("Stream: " + numbers.stream().filter(n -> n % 2 == 0).toList());
        System.out.println();

        // Transform (square numbers)
        System.out.println("3. Square numbers:");
        List<Integer> squares = new ArrayList<>();
        for (int n : numbers) squares.add(n * n);
        System.out.println("Loop: " + squares);
        System.out.println("Stream: " + numbers.stream().map(n -> n * n).toList());
        System.out.println();

        // Sum of elements
        System.out.println("4. Sum of numbers:");
        int sum = 0;
        for (int n : numbers) sum += n;
        System.out.println("Loop: " + sum);
        System.out.println("Stream: " + numbers.stream().mapToInt(Integer::intValue).sum());
        System.out.println();

        // Count elements starting with letter 'A'
        System.out.println("5. Count names starting with A:");
        int count = 0;
        for (String name : names) if (name.startsWith("A")) count++;
        System.out.println("Loop: " + count);
        System.out.println("Stream: " + names.stream().filter(n -> n.startsWith("A")).count());
        System.out.println();

        // Find maximum
        System.out.println("6. Find max number:");
        int max = Integer.MIN_VALUE;
        for (int n : numbers) if (n > max) max = n;
        System.out.println("Loop: " + max);
        System.out.println("Stream: " + numbers.stream().max(Integer::compare).get());
        System.out.println();

        // Sort elements
        System.out.println("7. Sort numbers:");
        List<Integer> sorted = new ArrayList<>(numbers);
        Collections.sort(sorted);
        System.out.println("Loop: " + sorted);
        System.out.println("Stream: " + numbers.stream().sorted().toList());
        System.out.println();

        // Flatten nested list
        System.out.println("8. Flatten nested list:");
        List<Integer> flat = new ArrayList<>();
        for (List<Integer> list : nestedList) flat.addAll(list);
        System.out.println("Loop: " + flat);
        System.out.println("Stream: " + nestedList.stream().flatMap(List::stream).toList());
        System.out.println();

        // Join strings
        System.out.println("9. Join names:");
        StringBuilder sb = new StringBuilder();
        for (String name : names) sb.append(name).append(", ");
        System.out.println("Loop: " + sb);
        System.out.println("Stream: " + names.stream().collect(Collectors.joining(", ")));
        System.out.println();

        // Find first element greater than 10
        System.out.println("10. First number > 10:");
        Integer result = null;
        for (int n : numbers) {
            if (n > 10) { result = n; break; }
        }
        System.out.println("Loop: " + result);
        System.out.println("Stream: " + numbers.stream().filter(n -> n > 10).findFirst().orElse(null));
    }
}
