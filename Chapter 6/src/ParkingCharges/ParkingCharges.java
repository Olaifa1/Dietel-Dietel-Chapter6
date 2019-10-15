package ParkingCharges;

import java.util.Scanner;

public class ParkingCharges {
	public double cummulativeGrossCharges() {
		int counter = 0;
		double hourlyRate = 0.0;
		double parkingHours = 0.0;
		double grossCharge = 2.0;
		double grossCharge1 = 0.0;
		double grossCharge2 = 0.0;
		double cummulativeGrossCharge = 0.0;
		int car = 0;
		Scanner input = new Scanner(System.in);
		
		while(parkingHours != -1) {
			System.out.print("Enter Vehicle Name: ");
			String vehicleName = input.next();
			System.out.print("Enter Parking Hours For the Vehicle Name Or -1 To Terminate: ");
			parkingHours = input.nextDouble();
			if(parkingHours <= 3 && parkingHours > 0) {
				grossCharge = 2.0;
				System.out.printf("The Parking Charge For vehicle %s is $%f \n", vehicleName, grossCharge);
			}
			if(parkingHours > 3 && parkingHours < 19) {
				grossCharge1 = 2.0 + (0.5 * (parkingHours - 3));
				System.out.printf("The Parking Charge For vehicle %s is $%f \n", vehicleName, grossCharge1);
			}
			if(parkingHours >= 19 && parkingHours <= 24 ) {
					grossCharge2 =  10;   
					System.out.printf("The Parking Charge For vehicle %s is $%f \n", vehicleName, grossCharge2);
			}
			if(parkingHours > 24) {
				System.out.print("This Parking Hour is Invalid");
			}
				
		}
		cummulativeGrossCharge = cummulativeGrossCharge + grossCharge + grossCharge1;
		System.out.printf("The Total Parking Charges For all vehicles is $%f", cummulativeGrossCharge);
		return cummulativeGrossCharge;
		}
}
