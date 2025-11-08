package streamprocessor;

import java.util.*;
import java.util.stream.*;

public class DataProcessor {

    public static IntSummaryStatistics analyze(List<Integer> numbers) {
        return numbers.stream().mapToInt(n -> n).summaryStatistics();
    }

    public static List<Integer> filterAbove(List<Integer> numbers, int threshold) {
        return numbers.stream()
                .filter(n -> n > threshold)
                .collect(Collectors.toList());
    }

    public static int sum(List<Integer> numbers) {
        return numbers.stream().mapToInt(n -> n).sum();
    }
}
