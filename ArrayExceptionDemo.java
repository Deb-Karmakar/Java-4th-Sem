import java.util.Scanner;
import java.util.InputMismatchException;

public class ArrayExceptionDemo {

    public static void main(String[] args) {
        
        // 1. Initialize the Scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // 2. Create a fixed-size array of 5 elements
        int[] numbers = new int[5];
        
        System.out.println("Array created with a size of: " + numbers.length);
        System.out.println("Valid indices for this array are 0, 1, 2, 3, and 4.\n");

        try {
            // 3. Take user input for the index
            System.out.print("Enter the index you want to access: ");
            int index = scanner.nextInt();
            
            // 4. Take user input for the value
            System.out.print("Enter the integer value you want to store: ");
            int value = scanner.nextInt();
            
            // Attempt to assign the value to the chosen index
            numbers[index] = value; 
            
            System.out.println("\nSuccess! Value " + value + " was assigned to index " + index + "."); 
            
        } catch (ArrayIndexOutOfBoundsException e) {
            // 5. Catch the out of bounds exception and use e.getMessage()
            System.out.println("\n--- Exception Caught! ---");
            System.out.println("Error Message: " + e.getMessage());
            System.out.println("Reason: You entered an index that is outside the 0-4 range.");
        }
    }
}