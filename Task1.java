import java.util.Random;
import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        int score = 0;
        int roundsWon = 0;
        boolean playAgain = true;

        while (playAgain) {
            int attempts = 0;
            int maxAttempts = 6;
            int minRange = 1;
            int maxRange = 100;
            int generatedNumber = new Random().nextInt(maxRange - minRange + 1) + minRange;

            System.out.println("Welcome to the Guessing Game!");
            System.out.println("I'm thinking of a number between " + minRange + " and " + maxRange + ".");
            System.out.println("You have " + maxAttempts + " attempts to guess the number.");

            Scanner scanner = new Scanner(System.in);

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == generatedNumber) {
                    System.out.println(" Congratulations! You guessed the number in " + attempts + " attempts.");
                    score += maxAttempts - attempts + 1;
                    roundsWon++;
                    break;
                } else if (userGuess < generatedNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (attempts == maxAttempts) {
                System.out
                        .println("Sorry, you didn't guess the number. The correct answer was " + generatedNumber + ".");
            }

            System.out.print("Do you want to play again? (y/n): ");
            String response = scanner.next();

            if (response.equalsIgnoreCase("n")) {
                playAgain = false;
            }
        }

        System.out.println("Your final score is " + score);
        System.out.println("You won " + roundsWon + " rounds.");
    }
}