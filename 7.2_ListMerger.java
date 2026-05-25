import java.util.*;

public class ListMerger {

    // The same generic method from Code 3
    public static <T> List<T> mergeAlternating(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<>();
        
        // Find the maximum size between the two lists
        int maxSize = Math.max(list1.size(), list2.size());

        for (int i = 0; i < maxSize; i++) {
            // Add element from the first list if it exists
            if (i < list1.size()) {
                mergedList.add(list1.get(i));
            }
            // Add element from the second list if it exists
            if (i < list2.size()) {
                mergedList.add(list2.get(i));
            }
        }

        return mergedList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- List 1 Setup ---
        System.out.print("Enter the size for the FIRST list: ");
        int size1 = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character

        List<String> list1 = new ArrayList<>();
        System.out.println("\n--- Entering elements for List 1 ---");
        for (int i = 0; i < size1; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            list1.add(scanner.nextLine());
        }

        // --- List 2 Setup ---
        System.out.print("\nEnter the size for the SECOND list: ");
        int size2 = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character

        List<String> list2 = new ArrayList<>();
        System.out.println("\n--- Entering elements for List 2 ---");
        for (int i = 0; i < size2; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            list2.add(scanner.nextLine());
        }

        // --- Merge and Print ---
        List<String> mergedList = mergeAlternating(list1, list2);

        System.out.println("\n--- Merged List Result ---");
        System.out.println(mergedList);

        // Always close the scanner
        scanner.close();
    }
}