package exercise2_15;
// Arithmetic program that inputs two integers 
// and displays sum, product difference and quotient.

import java.util.Scanner; // program uses class Scanner

public class Arithmetic 
{
	// main method begins Java Application execution
	public static void main(String[] args)
	{
		// create Scanner object to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		int number1; // first number to read
		int number2; // second number to read
		int sum; // sum of number1 and number2
		int diff; // remainder between number1 and number2
		int product; // multiplication between number1 and number2
		int quotient; // difference between number1 and number2
		
		System.out.print("Enter first integer: "); // prompt
		number1 = input.nextInt(); // reads first input from user
		System.out.print("Enter second integer: "); // prompt
		number2 = input.nextInt(); // reads second input from user
		
		sum = number1 + number2; // adds numbers
		diff = number1 % number2; // gives remainder number
		product = number1 * number2; // multiplies numbers
		quotient = number1 / number2; // divides of numbers
		
		System.out.printf("%nSum is %d%n", sum); // displays sum 
		System.out.printf("Diff is %d%n", diff); // displays difference
		System.out.printf("Product is %d%n", product); // displays product
		System.out.printf("Quotient is %d%n", quotient); // displays quotient
		
		input.close();

	} // end method main

} // end class Arithmetic
