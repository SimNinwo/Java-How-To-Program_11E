package exercise2_32;
// Program that inputs 5 numbers, determines and displays the number of negative numbers,
// the number of positive numbers and number of zeros

import java.util.Scanner;

public class Values {

	public static void main(String[] args) 
	{
		// create scanner object
		Scanner input = new Scanner(System.in);
		
		double number;
		int zeroVal = 0;
		int positiveVal = 0;
		int negativeVal = 0;
		
		System.out.print("Enter first value: ");
		number = input.nextDouble();
		
		if (number == 0)
			zeroVal = zeroVal + 1;
		
		if (number > 0)
			positiveVal = positiveVal + 1;
		
		if (number < 0)
			negativeVal = negativeVal + 1;
			
		System.out.print("Enter second value: ");
		number = input.nextDouble();
		
		if (number == 0)
			zeroVal = zeroVal + 1;
		
		if (number > 0)
			positiveVal = positiveVal + 1;
		
		if (number < 0)
			negativeVal = negativeVal + 1;
		
		
		System.out.print("Enter third value: ");
		number = input.nextDouble();
		
		if (number == 0)
			zeroVal = zeroVal + 1;
		
		if (number > 0)
			positiveVal = positiveVal + 1;
		
		if (number < 0)
			negativeVal = negativeVal + 1;
		
		
		System.out.print("Enter fourth value: ");
		number = input.nextDouble();
		
		if (number == 0)
			zeroVal = zeroVal + 1;
		
		if (number > 0)
			positiveVal = positiveVal + 1;
		
		if (number < 0)
			negativeVal = negativeVal + 1;
		
		
		System.out.print("Enter fifth value: ");
		number = input.nextDouble();
		
		if (number == 0)
			zeroVal = zeroVal + 1;
		
		if (number > 0)
			positiveVal = positiveVal + 1;
		
		if (number < 0)
			negativeVal = negativeVal + 1;
		
		System.out.println();
		
		System.out.printf("Zero Values = %d%nPositive Values = %d%nNegative Values = %d%n",
				zeroVal, positiveVal, negativeVal);
		
		input.close();
	}

}
