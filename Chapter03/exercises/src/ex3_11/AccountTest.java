package ex3_11;
// Inputting and outputting floating-point numbers with Account objects.

import java.util.Scanner;

public class AccountTest 
{

	public static void main(String[] args) 
	{
		Account account1 = new Account("Jane Green", 50.00);
		
		// display initial balance of each object
		System.out.printf("%s balance: $%.2f%n", 
				account1.getName(), account1.getBalance());
		
		// create a Scanner to obtain input from the command window
		Scanner input =new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account1: "); // prompt
		double depositAmount = input.nextDouble(); // obtain user input
		System.out.printf("%nadding %.2f to account1 balance%n%n",
				depositAmount);
		account1.deposit(depositAmount); // add to account1's balance
		
		// display balance
		System.out.printf("%n%s balance: $%.2f%n", 
				account1.getName(), account1.getBalance());
		
		// test withdrawal method
		System.out.print("Enter withdrawal amount: "); // prompt
		double withdrawal = input.nextDouble();
		System.out.printf("%nWithdrawing $%.2f from account1%n%n", withdrawal);
		account1.withdrawAmount(withdrawal);
		
		//display balance
		System.out.printf("%s balance: $%.2f%n", 
				account1.getName(), account1.getBalance());
		
		
		
		input.close();
	}

} // end class AccountTest
