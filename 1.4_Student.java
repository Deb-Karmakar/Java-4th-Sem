import java.util.Scanner;

// Create a class named Student with instance variables name, roll no, registration no, marks1, marks2, marks3[cite: 18].
public class Student {
    // Instance variables 
    String name;
    int rollNo;
    String regNo; 
    double marks1;
    double marks2;
    double marks3;

    // Constructor to set up the student's details
    public Student(String name, int rollNo, String regNo, double marks1, double marks2, double marks3) {
        this.name = name;
        this.rollNo = rollNo;
        this.regNo = regNo;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    // Write a member method named Result to print all the above details along with the average mark[cite: 19].
    public void Result() {
        // Inside Result method you need to calculate the average mark[cite: 20].
        double average = (marks1 + marks2 + marks3) / 3.0;

        // Print everything to the console
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Registration No: " + regNo);
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);
        System.out.println("Average Marks: " + average);
        System.out.println("-----------------------");
    }

    // Main method to test the class functionality
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Get Name
        System.out.print("Enter Student Name: ");
        String userName = sc.nextLine();

        // 2. Get Roll Number
        System.out.print("Enter Roll Number: ");
        int userRoll = sc.nextInt();

        // Consume the leftover newline character after reading the integer
        sc.nextLine(); 

        // 3. Get Registration Number
        System.out.print("Enter Registration Number: ");
        String userReg = sc.nextLine();

        // 4. Get Marks
        System.out.print("Enter Marks 1: ");
        double userMarks1 = sc.nextDouble();

        System.out.print("Enter Marks 2: ");
        double userMarks2 = sc.nextDouble();

        System.out.print("Enter Marks 3: ");
        double userMarks3 = sc.nextDouble();

        // Create a new Student object using the inputs we just collected
        Student student1 = new Student(userName, userRoll, userReg, userMarks1, userMarks2, userMarks3);

        // Call the Result method on our object
        student1.Result();

        sc.close();
    }
}