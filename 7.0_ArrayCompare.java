import java.util.Scanner;

public class ArrayCompare {

    // The same generic method from Code 1
    public static <T> boolean areArraysEqual(T[] array1, T[] array2) {
        
        // Check if one is null or lengths differ
        if (array1 == null || array2 == null || array1.length != array2.length) {
            return false;
        }

        // Compare each element in order
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size for the arrays: ");
        int size = scanner.nextInt();
        
        // Consume the leftover newline character after reading the integer
        scanner.nextLine(); 

        // Initializing two String arrays based on user's chosen size
        String[] array1 = new String[size];
        String[] array2 = new String[size];

        System.out.println("\n--- Entering elements for Array 1 ---");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array1[i] = scanner.nextLine();
        }

        System.out.println("\n--- Entering elements for Array 2 ---");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array2[i] = scanner.nextLine();
        }

        // Call the generic method
        boolean areEqual = areArraysEqual(array1, array2);

        System.out.println("\n--- Result ---");
        if (areEqual) {
            System.out.println("Match! Both arrays have the same elements in the exact same order.");
        } else {
            System.out.println("No match. The arrays have different elements or are in a different order.");
        }

        // Always close the scanner to prevent resource leaks
        scanner.close();
    }
}