package Main;

import compressor.FileCompressor;
import textanalyzer.TextAnalyzer;
import calculator.Calculator;
import streamprocessor.DataProcessor;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // File Compression
        FileCompressor.compress("input.txt", "input.gz");
        FileCompressor.decompress("input.gz", "output.txt");

        // Text Analyzer
        System.out.println(TextAnalyzer.wordFrequency("I love good Java but hate bad bugs"));
        System.out.println("Sentiment: " + TextAnalyzer.sentiment("I love good Java but hate bad bugs"));

        // Calculator
        Calculator.add(10, 20);
        Calculator.divide(50, 5);

        // Stream Processor
        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println(DataProcessor.analyze(nums));
        System.out.println(DataProcessor.filterAbove(nums, 25));
    }
}
