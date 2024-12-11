package com.company.projects;

import java.util.Random;
import java.util.Scanner;

public class RocksPaperScissorsGame {
    public static void main(String[] args) {

        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Intro message
        System.out.println("Welcome to Rock, Paper, Scissors Game!");
        System.out.println("Rules: Enter 0 for Rock, 1 for Paper, 2 for Scissors");

        // Choices array for easy conversion of numbers to their respective names
        String[] choices = {"Rock", "Paper", "Scissors"};

        // Game loop
        while (true) {
            // Get the user's choice
            System.out.print("\nEnter your choice (or -1 to exit): ");
            int userChoice = scanner.nextInt();

            if (userChoice == -1) {
                System.out.println("Thanks for playing! Goodbye!");
                break;
            }

            if (userChoice < 0 || userChoice > 2) {
                System.out.println("Invalid choice. Please enter 0, 1, or 2.");
                continue;
            }
            // Generate computer's choice
            int computerChoice = random.nextInt(3);

            // Display choices
            System.out.println("You chose: " + choices[userChoice]);
            System.out.println("Computer chose: " + choices[computerChoice]);

            // Determine the winner
            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 0 && computerChoice == 2) ||  // Rock beats Scissors
                    (userChoice == 1 && computerChoice == 0) ||  // Paper beats Rock
                    (userChoice == 2 && computerChoice == 1)) { // Scissors beats Paper
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }
        // Close scanner
        scanner.close();
    }
}