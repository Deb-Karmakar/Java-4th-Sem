// 1. Base Class 'Vehicle'
class Vehicle {
    // Protected variables can be accessed by subclasses
    protected String Licence_number;
    protected double speed;
    protected String color;
    protected String owner_name;

    // Constructor to initialize the Vehicle details
    public Vehicle(String Licence_number, double speed, String color, String owner_name) {
        this.Licence_number = Licence_number;
        this.speed = speed;
        this.color = color;
        this.owner_name = owner_name;
    }

    // Method to show vehicle data
    public void showdata() {
        System.out.println("This is a vehicle class"); // Mandatory message 
        System.out.println("Licence Number: " + Licence_number);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + owner_name);
    }
}

// 2. Subclass 'Bus' inheriting from 'Vehicle'
class Bus extends Vehicle {
    // Private variable specific to BusI
    private String route_no;
    

    // Constructor for Bus 
    public Bus(String Licence_number, double speed, String color, String owner_name, String route_no) {
        // 'super' calls the constructor of the parent class (Vehicle)
        super(Licence_number, speed, color, owner_name);
        this.route_no = route_no;
    }

    // Overriding the showdata() method to include bus-specific details
    //@Override
    public void showdata() {
        super.showdata(); // Calls the showdata() method of the Vehicle class first
        System.out.println("Route Number: " + route_no);
    }
}

// 3. Subclass 'Car' inheriting from 'Vehicle'
class Car extends Vehicle {
    // Private variable specific to Car
    private String manufacturer_name;

    // Constructor for Car
    public Car(String Licence_number, double speed, String color, String owner_name, String manufacturer_name) {
        // Initialize parent variables via super()
        super(Licence_number, speed, color, owner_name);
        this.manufacturer_name = manufacturer_name;
    }

    // Overriding the showdata() method to include car-specific details
    //@Override
    public void showdata() {
        super.showdata(); // Calls the showdata() method of the Vehicle class first
        System.out.println("Manufacturer Name: " + manufacturer_name);
    }
}

// Main class to run and test the program
public class Inheritance {
    public static void main(String[] args) {
        // Creating an object of Bus
        Bus myBus = new Bus("WB-11-2025", 60.5, "Red", "John Doe", "Route-45");
        
        // Creating an object of Car
        Car myCar = new Car("MH-12-9999", 120.0, "Black", "Jane Smith", "Toyota");

        System.out.println("--- Bus Details ---");
        myBus.showdata(); // This will print Vehicle details + Route Number

        System.out.println("\n--- Car Details ---");
        myCar.showdata(); // This will print Vehicle details + Manufacturer
    }
}