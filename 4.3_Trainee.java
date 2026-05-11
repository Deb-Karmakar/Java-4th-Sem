// Importing the custom Salaried class from the Employee package.
// This allows the Trainee class to inherit its properties and methods.
import Employee.Salaried; 

// Importing LocalDate to handle dates accurately (handling leap years, months, etc.)
import java.time.LocalDate; 

// Importing Scanner to read input from the user via the console.
import java.util.Scanner;

// The Trainee class inherits from the Salaried class using the 'extends' keyword.
public class Trainee extends Salaried {
    
    // Instance variables specific to the Trainee class.
    // (Other variables like Name, ID, Salary, etc., are inherited from Salaried)
    String Training_Domain;
    LocalDate Date_of_joining;
    double Training_score;

    // Method to initialize the Trainee object with data.
    public void getTraineeData(String name, int id, int age, String address, double salary, int exp, 
                               String dept, String domain, LocalDate doj, double score) {
        
        // Calls the method from the parent (Salaried) class to initialize inherited variables
        getSalariedData(name, id, age, address, salary, exp, dept);
        
        // Initializes the variables specific to this subclass
        this.Training_Domain = domain;
        this.Date_of_joining = doj;
        this.Training_score = score;
    }

    // Method to display the details of a Trainee.
    public void printTraineeData() {
        // Calls the parent class method to print inherited details (Name, ID, Salary, etc.)
        printSalariedData();
        
        // Prints the details specific to the Trainee
        System.out.println("Training Domain: " + Training_Domain);
        System.out.println("Date of Joining: " + Date_of_joining);
        System.out.println("Training Score: " + Training_score);
        System.out.println("-------------------------");
    }

    // A static method that evaluates an array of trainees based on specific criteria.
    // It is static so it can be called without needing a specific Trainee object to call it.
    public static void printTopExperiencedTrainees(Trainee[] trainees) {
        System.out.println("\n=== Eligible Trainees (>1 yr Experience & Score > 80) ===");
        
        // Determines the exact date one year ago from today's system date
        LocalDate oneYearAgo = LocalDate.now().minusYears(1);
        
        // A flag to keep track of whether we found at least one eligible trainee
        boolean foundAny = false;

        // An enhanced for-loop (for-each loop) that goes through every Trainee 't' in the array
        for (Trainee t : trainees) {
            
            // Checks if the trainee's joining date is before OR exactly equal to the date one year ago
            boolean hasOneYearExp = t.Date_of_joining.isBefore(oneYearAgo) || t.Date_of_joining.isEqual(oneYearAgo);
            
            // If they have 1+ years of experience AND their score is strictly greater than 80
            if (hasOneYearExp && t.Training_score > 80) {
                // Print their specific details
                System.out.println("- " + t.Emp_name + " (Score: " + t.Training_score + ", Joined: " + t.Date_of_joining + ")");
                // Set flag to true since we found someone
                foundAny = true;
            }
        }

        // If the loop finishes and the flag is still false, inform the user
        if (!foundAny) {
            System.out.println("No trainees meet the criteria.");
        }
    }

    // The main method where program execution begins
    public static void main(String[] args) {
        // Create a Scanner object to read user input from the keyboard
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many trainees do you want to enter? ");
        int n = scanner.nextInt(); // Reads the integer size for the array
        
        // Consume the leftover newline character (\n) from hitting 'Enter'. 
        // If we don't do this, the next nextLine() call will read an empty string.
        scanner.nextLine(); 

        // Create an array capable of holding 'n' Trainee objects (currently empty/null)
        Trainee[] trainees = new Trainee[n];

        // Loop 'n' times to gather input for each trainee
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter Details for Trainee " + (i + 1) + " ---");
            
            // Actually create the Trainee object and place it into the array at index 'i'
            trainees[i] = new Trainee();

            // Gather String input
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            // Gather Integer input
            System.out.print("Employee ID: ");
            int id = scanner.nextInt();
            
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline after reading an integer
            
            System.out.print("Address: ");
            String address = scanner.nextLine();
            
            // Gather Double input
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            
            System.out.print("Years of Experience: ");
            int exp = scanner.nextInt();
            scanner.nextLine(); // Consume newline after reading an integer
            
            System.out.print("Department Name: ");
            String dept = scanner.nextLine();
            
            System.out.print("Training Domain: ");
            String domain = scanner.nextLine();
            
            // Read a date as a String, then parse (convert) it into a proper LocalDate object
            System.out.print("Date of Joining (YYYY-MM-DD): ");
            String dateStr = scanner.nextLine();
            LocalDate doj = LocalDate.parse(dateStr); 
            
            System.out.print("Training Score: ");
            double score = scanner.nextDouble();
            scanner.nextLine(); // Consume newline after reading a double

            // Send all the gathered variables into the object's method to populate it
            trainees[i].getTraineeData(name, id, age, address, salary, exp, dept, domain, doj, score);
        }

        // Loop through the fully populated array and trigger the print method for each one
        System.out.println("\n=== ALL TRAINEES ===");
        for (int i = 0; i < n; i++) {
            trainees[i].printTraineeData();
        }

        // Pass the entire array into the static evaluation method to filter and print the top trainees
        Trainee.printTopExperiencedTrainees(trainees);
        
        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}