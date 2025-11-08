package textanalyzer;

import java.util.*;

public class TextAnalyzer {

    private static final Set<String> positiveWords = Set.of("good", "great", "happy", "excellent", "love");
    private static final Set<String> negativeWords = Set.of("bad", "sad", "poor", "hate", "terrible");

    public static Map<String, Integer> wordFrequency(String text) {
        Map<String, Integer> freq = new HashMap<>();
        String[] words = text.toLowerCase().split("\\W+");

        for (String w : words) {
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }
        return freq;
    }

    public static String sentiment(String text) {
        int score = 0;
        for (String w : text.toLowerCase().split("\\W+")) {
            if (positiveWords.contains(w)) score++;
            else if (negativeWords.contains(w)) score--;
        }

        if (score > 0) return "Positive";
        if (score < 0) return "Negative";
        return "Neutral";
    }
}
