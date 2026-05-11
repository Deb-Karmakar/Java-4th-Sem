public class FactorialCalculator { // Declare the public class named FactorialCalculator
    public static void main(String[] args) { // Define the main method, the entry point of the program
        try { // Start a try block to handle potential exceptions during execution
            String input = args[0]; // Attempt to read the first argument passed from the command line
            int number = Integer.parseInt(input); // Attempt to convert the string argument into an integer
            
            if (number < 0) { // Check if the parsed integer is less than zero (negative)
                throw new IllegalArgumentException("Factorial is not defined for negative numbers."); // Manually throw an exception if the number is negative
            } // Close the if block
            
            long factorial = 1; // Initialize a long variable to store the factorial result, starting at 1
            for (int i = 1; i <= number; i++) { // Start a for loop from 1 up to the parsed number
                factorial = factorial * i; // Multiply the current factorial value by the loop variable 'i'
            } // Close the for loop
            
            System.out.println("The factorial of " + number + " is: " + factorial); // Print the successfully calculated factorial result
            
        } catch (ArrayIndexOutOfBoundsException e) { // Catch block for when no command line argument is provided (args array is empty)
            System.out.println("Error: No argument provided. Please pass an integer value."); // Print an error message for the missing argument
        } catch (NumberFormatException e) { // Catch block for when the provided argument cannot be parsed as an integer (e.g., float, double, or text)
            System.out.println("Error: Invalid format. Please provide a whole integer, not a float or string."); // Print an error message for invalid number formats
        } catch (IllegalArgumentException e) { // Catch block specifically for our manually thrown negative number exception
            System.out.println("Error: " + e.getMessage()); // Print the specific error message provided when the exception was thrown
        } // Close the final catch block
    } // Close the main method
} // Close the FactorialCalculator class