package crn23103;
/*
 * Class: CMSC203 CRN23103
 * Instructor: Ahmed Tarek
 * Description: Play an ESP game with the user
 * Due: 09/12/23
 * Platform/compiler: Java
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Alex Mentzell
*/


import java.util.*;
public class ESPGame {

	public static void main(String[] args) {
		String red = "Red";
		String blue = "Blue";
		String green = "Green";
		String yellow = "Yellow";
		String userName, userDescription, dueDate, randColor= "", userColor= "";
		int score = 0, randChoice = 0;
		Random rand = new Random();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hello, welcome to the ESP challenge! \nPlease enter your name: ");
		userName = keyboard.nextLine();
		System.out.println("Please enter your user description: ");
		userDescription = keyboard.nextLine();
		System.out.println("Enter the Due Date: ");
		dueDate = keyboard.nextLine();
		System.out.println("CMSC 203, Assignment 1: ESP Challenge!");
		
		for (int i = 0; i<10; i++) {
			randChoice = rand.nextInt(4);
			randChoice +=1;
			System.out.println("\nRound " + (i+1));
			System.out.println("I'm thinking of a color. \nIs it Red, Blue, Green, or Yellow? \nEnter your guess: ");
			
			do {
				userColor = keyboard.nextLine();
				if (!(userColor.equalsIgnoreCase(red) || userColor.equalsIgnoreCase(blue) || userColor.equalsIgnoreCase(green) || userColor.equalsIgnoreCase(yellow)))
					System.out.println("Please enter a valid color");
			} while (!(userColor.equalsIgnoreCase(red) || userColor.equalsIgnoreCase(blue) || userColor.equalsIgnoreCase(green) || userColor.equalsIgnoreCase(yellow)));
			
			switch (randChoice){
			case 1: randColor = red;
					break;
			case 2: randColor = blue;
					break;
			case 3: randColor = green; 
					break;
			case 4: randColor = yellow;
					break;
			}		
			if (userColor.equalsIgnoreCase(randColor)) {
				score +=1;
			}
			
			System.out.println("\nI was thinking of " + randColor);
			
		}
		
		System.out.println("Game over!");
		System.out.println("You guessed " + score + " out of 10 colors correctly");
		System.out.println("Student Name: " + userName);
		System.out.println("User Description: " + userDescription);
		System.out.println("Due Date: " + dueDate);
		
		keyboard.close();
		System.exit(0);
	}

}

