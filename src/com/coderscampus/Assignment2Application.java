package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {

		String reset = "\u001B[0m";
		String red = "\u001B[31m";
		String green = "\u001B[32m";
		String purple = "\u001B[35m";

		Random random = new Random();
		int numberToGuess = random.nextInt(100) + 1;

		Scanner scanner = new Scanner(System.in);
		int userInput = 0;
		int userGuesses = 0;
		int maxNumberOfGuesses = 5;

		System.out.println("Pick a number between 1 and 100 (you have a total of " + red + maxNumberOfGuesses + reset
				+ " guesses):");
//		System.out.println(purple + " // the number to guess is: " + numberToGuess + reset);

		while (userGuesses < maxNumberOfGuesses) {
			userInput = scanner.nextInt();
			int guessesLeft = (maxNumberOfGuesses - userGuesses) - 1;
			if (userInput < 1 || userInput > 100) {
				System.out.println(red + "Your guess is not between 1 and 100, please try again" + reset);
			} else if (userInput == numberToGuess) {
				System.out.println(green + "You win!" + reset);
				break;
			} else if (guessesLeft == 0 && userInput != numberToGuess) {
				System.out.println("You lose, the number to guess was: " + red + numberToGuess + reset);
				break;
			} else {
				if (userInput < numberToGuess) {
					System.out.println("Please pick a higher number, you have " + red + guessesLeft + reset + " guess"
							+ (guessesLeft == 1 ? "" : "es") + " left: ");
				} else if (userInput > numberToGuess) {
					System.out.println("Please pick a lower number, you have " + red + guessesLeft + reset + " guess"
							+ (guessesLeft == 1 ? "" : "es") + " left: ");
				}
				userGuesses++;
			}
		}
		scanner.close();
	}
}