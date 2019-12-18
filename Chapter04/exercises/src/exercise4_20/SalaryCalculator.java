package exercise4_20;

public class SalaryCalculator 
{
	
	private int workHours;
	private double hourlyRate;
	
	
	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	
	public int getWorkHours() {
		return workHours;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public double grossPay()
	{
		double pay;
		if (workHours <= 40)
			pay = workHours * hourlyRate;
		else
			pay = (workHours * hourlyRate) + overTimePay();
		
		return pay;
	}
	
	
	public double  overTimePay() 
	{
		
		double overTimePay = (workHours - 40) * (hourlyRate * 1.5);
		
		return overTimePay;
	}
}

