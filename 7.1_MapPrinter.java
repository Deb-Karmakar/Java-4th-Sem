import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapPrinter {

    // The same generic method from Code 2
    public static <K, V> void printMap(Map<K, V> map) {
        if (map == null || map.isEmpty()) {
            System.out.println("The map is empty or null.");
            return;
        }

        System.out.println("\n--- Your Map Contents ---");
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " | Value: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // We use String for both Key and Value to easily capture any text input
        Map<String, String> userMap = new HashMap<>();

        System.out.print("How many key-value pairs do you want to enter? ");
        int count = scanner.nextInt();
        
        // Consume the leftover newline character
        scanner.nextLine();

        System.out.println("\n--- Entering Map Data ---");
        for (int i = 0; i < count; i++) {
            System.out.print("Enter Key " + (i + 1) + ": ");
            String key = scanner.nextLine();

            System.out.print("Enter Value for '" + key + "': ");
            String value = scanner.nextLine();

            // Add the user's input to the map
            userMap.put(key, value);
            System.out.println(); // Just an empty line for readability
        }

        // Call our generic method to print the map
        printMap(userMap);

        // Close the scanner
        scanner.close();
    }
}