package exercise2_25;
// Program reads integer and display if number is even or odd

import java.util.Scanner;

public class OddEven 
{
	public static void main(String[] args) 
	{
		// create Scanner object to read input from user
		Scanner input = new Scanner(System.in);
		
		int number; // number to read
		
		System.out.print("Enter number: "); // prompt
		number = input.nextInt();
		
		if (number % 2 == 0)
			System.out.println("Number is Even");
		
		if (number % 2 != 0)
			System.out.println("Number is Odd");
		
		input.close();
	}

}
