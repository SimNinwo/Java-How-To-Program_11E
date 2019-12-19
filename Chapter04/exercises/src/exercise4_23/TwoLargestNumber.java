package exercise4_23;

public class TwoLargestNumber 
{
	private int number;
	private int sndnum;
	
	public void setNumber(int number)
	{
		this.number = number;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public void setSndnum(int sndnum)
	{
		this.sndnum = sndnum;
	}
	
	public int getSndnum()
	{
		return sndnum;
	}
	
	public void getLargestNumber(int num)
	{

		if (num > number)
			number = num;
		
	}
	
	public void secondLargest(int num)
	{
		if (num < number && num > sndnum)
			sndnum = num;
	}
}
