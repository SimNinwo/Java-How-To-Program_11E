package ex3_13;
// A program that collects an employee monthly salary and return yearly salary
// and gives a raise of 10%.

public class Employee 
{
	private String firstName;
	private String lastName;
	private double salary;
	
	public Employee(String firstName, String lastName, double salary) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		if (salary > 0.0)
			this.salary = salary;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public void setSalary(double salary) 
	{
		if (salary > 0.0)
			this.salary = salary;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public double getSalary() 
	{
		return salary;
	}
	
	public double yearlySalary() 
	{
		double perAnnum;
		perAnnum = salary * 12;
		return perAnnum;
	}
	
	public double raise(double raise) 
	{
		salary = salary + (salary * (raise / 100));
		
		return salary;
	}
	
}
