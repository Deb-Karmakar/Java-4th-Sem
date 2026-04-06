import java.util.Scanner;

public class Average {

    // The method using the "double..." syntax
    public void calculate(double... numbers) {
        
        // Safety check to prevent dividing by zero
        if (numbers.length == 0) {
            System.out.println("No numbers provided.");
            return; 
        }

        double sum = 0;
        
        // Replaced the for-each loop with a traditional for loop
        // We use an index 'i' to go through the 'numbers' array
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // Add the current number to the sum
        }

        // Calculate the average
        double average = sum / numbers.length;

        System.out.println("Average of the " + numbers.length + " numbers is: " + average);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Average avgFinder = new Average();

        System.out.print("How many numbers do you want to find the average of? ");
        int count = scanner.nextInt();

        // We create an array to store the exact amount of numbers the user wants to enter
        double[] userNumbers = new double[count];

        // Traditional for loop to collect the inputs one by one
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            userNumbers[i] = scanner.nextDouble();
        }

        System.out.println("\nCalculating...");
        
        // A cool trick with varargs: you can pass an entire array into it!
        // Java will automatically unpack the array into the variable arguments.
        avgFinder.calculate(userNumbers); 

        // Close the scanner
        scanner.close();
    }
}