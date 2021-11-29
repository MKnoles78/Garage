
//Author: Mike Knoles, PA 3.7
//Exercise 6.8 Solution: Garage.java
//Program calculates charges for parking
import java.util.Scanner;

public class Garage {
	// begin calculating charges
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double totalReceipts = 0.0; // total fee collected for the day
		double fee; // the charge for the current customer
		double hours; // hours for the current customer

		// read in the first customer's hours
		System.out.print("Enter number of hours (-1 to quit): ");
		hours = input.nextDouble();

		while (hours >= 0.0) {
			// calculate and print the charges
			fee = calculateCharges(hours);
			totalReceipts += fee;
			System.out.printf("Current charges: $%.2f, Total receipts: $%.2f%n", fee, totalReceipts);

			// read in the next customer's hours
			System.out.print("Enter number of hours (-1 to quit): ");
			hours = input.nextDouble();
		}
	}

	// determines fee based on time
	public static double calculateCharges(double hours) {
		// apply minimum charge
		double charge = 2.0;

		// add extra fees as applicable
		// .50 per hour above 3 maximum charge $10
		// add each customer's total to totalReceipts
		if (hours > 10) {
			charge = 10.0;
		} else if (hours > 3) {
			charge = charge + (hours - 3) * .50;
		}
		// apply maximum charge if needed

		return charge;
	}

} // end class Garage
