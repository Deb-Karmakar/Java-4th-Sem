// Import the classes from our custom package
import org.shapes.Square;
import org.shapes.Circle;
import org.shapes.Triangle;
import java.util.Scanner;

public class ShapePackages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // d. Use this package to find area and perimeter of different shapes chosen by the user.
        System.out.println("Choose a shape: \n1. Square \n2. Circle \n3. Triangle");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                Square sq = new Square(side);
                System.out.println("Area: " + sq.getArea());
                System.out.println("Perimeter: " + sq.getPerimeter());
                break;
            case 2:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                Circle c = new Circle(radius);
                System.out.println("Area: " + c.getArea());
                System.out.println("Perimeter: " + c.getPerimeter());
                break;
            case 3:
                System.out.print("Enter the three sides of the triangle: ");
                double s1 = scanner.nextDouble();
                double s2 = scanner.nextDouble();
                double s3 = scanner.nextDouble();
                // Basic validation for a valid triangle
                if (s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1) {
                    Triangle t = new Triangle(s1, s2, s3);
                    System.out.println("Area: " + t.getArea());
                    System.out.println("Perimeter: " + t.getPerimeter());
                } else {
                    System.out.println("Invalid triangle sides!");
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }
        scanner.close();
    }
}