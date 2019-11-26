package ex3_16;

public class HeartRates 
{
	private String firstName;
	private String lastName;
	private int day, month, year;

	
	public HeartRates(String firstName, String lastName, int day, int month, int year) 
	{
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public void setDay(int day) 
	{
		this.day = day;
	}

	public void setMonth(int month) 
	{
		this.month = month;
	}

	public void setYear(int year) 
	{
		this.year = year;
	}
	
	public String getFirstName() 
	{
		return firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public int getDay() 
	{
		return day;
	}

	public int getMonth() 
	{
		return month;
	}

	public int getYear() 
	{
		return year;
	}

	public String dateOfBirth()
	{
		String dOB;
		dOB = day + "/" + month + "/" + year;
		
		return dOB;
	}
	
	public int age() 
	{
		int age;
		age = 2019 - year;
		
		return age;
	}
	
	public int maxHeartRate()
	{
		int maxHeartRate;
		maxHeartRate = 220 - age();
		
		return maxHeartRate;
	}

	public String targetHeartRate()
	{
		double lowTarget;
		double highTarget;
		String targetRange;
		
		lowTarget = 0.5 * maxHeartRate();
		highTarget = 0.85 * maxHeartRate();
		targetRange = lowTarget + " - " + highTarget;
		
		return targetRange;
	}
}
