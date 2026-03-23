import java.util.Scanner;

class Stack {
    // Array to store stack elements (max size 100 for simplicity)
    int[] arr = new int[100]; 
    int top = -1; // -1 means the stack is currently empty

    // Method to add an element to the stack
    void push(int value) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow! Cannot add more elements.");
        } else {
            top++; // Move the pointer up
            arr[top] = value; // Insert the value
            System.out.println(value + " pushed to stack.");
        }
    }

    // Method to remove the top element from the stack
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Stack is empty.");
        } else {
            System.out.println(arr[top] + " popped from stack.");
            top--; // Move the pointer down
        }
    }

    // Method to show all elements in the stack
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    // Helper method to get the current number of elements
    int getSize() {
        return top + 1;
    }
}

public class StackManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        
        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Push to Stack 1");
            System.out.println("2. Pop from Stack 1");
            System.out.println("3. Display Stack 1");
            System.out.println("4. Push to Stack 2");
            System.out.println("5. Pop from Stack 2");
            System.out.println("6. Display Stack 2");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter value to push to Stack 1: ");
                    stack1.push(sc.nextInt());
                    break;
                case 2:
                    stack1.pop();
                    break;
                case 3:
                    stack1.display();
                    break;
                case 4:
                    System.out.print("Enter value to push to Stack 2: ");
                    stack2.push(sc.nextInt());
                    break;
                case 5:
                    stack2.pop();
                    break;
                case 6:
                    stack2.display();
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    sc.close();
                    return; // Ends the program
                default:
                    System.out.println("Invalid choice. Try again.");
            }

            // Automatic check: If both stacks have the same number of elements
            // (and aren't both empty), display the required message.
            if (stack1.getSize() == stack2.getSize() && stack1.getSize() > 0) {
                System.out.println("\n*** NOTICE: Both stacks now have equal elements (" + stack1.getSize() + " elements each) ***");
            }
        }
    }
}