import java.util.Scanner;

public class MarkRanges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the total number of students: ");
        int n = sc.nextInt();

        // Variables to keep track of the count for each range
        int count81_100 = 0;
        int count61_80 = 0;
        int count41_60 = 0;
        int count0_40 = 0;

        System.out.println("Enter the marks for " + n + " students (0-100):");
        
        for (int i = 0; i < n; i++) {
            int mark = sc.nextInt();

            // Check which range the mark falls into and increment the counter
            if (mark >= 81 && mark <= 100) {
                count81_100++;
            } else if (mark >= 61 && mark <= 80) {
                count61_80++;
            } else if (mark >= 41 && mark <= 60) {
                count41_60++;
            } else if (mark >= 0 && mark <= 40) {
                count0_40++;
            } else {
                System.out.println("Invalid mark entered. Please enter a number between 0 and 100.");
            }
        }

        // Print final results
        System.out.println("Number of students in range 81 to 100: " + count81_100);
        System.out.println("Number of students in range 61 to 80: " + count61_80);
        System.out.println("Number of students in range 41 to 60: " + count41_60);
        System.out.println("Number of students in range 0 to 40: " + count0_40);

        sc.close();
    }
}