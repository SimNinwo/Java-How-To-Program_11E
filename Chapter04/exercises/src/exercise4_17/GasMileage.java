package exercise4_17;
// Program collect miles and gallons and calculates miles per gallon
// and total miles per gallon for trips

public class GasMileage 
{
	private int miles;
	private int gallons;
	private double totalMPG;
	
	public void setMiles(int miles) 
	{
		this.miles = miles;
	}
	
	public void setGallons(int gallons) 
	{
		this.gallons = gallons;
	}

	public int getMiles() 
	{
		return miles;
	}

	public int getGallons() 
	{
		return gallons;
	}
	
	// calculate miles per gallons
	public double mPG(int miles, int gallons)
	{
		double mPG = (double) miles / gallons;
		totalMPG += mPG;
		return mPG;
	}
	
	// addition of miles per gallon
	public double getTotalMPG()
	{
		return totalMPG;

	}
	
	
	
}
