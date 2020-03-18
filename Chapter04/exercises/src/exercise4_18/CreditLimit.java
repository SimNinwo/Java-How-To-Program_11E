package exercise4_18;

public class CreditLimit 
{
	private int accountNumber;
	private int startBalance;
	private int totalItemsCharged;
	private int credits;
	private int creditLimit;
	
	public void setAccountNumber(int accountNumber) 
	{
		this.accountNumber = accountNumber;
	}
	
	public void setStartBalance(int startBalance) 
	{
		this.startBalance = startBalance;
	}
	
	public void setTotalItemsCharged(int totalItemsCharged) 
	{
		this.totalItemsCharged = totalItemsCharged;
	}
	
	public void setCredits(int credits) 
	{
		this.credits = credits;
	}
	
	public void setCreditLimit(int creditLimit) 
	{
		this.creditLimit = creditLimit;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public int getStartBalance() 
	{
		return startBalance;
	}
	
	public int getTotalItemsCharged() 
	{
		return totalItemsCharged;
	}
	
	public int getCredits() 
	{
		return credits;
	}
	
	public int getCreditLimit() 
	{
		return creditLimit;
	}
	
	public int newBalance(int balance, int charges, int credits)
	{
		int newBal = balance + charges - credits;
		return newBal;
	}
}
