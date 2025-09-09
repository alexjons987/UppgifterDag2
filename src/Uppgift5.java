import java.util.Random;
import java.util.Scanner;

public class Uppgift5 {
    public static void main(String[] args) {
        System.out.println("- Assignment 5: Number guessing game -");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Create and fill an array of size 5 with random numbers (1 - 20)
        int[] hiddenNumbers = new int[5];
        for (int i = 0; i < hiddenNumbers.length; i++)
            hiddenNumbers[i] = random.nextInt(1, 20 + 1); // Orig: Inclusive | Bound: Exclusive

        // Arrays for user guesses
        int[] userGuessesArr = new int[15];
        int[] userGuessesCorrectArr = new int[5];
        int userGuessCorrectIndex = 0;

        // Main game loop
        for (int i = 0; i < userGuessesArr.length; i++) {
            if (userGuessCorrectIndex > userGuessesCorrectArr.length) // If user found all 5 numbers
                break;

            int userGuess;
            do {
                System.out.printf("Guess #%d, pick a number (1-20): ", i + 1);
            } while ((userGuess = scanner.nextInt()) < 1 || userGuess > 20);

            boolean flagCorrect = false;
            boolean flagAlreadyGuessed = false;

            // If already guessed
            for (int num : userGuessesArr) {
                if (num == userGuess) {
                    flagAlreadyGuessed = true;
                    i--; // Let user re-guess
                    System.out.println("You've already guessed this!");
                    break;
                }
            }
            if (flagAlreadyGuessed)
                continue;

            // If correct
            for (int num : hiddenNumbers)
                if (num == userGuess) {
                    userGuessesArr[i] = userGuess; // Add to all guesses
                    userGuessesCorrectArr[userGuessCorrectIndex] = userGuess; // Add to correct guesses
                    userGuessCorrectIndex++;
                    flagCorrect = true;
                    System.out.println("Correct guess!");
                    break;
                }
            if (flagCorrect)
                continue;

            // If incorrect
            userGuessesArr[i] = userGuess; // Add to all guesses
            System.out.println("Incorrect!");
        }

        // Game over
        int totalScore = 0;
        for (int num : userGuessesCorrectArr)
            if (num > 0)
                totalScore++;

        System.out.printf("You found %d out of 5 hidden numbers!", totalScore);
    }
}
