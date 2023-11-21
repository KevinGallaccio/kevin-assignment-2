package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {

		Random random = new Random();
		int theRandomNumber = random.nextInt(1, 101);

		Scanner scanner = new Scanner(System.in);
		int userInput;

		System.out.println("Pick a number between 1 and 100: ");
		userInput = scanner.nextInt();

		int chances = 0;
		while (chances < 4) {

			if (userInput < 1 || userInput > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again");
				userInput = scanner.nextInt();
			} else if (userInput < theRandomNumber) {
				System.out.println("Pick a higher number, you have " + (4 - chances) + " chances left");
				chances = chances + 1;
				userInput = scanner.nextInt();
			} else if (userInput > theRandomNumber) {
				System.out.println("Pick a lower number, you have " + (4 - chances) + " chances left");
				chances = chances + 1;
				userInput = scanner.nextInt();
			} else {
				System.out.println("You Win!");
				chances = chances + 4;
			}
		}
		if (userInput < theRandomNumber || userInput > theRandomNumber) {
			System.out.println("You Lose ! the number was " + theRandomNumber);
		}
		scanner.close();

	}
}
