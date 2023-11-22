package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {

		Random random = new Random();
		int numberToGuess = random.nextInt(1, 101);

		Scanner scanner = new Scanner(System.in);
		int userInput = 0;

		System.out.println("Pick a number between 1 and 100: (random:" + numberToGuess + ")");

		int numberOfGuesses = 0;
		int maxNumberOfGuesses = 5;

		while (numberOfGuesses < maxNumberOfGuesses) {
			int remainingGuesses = maxNumberOfGuesses - numberOfGuesses - 1;

			userInput = scanner.nextInt();

			if (userInput < 1 || userInput > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again");
			} else {
				if (remainingGuesses == 0) {
					break;
					} if (userInput < numberToGuess) {
					System.out.println("Pick a higher number, you have " + remainingGuesses + " guess"
							+ (remainingGuesses == 1 ? "" : "es") + " left");
				} else if (userInput > numberToGuess) {
					System.out.println("Pick a lower number, you have " + remainingGuesses + " guess"
							+ (remainingGuesses == 1 ? "" : "es") + " left");
				} else {
					System.out.println("You Win!");
					break;
				}
				numberOfGuesses++;
			}
		}

		if (userInput != numberToGuess) {
			System.out.println("You Lose! The number was " + numberToGuess);
		}

		scanner.close();
	}
}