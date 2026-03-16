import java.util.Scanner;

public class LotteryGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Generate a random 2-digit number (Math.random() gives 0.0 to 0.99)
        // Multiplying by 90 gives 0 to 89, adding 10 shifts it to 10 to 99
        int lottery = (int)(Math.random() * 90) + 10;

        System.out.print("Enter your 2-digit lottery pick: ");
        int guess = sc.nextInt();

        // Extract individual digits from the lottery number
        int lotteryDigit1 = lottery / 10; // Gets the first digit (tens place)
        int lotteryDigit2 = lottery % 10; // Gets the second digit (ones place)

        // Extract individual digits from the user's guess
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The winning lottery number is: " + lottery);

        // Determine the prize based on the rules
        if (guess == lottery) {
            System.out.println("Exact match! You win Rs. 10000.");
        } else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2) {
            System.out.println("Match all digits, but not in order! You win Rs. 3000.");
        } else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 ||
                   guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2) {
            System.out.println("Match one digit! You win Rs. 1000.");
        } else {
            System.out.println("Sorry, no match. Better luck next time!");
        }

        sc.close();
    }
}