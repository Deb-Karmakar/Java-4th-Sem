import java.util.Scanner;

public class GCDIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first positive integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second positive integer: ");
        int b = sc.nextInt();

        int originalA = a;
        int originalB = b;

        // Iterative method using a while loop
        while (b != 0) {
            int remainder = a % b; // Find the remainder
            a = b;                 // Update a to be b
            b = remainder;         // Update b to be the remainder
        }

        // When b becomes 0, 'a' holds the GCD
        System.out.println("The GCD of " + originalA + " and " + originalB + " is: " + a);
        sc.close();
    }
}