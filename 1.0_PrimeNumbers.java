import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input for m and n
        System.out.print("Enter positive integer m: ");
        int m = sc.nextInt();
        System.out.print("Enter positive integer n (greater than m): ");
        int n = sc.nextInt();

        System.out.println("Prime numbers between " + m + " and " + n + ":");
        
        // Loop through all numbers from m to n
        for (int i = m; i <= n; i++) {
            // If the number is prime, print it
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }

    // Helper method to check if a single number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false; // 0 and 1 are not prime numbers
        
        // Check for factors up to half of the number
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false; // If it divides evenly, it's not prime
            }
        }
        return true; // If no factors are found, it is prime
    }
}