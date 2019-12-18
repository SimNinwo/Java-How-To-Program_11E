package exercise4_19;

public class SalesCommision 
{
	private int bWage = 200;
	private double commission;
	private double grossSales;
	
	
	public int getBWage() {
		return bWage;
	}
	
	public void grossSales(int item)
	{
		if (item == 1)
			grossSales += 239.99;
		if (item == 2)
			grossSales += 129.75;
		if (item == 3)
			grossSales += 99.95;
		if (item == 4)
			grossSales += 350.89;
	
	}
	
	public double getGrossSales()
	{
		return grossSales;
	}
	
	public double getCommission()
	{
		commission = 0.09 * grossSales;
		
		return commission;
	}
	
	public double totalWages()
	{
		double totalWages = getCommission() + bWage;
		
		return totalWages;
	}
}
