package ex3_13;
// A program that test the capabilities of the Employee class

import java.util.Scanner;

public class EmployeeTest 
{

	public static void main(String[] args) 
	{
		// create a Scanner onject
		Scanner input = new Scanner(System.in);
		
		Employee staff1 = new Employee("Jame", "Bentley", 34_000);
		Employee staff2 = new Employee("Jane", "Foster", 35_000);
		
		int raise; 
		
		System.out.print("\t\t\tEMPLOYEE PAYROLL\n");
		
		System.out.println("==============================================================");
		System.out.println("\nFirst Name\tLast Name\tMonthly Salary\tYearly Salary");
		System.out.println("--------------------------------------------------------------");
		
		System.out.printf("%-15s\t%-15s\t$%,-10.2f\t$%,.2f%n",
				staff1.getFirstName(), staff1.getLastName(), 
				staff1.getSalary(), staff1.yearlySalary()
				);
		System.out.printf("%-15s\t%-15s\t$%,-10.2f\t$%,.2f%n",
				staff2.getFirstName(), staff2.getLastName(), 
				staff2.getSalary(), staff2.yearlySalary()
				);
		
		System.out.println("\nEmployee receives raise\n");
		
		System.out.print("Enter raise amount(in percent): "); // prompt
		raise = input.nextInt();
		staff1.raise(raise);
		staff2.raise(raise);
		
		System.out.print("\n\n\t\t\tNEW EMPLOYEE PAYROLL\n");
		
		System.out.println("==============================================================");
		System.out.println("\nFirst Name\tLast Name\tMonthly Salary\tYearly Salary");
		System.out.println("--------------------------------------------------------------");
		
		System.out.printf("%-15s\t%-15s\t$%,-10.2f\t$%,.2f%n",
				staff1.getFirstName(), staff1.getLastName(), 
				staff1.getSalary(), staff1.yearlySalary()
				);
		System.out.printf("%-15s\t%-15s\t$%,-10.2f\t$%,.2f%n",
				staff2.getFirstName(), staff2.getLastName(), 
				staff2.getSalary(), staff2.yearlySalary()
				);
			
		input.close();
	}

}
