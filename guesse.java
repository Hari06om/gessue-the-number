// wap a program that a genrats a random number and ask a user to guess what the number is. 
// if user the user guess higher then a random number, the program should display the number to high again .
//  if the user guess is lower then the number should be displayed to low try aain the program should use a loopp that repet until the user correctly guesses the number is correct.


import java.util.Random;
import java.util.Scanner;

public class guesse {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;  

        // Initialize the number of attempts
        int attempts = 0;

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the number guessing game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        while (true) {
            // Ask the user for their guess
            System.out.print("Take a guess: ");
            String userGuessStr = scanner.nextLine();

            // Validate the user's input
            try {
                int userGuess = Integer.parseInt(userGuessStr);

                // Increment the number of attempts
                attempts++;

                // Check if the user's guess is correct
                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a whole number.");
            }
        }

        // Close the Scanner object
        scanner.close();
    }
}
