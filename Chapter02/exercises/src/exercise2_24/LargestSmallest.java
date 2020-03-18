package exercise2_24;
// Program reads 5 integers and displays the largest and smallest

import java .util.Scanner;

public class LargestSmallest 
{

	public static void main(String[] args) 
	{
		// create Scanner object to read input from user
		Scanner input = new Scanner(System.in);
		
		int number1; // first number to read
		int number2; // second number to read
		int number3; // third number to read
		int number4; // fourth number to read
		int number5; // fifth number to read
		
		System.out.print("Enter first number: "); // prompt
		number1 = input.nextInt();
		System.out.print("Enter second number: ");// prompt
		number2 = input.nextInt();
		System.out.print("Enter third number: ");// prompt
		number3 = input.nextInt();
		System.out.print("Enter fourth number: ");// prompt
		number4 = input.nextInt();
		System.out.print("Enter fifth number: ");// prompt
		number5 = input.nextInt();
		
		// condition to determine largest number
		if (number1 > number2 && number1 > number3 
				&& number1 > number4 && number1 > number5)
			System.out.printf("%d is largest%n", number1);
		
		if (number2 > number1 && number2 > number3 
				&& number2 > number4 && number2 > number5)
			System.out.printf("%d is largest%n", number2);
		
		if (number3 > number1 && number3 > number2 
				&& number3 > number4 && number3 > number5)
			System.out.printf("%d is largest%n", number3);
		
		if (number4 > number1 && number4 > number2 
				&& number4 > number3 && number4 > number5)
			System.out.printf("%d is largest%n", number4);
		
		if (number5 > number1 && number5 > number2 
				&& number5 > number3 && number5 > number4)
			System.out.printf("%d is largest%n", number5);
		
		
		// condition to determine smallest number
		if (number1 < number2 && number1 < number3 
				&& number1 < number4 && number1 < number5)
			System.out.printf("%d is smallest%n", number1);
		
		if (number2 < number1 && number2 < number3 
				&& number2 < number4 && number2 < number5)
			System.out.printf("%d is smallest%n", number2);
		
		if (number3 < number1 && number3 < number2 
				&& number3 < number4 && number3 < number5)
			System.out.printf("%d is smallest%n", number3);
		
		if (number4 < number1 && number4 < number2 
				&& number4 < number3 && number4 < number5)
			System.out.printf("%d is smallest%n", number4);
		
		if (number5 < number1 && number5 < number2 
				&& number5 < number3 && number5 < number4)
			System.out.printf("%d is smallest%n", number5);
		
		input.close();
		
	}

}
