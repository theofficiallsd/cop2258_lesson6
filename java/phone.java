/*
Program description: This program prompts the user to enter a letter, and the program will display the corresponding phone number.
Assignment: Participation Exercise #3
Author: Logan Drake
Date: 4/7/2017
*/
import java.util.Scanner;

public class phone {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner

		// Prompt the user to enter a phone number as a string
		System.out.print("Enter a letter: ");
		String string = input.nextLine();
		
		// Translate a letter to a digit and leaves all other character intact
		for (int i = 0; i < string.length(); i++) {
			if (Character.isLetter(string.charAt(i)))
				System.out.print(getNumber(Character.toUpperCase(string.charAt(i))));
			else
				System.out.print(string.charAt(i));
		}
		System.out.println();
	}
	
	/* Method getNumber returns a number, given an uppercase letter */
	public static int getNumber(char uppercaseLetter) {
		// Return the corresponding number key
		
		if (uppercaseLetter >= 'W')
			return 9;
		else if (uppercaseLetter >= 'T')
			return 8;
		else if (uppercaseLetter >= 'P')
			return 7;
		else if (uppercaseLetter >= 'M')
			return 6;
		else if (uppercaseLetter >= 'J')
			return 5;
		else if (uppercaseLetter >= 'G')
			return 4;
		else if (uppercaseLetter >= 'D')
			return 3;
		else 
			return 2;
	}
}
