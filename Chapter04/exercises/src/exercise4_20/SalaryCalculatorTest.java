package exercise4_20;
import java.util.Scanner;

public class SalaryCalculatorTest 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		SalaryCalculator pbm = new SalaryCalculator();
		
		int hours;
		int count = 0;
		double rate;
		
		while (count != 3)
		{
			count++;
			System.out.printf("Salary Calculation For Employee %d%n%n", count);
			
			System.out.print("Enter number of Work Hours: ");
			hours = input.nextInt();
			pbm.setWorkHours(hours);
			
			System.out.print("Enter rates per hour: ");
			rate = input.nextDouble();
			pbm.setHourlyRate(rate);
			
			System.out.println("EMPLOYEE "+ count);
			System.out.println("==============================");
			System.out.printf("Hours Worked: %d%nHourly Rate: $%.2f%nSalary: $%.2f%n",
					hours, rate, pbm.grossPay());
			System.out.println("==============================\n");
			
		}
		
		input.close();

	}

}
