import java.util.ArrayList;
import java.util.List;

// 1. The Interface: Defines a contract that all implementing classes must follow
interface Payable {
    double getPrice(); // Implicitly public and abstract
}

// 2. Groceries Class
class Groceries implements Payable {
    private String name;
    private double pricePerKg;
    private double weight;

    // Constructor
    public Groceries(String name, double pricePerKg, double weight) {
        this.name = name;
        this.pricePerKg = pricePerKg;
        this.weight = weight;
    }

    // Implementing the interface method with specific math for groceries
    @Override
    public double getPrice() {
        return pricePerKg * weight;
    }

    public String getName() {
        return name;
    }
}

// 3. Electronics Class
class Electronics implements Payable {
    private String model;
    private double flatPrice;

    // Constructor
    public Electronics(String model, double flatPrice) {
        this.model = model;
        this.flatPrice = flatPrice;
    }

    // Implementing the interface method with specific math for electronics
    @Override
    public double getPrice() {
        return flatPrice; // No math needed, just the flat price
    }

    public String getModel() {
        return model;
    }
}

// 4. Main Class (The test driver)
public class test4 {
    public static void main(String[] args) {
        // 💡 EXAM HIGHLIGHT: A generic List storing the Interface type
        List<Payable> cart = new ArrayList<>();

        // Adding mixed objects into the same list
        cart.add(new Groceries("Apples", 150.0, 2.5));   // 2.5kg @ 150/kg = 375
        cart.add(new Groceries("Rice", 60.0, 5.0));      // 5.0kg @ 60/kg = 300
        cart.add(new Electronics("Smartphone", 15000.0)); // Flat price = 15000

        double totalBill = 0.0;
        System.out.println("--- Your Shopping Cart ---");

        // Enhanced for-loop iterating through the interface type
        for (Payable item : cart) {
            
            // 💡 POLYMORPHISM IN ACTION: 
            // Java automatically knows whether to multiply (Groceries) or just return the price (Electronics)
            double itemPrice = item.getPrice();
            totalBill += itemPrice;

            // Optional Exam Tip: Use 'instanceof' to print a nice receip
        }

        System.out.println("--------------------------");
        System.out.println("Total Bill to Pay: " + totalBill);
    }
}