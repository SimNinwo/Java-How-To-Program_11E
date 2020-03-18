package ex3_17;

public class HealthProfile 
{
	private String firstName;
	private String lastName;
	private String gender;
	private int day, month, year;
	private double height;
	private double weight;
	
	public HealthProfile(String firstName, String lastName, String gender, int day, int month, int year, double height,
			double weight) 
	{

		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.day = day;
		this.month = month;
		this.year = year;
		this.height = height;
		this.weight = weight;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getGender() {
		return gender;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
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
	
	public double getBMI()
	{
		double bmi;
		bmi = (weight * 703) / Math.pow(height, 2);
		
		return bmi;
	}
}
