import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        String fileName = "T1.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(T1.txt))) {
            String line;
            while ((line = br.readLine()) != null)
                System.out.println(line);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
