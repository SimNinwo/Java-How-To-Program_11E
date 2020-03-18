package exercise2_16;
// Program collects two integers, compares and display larger number

import java.util.Scanner; // program uses class Scanner 

public class Compare 
{
	public static void main(String[] args)
	{
		// create Scanner object to collect input from command line
		Scanner input = new Scanner(System.in);
		
		int number1; // first number to read
		int number2; // second number to read
		
		System.out.print("Enter first integer: "); // prompt
		number1 = input.nextInt(); // reads input from user
		System.out.print("Enter second integer: "); // prompt
		number2 = input.nextInt(); // reads second innput from user
		
		if (number1 > number2)
			System.out.println(number1 + " is larger"); // displays number1 as largest
		
		if (number1 < number2)
			System.out.println(number2 + " is larger"); // displays number2 as largest
		
		if (number1 == number2)
			System.out.println("These numbers are equal"); // displays string if numebers are equal
	
		input.close();
	
	} // end method main

} // end class Compare
