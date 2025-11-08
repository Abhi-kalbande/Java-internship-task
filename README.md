# Java Utility Suite

A modular Java project that demonstrates file compression, text analysis, basic calculator operations, and stream-based data processing.  
This project is created as part of the Java internship task.

---

##  Project Structure
UtilitySuite/
│
├── Main/ → Main entry point
│ └── Main.java
│
├── compressor/ → File compression & decompression using GZIP
│ └── FileCompressor.java
│
├── textanalyzer/ → Word frequency & sentiment analysis
│ └── TextAnalyzer.java
│
├── calculator/ → Simple math operations
│ └── Calculator.java
│
└── streamprocessor/ → List processing utilities
└── DataProcessor.java


---

## Features

###  1. File Compressor  
Compresses and decompresses files using GZIP.


FileCompressor.compress("input.txt", "input.gz");
FileCompressor.decompress("input.gz", "output.txt");

## 2. Text Analyzer

Counts word frequency

Performs basic sentiment analysis (good/bad words)

System.out.println(TextAnalyzer.wordFrequency("I love Java"));
System.out.println(TextAnalyzer.sentiment("Java is good but bugs are bad"));

## 3. Calculator

Basic arithmetic operations.

Calculator.add(10, 20);
Calculator.divide(50, 5);

## 4. Stream Data Processor

Analyzes number lists and filters data.

List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);
System.out.println(DataProcessor.analyze(nums));
System.out.println(DataProcessor.filterAbove(nums, 25));



How to Run the Project
1. Clone repository
git clone https://github.com/Abhi-kalbande/Java-internship-task

2. Compile the project

Open terminal inside the project folder:

javac */*.java Main/*.java

3. Run the project
java Main.Main



Common Errors & Fixes
## Error: FileNotFoundException: input.txt

This happens when input.txt is not located in the root project directory.

## Fix:
Place input.txt in the same folder where Main.java is executed.

 ## Requirements

Java 17 or later

Git (optional)

Eclipse/IntelliJ/NetBeans or any Java IDE

@ Author

Abhishek Kalbande
Java Internship Project – Utility Suite
