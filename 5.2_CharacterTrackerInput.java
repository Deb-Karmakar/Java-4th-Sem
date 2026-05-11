import java.util.Scanner; // Import the Scanner class to allow reading input typed by the user

public class CharacterTrackerInput { // Declare the main public class named CharacterTrackerInput
    private int runningTotal; // Declare a private integer variable to keep track of how many valid letters we have seen

    public CharacterTrackerInput() { // Define the constructor for the class, which runs when an object is created
        this.runningTotal = 0; // Set the initial count to zero before any characters are processed
    } // Close the constructor block

    public void processCharacter(char ch) throws IllegalArgumentException { // Define a method to evaluate one character, declaring it might throw an error
        if (!Character.isLetter(ch)) { // Check if the current character is NOT a standard alphabetic letter
            throw new IllegalArgumentException("Non-alphabetic character '" + ch + "' detected."); // Throw Java's built-in exception if it is a number, space, or symbol
        } // Close the if statement
        
        this.runningTotal++; // Add 1 to our running total because the character passed the letter check
        System.out.println("Processed valid letter: '" + ch + "'. Current total: " + this.runningTotal); // Print the accepted letter and the updated count
    } // Close the processCharacter method

    public static void main(String[] args) { // Define the main method where the program actually begins executing
        Scanner scanner = new Scanner(System.in); // Create a new Scanner object that listens to System.in (the console)
        CharacterTrackerInput tracker = new CharacterTrackerInput(); // Create a new instance (object) of our tracking class
        
        System.out.print("Please enter a sequence of characters to process: "); // Print a prompt asking the user to type something
        String userInput = scanner.nextLine(); // Read the entire line the user typed and store it in a String variable
        
        try { // Start a try block because processing the characters might trigger an exception
            for (int i = 0; i < userInput.length(); i++) { // Start a loop that will run from 0 up to the length of the user's string
                char currentChar = userInput.charAt(i); // Extract the single character at the current position in the string
                tracker.processCharacter(currentChar); // Feed that single character into our tracker method
            } // Close the for loop
            
            System.out.println("Success: All characters entered were valid alphabetic letters!"); // Print this only if the loop finishes without any errors
            
        } catch (IllegalArgumentException e) { // Catch the exception immediately if the tracker rejects a character
            System.out.println("Exception Caught: " + e.getMessage()); // Print the error message telling the user which character broke the rules
            System.out.println("Processing stopped. Final count was: " + tracker.runningTotal); // Print the final count achieved before the error occurred
        } finally { // Start a finally block which always runs at the very end
            scanner.close(); // Close the Scanner object to free up system resources safely
        } // Close the finally block
    } // Close the main method
} // Close the CharacterTrackerInput class