import java.util.Scanner;

class Shape {
    final double PI = Math.PI;

    // Volume - overloaded
    double volume(double l, double b, double h) {
        return l * b * h; // Parallelepiped
    }

    double volume(double radius, double h) {
        return PI * radius * radius * h; // Cylinder
    }

    double volume(double radius) {
        return (4.0 / 3) * PI * radius * radius * radius; // Sphere
    }

    // Surface Area - overloaded
    double surfaceArea(double l, double b, double h) {
        return 2 * (l * b + l * h + b * h); // Parallelepiped
    }

    double surfaceArea(double radius, double h) {
        return 2 * PI * radius * (radius + h); // Cylinder
    }

    double surfaceArea(double radius) {
        return 4 * PI * radius * radius; // Sphere
    }
}

public class ShapeOverloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape s = new Shape();

        // --- Parallelepiped Input ---
        System.out.println(">>> Enter details for Parallelepiped:");
        System.out.print("Length : ");
        double l = scanner.nextDouble();
        System.out.print("Breadth: ");
        double b = scanner.nextDouble();
        System.out.print("Height : ");
        double h = scanner.nextDouble();

        // --- Cylinder Input ---
        System.out.println("\n>>> Enter details for Cylinder:");
        System.out.print("Radius: ");
        double r = scanner.nextDouble();
        System.out.print("Height: ");
        double ch = scanner.nextDouble();

        // --- Sphere Input ---
        System.out.println("\n>>> Enter details for Sphere:");
        System.out.print("Radius: ");
        double radius = scanner.nextDouble();

        // --- Results ---
        System.out.println("\n=== Method Overloading Results ===\n");

        System.out.println("--- Parallelepiped ---");
        System.out.printf("Volume       = %.2f%n", s.volume(l, b, h));
        System.out.printf("Surface Area = %.2f%n", s.surfaceArea(l, b, h));

        System.out.println("\n--- Cylinder ---");
        System.out.printf("Volume       = %.2f%n", s.volume(r, ch));
        System.out.printf("Surface Area = %.2f%n", s.surfaceArea(r, ch));

        System.out.println("\n--- Sphere ---");
        System.out.printf("Volume       = %.2f%n", s.volume(radius));
        System.out.printf("Surface Area = %.2f%n", s.surfaceArea(radius));

        scanner.close();
    }
}