package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {

		Random random = new Random();
		int numberToGuess = random.nextInt(1, 101);

		Scanner scanner = new Scanner(System.in);
		int userInput;

		System.out.println("Pick a number between 1 and 100: ");
		userInput = scanner.nextInt();

		int numberOfGuesses = 0;
		int maxNumberOfGuesses = 4;

		while (numberOfGuesses < maxNumberOfGuesses) {
			int remainingGuesses = maxNumberOfGuesses - numberOfGuesses;

			if (userInput < 1 || userInput > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again");
			} else if (userInput < numberToGuess) {
				System.out.println("Pick a higher number, you have " + (remainingGuesses) + " guess"
						+ (remainingGuesses == 1 ? "" : "es") + " left");
				numberOfGuesses++;
			} else if (userInput > numberToGuess) {
				System.out.println("Pick a lower number, you have " + (remainingGuesses) + " guess"
						+ (remainingGuesses == 1 ? "" : "es") + " left");
				numberOfGuesses++;
			} else {
				System.out.println("You Win!");
				break;
			}
			userInput = scanner.nextInt();
		}
		if (userInput != numberToGuess) {
			System.out.println("You Lose ! the number was " + numberToGuess);
		}
		scanner.close();

	}
}
