package chapter3;

import java.util.Scanner;

public class ComputeTax {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter filing status
		System.out.print("(0-single filer, 1-married jointly or qualifying widow(er), "
				+ "\n2-married separately, 3-head of household)\n" + "Enter the filing status: ");
		int status = input.nextInt();

		// Prompt the user to enter taxable income
		System.out.print("Enter the taxable income: ");
		double income = input.nextDouble();

		// Compute tax
		double tax = 0;

		switch (status) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			System.out.println("Error: invalid status");
			System.exit(1);
			break;
		}

		if (status == 0) { // Compute tax for single filers

		} else if (status == 1) { // Compute tax for married file jointly
			// Left as exercise
		} else if (status == 2) { // Compute tax for married separately
			// Left as exercise
		} else if (status == 3) { // Compute tax for head of household
			// Left as exercise
		} else {
			System.out.println("Error: invalid status");
			System.exit(1);
		}

		// Display the result
		System.out.println("Tax is " + (int) (tax * 100) / 100.0);
	}
}
