package exercise4_18;
import java.util.Scanner;

public class CreditLimitTest 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		CreditLimit verve = new CreditLimit();
		
		int accNo;
		int accBal;
		int tItems;
		int totalCredits;
		int creditLimit;
		int currBal;
		
		System.out.print("Enter Account Number: ");
		accNo = input.nextInt();
		System.out.print("Enter Account Balance: ");
		accBal = input.nextInt();
		System.out.print("Enter Total of Items charged: ");
		tItems = input.nextInt();
		System.out.print("Enter total credits applied: ");
		totalCredits = input.nextInt();
		System.out.print("Enter credit limit: ");
		creditLimit = input.nextInt();
		
		currBal = verve.newBalance(accBal, tItems, totalCredits);
		
		System.out.println();
		
		System.out.println("USER INFORMATION");
		System.out.println("================================");
		
		System.out.printf("Account Number      : %d%n", accNo);
		System.out.printf("Account Balance     : %d%n", accBal);
		System.out.printf("Total Items Charged : %d%n", tItems);
		System.out.printf("Total Credits       : %d%n", totalCredits);
		System.out.println("--------------------------------");
		System.out.printf("New Balance         : %d%n", currBal);
		
		System.out.printf("Credit Limit        : %d%n", creditLimit);
		if (currBal > creditLimit)
			System.out.println("Credit limit Exceeded");

		input.close();
	}
	
}
