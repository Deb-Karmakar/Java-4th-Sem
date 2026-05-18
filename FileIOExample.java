import java.io.*;

public class FileIOExample {
    public static void main(String[] args) {
        File file = new File("output.txt");

        // 1. Efficiently Writing to a File
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("Hello World!");
            writer.newLine(); // Adds a new line automatically
            writer.write("Java Buffered IO is fast.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2. Efficiently Reading from a File
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
