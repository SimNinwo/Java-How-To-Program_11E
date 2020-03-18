package exercise4_19;
import java.util.Scanner;

public class SalesCommissionTest {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		SalesCommision sales1 = new SalesCommision();
		
		int item = 0;
		
		
		while(item != 9)
		{
			System.out.print("Enter item sold(1-4) and 9 to exit: ");
			item = input.nextInt();
			sales1.grossSales(item);
				
		}
		
		
		System.out.printf("TOTAL WEEKLY SALES: %.2f%n", sales1.getGrossSales());
		System.out.printf("SALES COMMISSION: %.2f%n", sales1.getCommission());
		System.out.printf("TOTAL WAGE PAYABLE: %.2f%n", sales1.totalWages());
		
		input.close();
	}

}
