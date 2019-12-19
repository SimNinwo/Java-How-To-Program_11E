package exercise4_23;
// A program that collects unit sales and returns largest units sold
import java.util.Scanner; // import Class Scanner

public class TwoLargestNumberTest 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		TwoLargestNumber ln = new TwoLargestNumber();
		
		int counter = 0;
		int number;
		int largest;
		int secondLargest;
		
		while (counter != 10)
		{
			counter++;
			
			System.out.print("Enter units of Salespserson "+ counter+": ");
			number = input.nextInt();
			
			ln.getLargestNumber(number);
			ln.secondLargest(number);
			
			
		}
		
		largest = ln.getNumber();
		secondLargest = ln.getSndnum();
		
		System.out.printf("Largest Units Sold: %d", largest);
		System.out.printf("Second Largest Units Sold: %d", secondLargest);
		
		input.close();
				
	}

}
