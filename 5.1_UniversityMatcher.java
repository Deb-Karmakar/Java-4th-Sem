import java.util.Scanner; // Import the Scanner class from the java.util package to allow reading input from the user

class NoMatchFoundException extends Exception { // Define a custom exception class that inherits from Java's built-in Exception class
    public NoMatchFoundException(String message) { // Define a constructor for our custom exception that takes a string message as an argument
        super(message); // Call the constructor of the parent Exception class to set the error message internally
    } // Close the constructor block
} // Close the custom exception class definition

public class UniversityMatcher { // Declare the main public class named UniversityMatcherInput
    public static void checkString(String input) throws NoMatchFoundException { // Define a static method to check the string, declaring that it might throw our custom exception
        if (!input.equals("University")) { // Check if the provided input string is NOT exactly equal to the word "University" (case-sensitive)
            throw new NoMatchFoundException("The string provided is not 'University'."); // Manually throw our custom exception if the strings do not match
        } // Close the if block
        System.out.println("Success: The string matches 'University'."); // Print a success message if the exception is not thrown, meaning the input was correct
    } // Close the checkString method

    public static void main(String[] args) { // Define the main method, which serves as the entry point for the Java application
        Scanner scanner = new Scanner(System.in); // Create a new Scanner object connected to System.in to read input from the console
        
        System.out.print("Please enter a string to check: "); // Print a prompt to the console asking the user to enter a string
        String userInput = scanner.nextLine(); // Read the entire line of text entered by the user and store it in the userInput string variable
        
        try { // Start a try block to handle any potential custom exceptions thrown by the checkString method
            System.out.println("You entered: " + userInput); // Print the string that the user typed in for confirmation
            checkString(userInput); // Call the checkString method, passing the user's input as the argument
        } catch (NoMatchFoundException e) { // Catch the custom NoMatchFoundException if it is thrown by the checkString method
            System.out.println("Exception Caught: " + e.getMessage()); // Print the specific error message contained within the caught exception object
        } finally { // Start a finally block, which will execute regardless of whether an exception was thrown or caught
            scanner.close(); // Close the Scanner object to prevent resource leaks, which is a good programming practice
        } // Close the finally block
    } // Close the main method
} // Close the UniversityMatcherInput class