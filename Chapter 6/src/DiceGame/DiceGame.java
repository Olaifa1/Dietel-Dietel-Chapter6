package DiceGame;

import java.security.SecureRandom;
public class DiceGame {
	
	SecureRandom randomNumber = new SecureRandom();
	
	
	public int diceThrow() {
		int sum = 0;
		int point = 0;
		int die1 = 1 + randomNumber.nextInt(6);
		int die2 = 1 + randomNumber.nextInt(6);
			sum = die1 + die2;
			return sum;
	}
			
	public void dice() {
		int sum = diceThrow();
			int point1 = 1;
		switch(sum) {
			case 2:
				System.out.print("The Sum of First Throw is 2." + "\n" + "Oops, You Lose. \nGame Over");
				break;
			case 3:
				System.out.print("The Sum of First Throw is 3." + "\n" + "Oops, You Lose. \nGame Over.");
				break;
			case 12:
				System.out.print("The Sum of First Throw is 12." + "\n" + "Congratulations, You Win.");
				break;
			case 7:
				System.out.print("The Sum of First Throw is 7." + "\n" + "Congratulations, You Win.");
				break;
			case 11:
				System.out.print("The Sum of First Throw is 11." + "\n" + "Congratulations, You Win.");
				break;
			
			default:
				System.out.printf("The Sum of First Throw is %d.\n", sum);
			
				while(point1 != sum) {
					point1 = diceThrow();	//Sum of the dice thrown			
					if(point1 == sum) {
						System.out.printf("The Sum of the Next Throw is %d.\n", point1);	
						System.out.print("Congratulations, You Win.");
					}
					else {
						if(point1 == 7) {
							System.out.printf("The Sum of the Next Throw is %d.\n", point1);
							System.out.print("Oops, You Lose. \nGame Over.");
							break;
						}
					}
				}
		}
	}
}
