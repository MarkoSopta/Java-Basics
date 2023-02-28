import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number (1-100): ");
        int guess =0;
        int numToGuess = random.nextInt(100)+1;
        int tries=0;

        while (guess != numToGuess) {
            guess = scanner.nextInt();
            tries++;
            if (guess > numToGuess) {
                System.out.println("Lower!");
            }
            if (guess < numToGuess) {
                System.out.println("Higher!");
            }
        }
        System.out.println("Correct! You guessed it in "+ tries +" tries!");
        scanner.close();
    }
}

