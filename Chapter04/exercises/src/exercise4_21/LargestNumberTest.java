package exercise4_21;
// A program that collects unit sales and returns largest units sold
import java.util.Scanner; // import Class Scanner

public class LargestNumberTest 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		LargestNumber ln = new LargestNumber();
		
		int counter = 0;
		int number;
		int largest;
		
		while (counter != 10)
		{
			counter++;
			
			System.out.print("Enter units of Salespserson "+ counter+": ");
			number = input.nextInt();
			
			ln.getLargestNumber(number);
			
			
		}
		
		largest = ln.getNumber();
		
		System.out.printf("Largest Units Sold: %d", largest);
		
		input.close();
				
	}

}
