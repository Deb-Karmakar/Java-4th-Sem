import java.util.Scanner; // Step 1: Import the Scanner tool

class Time {
    private int hour;
    private int min;
    private int sec;

    Time(int h, int m, int s) {
        this.hour = h;
        this.min = m;
        this.sec = s;
    }

    void add(Time t) {
        int totalSec = this.sec + t.sec;
        int finalSec = totalSec % 60; 
        int carryMin = totalSec / 60; 

        int totalMin = this.min + t.min + carryMin;
        int finalMin = totalMin % 60;
        int carryHour = totalMin / 60;

        int finalHour = this.hour + t.hour + carryHour;

        System.out.println("Added Time: " + finalHour + " Hours, " + finalMin + " Minutes, " + finalSec + " Seconds.");
    }
}

public class TimeCalculator {
    public static void main(String[] args) {
        // Step 2: Create a Scanner object to read from the keyboard
        Scanner sc = new Scanner(System.in);

        // --- Taking input for Time 1 ---
        System.out.println("--- Enter Details for Time 1 ---");
        System.out.print("Enter Hours: ");
        int h1 = sc.nextInt(); // Reads the integer typed by the user
        System.out.print("Enter Minutes: ");
        int m1 = sc.nextInt();
        System.out.print("Enter Seconds: ");
        int s1 = sc.nextInt();
        
        // Create the first Time object using the user's variables
        Time t1 = new Time(h1, m1, s1); 

        // --- Taking input for Time 2 ---
        System.out.println("\n--- Enter Details for Time 2 ---");
        System.out.print("Enter Hours: ");
        int h2 = sc.nextInt();
        System.out.print("Enter Minutes: ");
        int m2 = sc.nextInt();
        System.out.print("Enter Seconds: ");
        int s2 = sc.nextInt();
        
        // Create the second Time object using the user's variables
        Time t2 = new Time(h2, m2, s2);

        // --- Do the math ---
        System.out.println("\nCalculating total time...");
        t1.add(t2);

        // Good practice: Close the scanner when you're done with it
        sc.close();
    }
}