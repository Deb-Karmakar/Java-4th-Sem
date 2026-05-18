import java.util.Scanner;

class CharacterTracker {
    private int totalCount = 0;

    public void addCharacter(char c) throws IllegalArgumentException {
        if (!Character.isLetter(c)) {
            throw new IllegalArgumentException("Non-alphabetic character found: '" + c + "'");
        }
        totalCount++;
        System.out.println("Accepted: '" + c + "' | Running total: " + totalCount);
    }

    public int getTotal() {
        return totalCount;
    }
}

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CharacterTracker tracker = new CharacterTracker();
        boolean continueLoop = true;

        do {
            System.out.print("Enter a character: ");
            String s = scanner.nextLine();
            char c=s.charAt(0);

            try {
                tracker.addCharacter(c);
            } catch (IllegalArgumentException e) {
                System.out.println("Exception caught: " + e.getMessage());
                System.out.println("Program exiting. Final total: " + tracker.getTotal());
                continueLoop = false;
            }

        } while (continueLoop);

        scanner.close();
    }
}