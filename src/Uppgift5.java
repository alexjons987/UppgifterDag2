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

        // Array for user guesses, size 15 as we limit the num of guesses to 15
        int[] userGuesses = new int[15];

    }
}
