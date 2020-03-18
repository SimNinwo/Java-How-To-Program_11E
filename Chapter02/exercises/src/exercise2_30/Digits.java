package exercise2_30;
// Program reads five digit integer and display digits separated by three spaces

 import java.util.Scanner;
 
public class Digits {

	public static void main(String[] args) 
	{
		// create Scanner object
		Scanner input = new Scanner(System.in);
		
		int number; // number to read
		int digit1;
		int digit2;
		int digit3;
		int digit4;
		int digit5;
		int temp;
		
		System.out.print("Enter number(5 digits): ");
		number = input.nextInt();
		
		digit1 = number / 10000;
		
		temp = number % 10000;
		digit2 = temp / 1000;
		
		temp = number % 1000;
		digit3 = temp / 100;
		
		temp = number % 100;
		digit4 = temp / 10;
		
		temp = number % 10;
		digit5 = temp / 1;
		
		System.out.printf("%d   %d   %d   %d   %d%n", digit1, digit2,
				digit3, digit4, digit5);
		
		input.close();
	}

}
