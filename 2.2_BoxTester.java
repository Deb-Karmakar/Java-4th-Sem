import java.util.Scanner; // Import the Scanner tool

class Box {
    double width;
    double height;
    double length;

    // Constructor 1: For a regular box [cite: 16, 17]
    Box(double w, double h, double l) {
        this.width = w;
        this.height = h;
        this.length = l;
    }

    // Constructor 2 (Overloading): For a cube [cite: 17]
    Box(double side) {
        this.width = side;
        this.height = side;
        this.length = side;
    }

    // Method to calculate volume [cite: 17]
    double volume() {
        return width * height * length;
    }

    // Method to check if two boxes are identical [cite: 19, 20]
    boolean equals(Box b) {
        if (this.width == b.width && this.height == b.height && this.length == b.length) {
            return true;
        } else {
            return false;
        }
    }
}

public class BoxTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Get inputs for Box 1 ---
        System.out.println("--- Enter Details for Box 1 ---");
        System.out.print("Enter Width: ");
        double w1 = sc.nextDouble(); // Reads decimals
        System.out.print("Enter Height: ");
        double h1 = sc.nextDouble();
        System.out.print("Enter Length: ");
        double l1 = sc.nextDouble();
        
        Box box1 = new Box(w1, h1, l1);

        // --- Get inputs for Box 2 ---
        System.out.println("\n--- Enter Details for Box 2 ---");
        System.out.print("Enter Width: ");
        double w2 = sc.nextDouble();
        System.out.print("Enter Height: ");
        double h2 = sc.nextDouble();
        System.out.print("Enter Length: ");
        double l2 = sc.nextDouble();
        
        Box box2 = new Box(w2, h2, l2);

        // --- Get inputs for Box 3 (The Cube) ---
        System.out.println("\n--- Enter Details for Box 3 (Cube) ---");
        System.out.print("Enter the single side length for the cube: ");
        double side = sc.nextDouble();
        
        Box box3 = new Box(side); // Uses the overloaded constructor [cite: 17]

        // --- Print Volumes --- [cite: 18]
        System.out.println("\n--- Volumes ---");
        System.out.println("Volume of Box 1: " + box1.volume());
        System.out.println("Volume of Box 2: " + box2.volume());
        System.out.println("Volume of Box 3 (Cube): " + box3.volume());

        // --- Test the equals() method --- [cite: 20]
        System.out.println("\n--- Comparing Boxes ---");
        
        System.out.print("Are Box 1 and Box 2 identical? ");
        if (box1.equals(box2)) {
            System.out.println("Yes!");
        } else {
            System.out.println("No.");
        }

        System.out.print("Are Box 1 and Box 3 identical? ");
        if (box1.equals(box3)) {
            System.out.println("Yes!");
        } else {
            System.out.println("No.");
        }

        sc.close();
    }
}