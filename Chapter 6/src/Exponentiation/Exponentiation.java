package Exponentiation;

import java.util.Scanner;
public class Exponentiation {

	static Scanner input = new Scanner(System.in);
	
	static int base() {
		System.out.print("Enter the Base: ");
		int base = input.nextInt();
		return base;
	}
	
	static int power() {
		System.out.print("Enter the Power: ");
		int power = input.nextInt();
		return power;
	}
	static void integerPower(int base, int power) {
		base = base();
		power = power();
		
			int counter = 1;
			int integerPower = 1;
		if(power > 0) {	
			while(counter <= power) {
				counter++;
				integerPower = integerPower * base;
			}
		}
		if(power == 0) {
			 integerPower = 1;
		}
		 
		 System.out.printf("%d Raised To Power %d is %d.", base, power, integerPower);
	}
//	static void integerPower2(String base, String power) {
//		base = base();
//		power = power();
//		
//			int counter = 1;
//			int integerPower = 1;
//		if(power != 0) {	
//			while(counter <= power) {
//				counter++;
//				integerPower = integerPower * base;
//			}
//		}
//		if(power == 0) {
//			 integerPower = 1;
//		}
//		 
//		 System.out.printf("%d Raised To %d is %d", base, power, integerPower);
//	}

}
