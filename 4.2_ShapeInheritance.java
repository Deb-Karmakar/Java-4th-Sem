import java.util.Scanner;

abstract class Shape {
    public abstract double volume();
    public abstract double surfaceArea();
}

class Parallelepiped extends Shape {
    private double length, breadth, height;

    public Parallelepiped(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public double volume() {
        return length * breadth * height;
    }

    public double surfaceArea() {
        return 2 * ((length * breadth) + (length * height) + (breadth * height));
    }
}

class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

class Cylinder extends Shape {
    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}

public class ShapeInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Parallelepiped ---
        System.out.println(">>> Enter details for Parallelepiped:");
        System.out.print("Length : ");
        double pLen = scanner.nextDouble();
        System.out.print("Breadth: ");
        double pBreadth = scanner.nextDouble();
        System.out.print("Height : ");
        double pHeight = scanner.nextDouble();
        Parallelepiped p = new Parallelepiped(pLen, pBreadth, pHeight); // ✅

        // --- Sphere ---
        System.out.println("\n>>> Enter details for Sphere:");
        System.out.print("Radius: ");
        double sRadius = scanner.nextDouble();
        Sphere s = new Sphere(sRadius); // ✅

        // --- Cylinder ---
        System.out.println("\n>>> Enter details for Cylinder:");
        System.out.print("Radius: ");
        double cRadius = scanner.nextDouble();
        System.out.print("Height: ");
        double cHeight = scanner.nextDouble();
        Cylinder c = new Cylinder(cRadius, cHeight); // ✅

        // --- Results ---
        System.out.println("\n================ RESULTS ================");

        System.out.println("--- Parallelepiped ---");
        System.out.printf("Volume            : %.2f%n", p.volume());
        System.out.printf("Total Surface Area: %.2f%n", p.surfaceArea());

        System.out.println("\n--- Sphere ---");
        System.out.printf("Volume            : %.2f%n", s.volume());
        System.out.printf("Total Surface Area: %.2f%n", s.surfaceArea());

        System.out.println("\n--- Cylinder ---");
        System.out.printf("Volume            : %.2f%n", c.volume());
        System.out.printf("Total Surface Area: %.2f%n", c.surfaceArea());

        scanner.close();
    }
}