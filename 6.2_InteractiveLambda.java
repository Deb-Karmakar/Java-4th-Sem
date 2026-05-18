import java.util.Scanner; // 1. We must import the Scanner class

@FunctionalInterface
interface MaxFinder {
    int findMax(int a, int b);
}

public class InteractiveLambda {
    public static void main(String[] args) {
        
        // The lambda expression (this stays exactly the same)
        MaxFinder maxExpression = (a, b) -> (a > b) ? a : b;

        // 2. Create a Scanner object, telling it to read from System.in (the sc)
        Scanner sc = new Scanner(System.in);

        // 3. Prompt the user for the first number
        System.out.print("Enter the first integer: ");
        int num1 = sc.nextInt(); // This pauses the program until the user types a number and hits Enter

        // 4. Prompt the user for the second number
        System.out.print("Enter the second integer: ");
        int num2 = sc.nextInt();

        // 5. Pass the user's input into our lambda expression
        int result = maxExpression.findMax(num1, num2);

        System.out.println("The maximum of " + num1 + " and " + num2 + " is: " + result);
        
        // 6. Close the scanner when we are done (this is a good habit to prevent memory leaks)
        sc.close();
    }
}