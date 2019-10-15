package squareOfAstericks;

import java.util.Scanner;
public class SquareOfAstericks {
	static int prompt() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the lenght of the Square: ");
		int dimension = input.nextInt();
		return dimension;
	}
	static void asterick() {
		int dimension = prompt();
		for(int i = 1; i <= dimension; i++) {
			for(int j = 1; j <= dimension; j++ ) {
				System.out.print('*');	
			}
			System.out.println();
		}

	}
	
	static char prompt2() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Character to fill the Square with: ");
		char character = input.next().charAt(0);
		return character;
	}
	
	static void fillCharacter(int dimension, char character) {
		int dimension1 = prompt();
		char character1 = prompt2();
		for(int i = 1; i <= dimension1; i++) {
			for(int j = 1; j <= dimension1; j++ ) {
				System.out.printf("%s", character1);	
			}
			System.out.println();
		}

	}

}