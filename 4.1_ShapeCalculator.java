import java.util.Scanner; // Importing Scanner class to read user input

// 1. Base Class 'Shape'
class Shape {
    
    // --- METHOD OVERLOADING FOR VOLUME ---
    public double volume(double length, double breadth, double height) {
        return length * breadth * height;
    }
    
    public double volume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
    
    public double volume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // --- METHOD OVERLOADING FOR TOTAL SURFACE AREA ---
    public double surfaceArea(double length, double breadth, double height) {
        return 2 * ((length * breadth) + (length * height) + (breadth * height));
    }
    
    public double surfaceArea(double radius) {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    
    public double surfaceArea(double radius, double height) {
        return 2 * Math.PI * radius * (radius + height);
    }
}

// 2. Subclass for Parallelepiped
class Parallelepiped extends Shape {
    private double length, breadth, height;

    public Parallelepiped(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public void display() {
        System.out.println("--- Parallelepiped ---");
        System.out.println("Volume: " + volume(length, breadth, height));
        System.out.println("Total Surface Area: " + surfaceArea(length, breadth, height));
    }
}

// 3. Subclass for Sphere
class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public void display() {
        System.out.println("--- Sphere ---");
        System.out.println("Volume: " + volume(radius));
        System.out.println("Total Surface Area: " + surfaceArea(radius));
    }
}

// 4. Subclass for Cylinder
class Cylinder extends Shape {
    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void display() {
        System.out.println("--- Cylinder ---");
        System.out.println("Volume: " + volume(radius, height));
        System.out.println("Total Surface Area: " + surfaceArea(radius, height));
    }
}

// Main class to run and test the program with User Input
public class ShapeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // --- Get inputs for Parallelepiped ---
        System.out.println(">>> Enter details for Parallelepiped:");
        System.out.print("Length: ");
        double pLen = scanner.nextDouble();
        System.out.print("Breadth: ");
        double pBreadth = scanner.nextDouble();
        System.out.print("Height: ");
        double pHeight = scanner.nextDouble();
        // Create the object using the user's variables
        Parallelepiped p = new Parallelepiped(pLen, pBreadth, pHeight);

        // --- Get inputs for Sphere ---
        System.out.println("\n>>> Enter details for Sphere:");
        System.out.print("Radius: ");
        double sRadius = scanner.nextDouble();
        // Create the object using the user's variables
        Sphere s = new Sphere(sRadius);

        // --- Get inputs for Cylinder ---
        System.out.println("\n>>> Enter details for Cylinder:");
        System.out.print("Radius: ");
        double cRadius = scanner.nextDouble();
        System.out.print("Height: ");
        double cHeight = scanner.nextDouble();
        // Create the object using the user's variables
        Cylinder c = new Cylinder(cRadius, cHeight);

        // --- Display all results ---
        System.out.println("\n================ RESULTS ================");
        p.display();
        System.out.println();
        s.display();
        System.out.println();
        c.display();

        // Close the scanner to prevent memory leaks
        scanner.close(); 
    }
}