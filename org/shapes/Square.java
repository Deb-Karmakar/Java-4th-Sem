package org.shapes; // a. Create a package named org.shapes

// b. Create a class representing a Square
public class Square {
    private double side;

    // Constructor to initialize the square
    public Square(double side) {
        this.side = side;
    }

    // Method to calculate area
    public double getArea() {
        return side * side;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 4 * side;
    }
}