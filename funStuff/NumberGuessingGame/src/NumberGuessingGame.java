import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number (1-100): ");
        int guess = scanner.nextInt();
        int numToGuess = random.nextInt(100)+1;

        while (guess != numToGuess) {
            if (guess > numToGuess) {
                System.out.println("Lower!");
                guess = scanner.nextInt();
            }
            if (guess < numToGuess) {
                System.out.println("Higher!");
                guess = scanner.nextInt();
            }
        }
        System.out.println("Correct!");
        scanner.close();
    }
}

