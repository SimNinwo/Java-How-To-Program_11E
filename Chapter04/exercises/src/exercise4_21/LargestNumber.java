package exercise4_21;

public class LargestNumber 
{
	private int number;
	
	public void setNumber(int number)
	{
		this.number = number;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public int getLargestNumber(int num)
	{
		if (num > number)
			number = num;
		
		return number;
	}
}
