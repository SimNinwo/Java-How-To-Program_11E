package exercise2_26;
// Program reads two integers and determines its a multiple

import java.util.Scanner;

public class Multiples 
{
	public static void main(String[] args)
	{
		// create scanner object
		Scanner input = new Scanner(System.in);
		
		int number; // number to read
		int multiple; // multiple to read
		
		System.out.print("Enter number: "); // prompt
		number = input.nextInt();
		System.out.print("Enter multiple: ");
		multiple = input.nextInt();
		
		if (multiple % number == 0)
			System.out.println("Its a multiple!");
		
		if (multiple % number != 0)
			System.out.println("It is not a multiple");
		
		
		input.close();
	}
}
