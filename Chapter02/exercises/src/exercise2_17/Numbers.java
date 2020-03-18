package exercise2_17;
// Program collects three integers and displays the sum, average,
// product, smallest and largest

import java.util.Scanner;

public class Numbers 
{

	public static void main(String[] args) 
	{
		// create scanner object to collect input from user 
		Scanner input = new Scanner(System.in);
		
		int number1; // first number to read
		int number2; // second number to read
		int number3; // third number to read
		int sum; // collects sum of numbers
		int product; // collects multiplication of integers
		int average; // collects average of integers
		
		System.out.print("Enter first number: "); // prompt
		number1 = input.nextInt();
		System.out.print("Enter second number: "); // prompt
		number2 = input.nextInt();
		System.out.print("Enter third number: "); // prompt
		number3 = input.nextInt();
		
		sum = number1 + number2 + number3;
		product = number1 * number2 * number3;
		average = sum / 3;
		
		System.out.printf("Sum is %d%n", sum);
		System.out.printf("Product is %d%n", product);
		System.out.printf("Average is %d%n", average);
		
		if (number1 > number2 && number1 > number3)
			System.out.printf("%d is largest%n", number1);

		if (number2 > number1 && number2 > number3)
			System.out.printf("%d is largest%n", number2);

		if (number3 > number1 && number3 > number2)
			System.out.printf("%d is largest%n", number3);

		if (number1 < number2 && number1 < number3)
			System.out.printf("%d is smallest%n", number1);

		if (number1 < number1 && number2 < number3)
			System.out.printf("%d is smallest%n", number2);

		if (number3 < number1 && number3 < number2)
			System.out.printf("%d is smallest%n", number3);

		input.close();
	}

}
