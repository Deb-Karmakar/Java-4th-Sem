import java.util.Scanner; // Import the Scanner class to read user input

public class Person {
    // Private instance variables for the outer class [cite: 15]
    private String name;
    private int age;

    // Constructor to assign values to the Person object [cite: 18]
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Non-static inner class [cite: 16]
    class Address {
        String city;
        String pinCode;

        // Constructor to assign values to the Address object [cite: 18]
        Address(String city, String pinCode) {
            this.city = city;
            this.pinCode = pinCode;
        }

        // Inner class method displaying both Person and Address details [cite: 17]
        void displayDetails() {
            System.out.println("\n--- Person Details ---");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("City: " + city);
            System.out.println("Pin Code: " + pinCode);
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // --- Taking User Input ---
        System.out.print("Enter person's name: ");
        String inputName = scanner.nextLine(); // Reads a full line of text

        System.out.print("Enter person's age: ");
        int inputAge = scanner.nextInt(); // Reads an integer

        // CRITICAL STEP: After reading a number (nextInt), there is a leftover 
        // "Enter" (newline) character. We need to clear it out before reading the next String.
        scanner.nextLine(); 

        System.out.print("Enter city: ");
        String inputCity = scanner.nextLine();

        System.out.print("Enter pin code: ");
        String inputPinCode = scanner.nextLine();

        // --- Creating Objects using the Input ---
        
        // Step 1: Create the outer class object first using the variables we just collected [cite: 18]
        Person myPerson = new Person(inputName, inputAge);

        // Step 2: Create the inner class object using the outer class object [cite: 18]
        Person.Address myAddress = myPerson.new Address(inputCity, inputPinCode);

        // Step 3: Call the method to display everything [cite: 18]
        myAddress.displayDetails();

        // It is good practice to close the scanner when you are done with it
        scanner.close();
    }
}