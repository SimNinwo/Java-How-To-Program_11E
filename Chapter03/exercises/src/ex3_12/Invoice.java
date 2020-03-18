package ex3_12;
// A program displays an invoice containing part number, part description,
// quantity of item purchased and the price per item.

public class Invoice 
{
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double price;
	
	public Invoice(String partNumber, String partDescription, int quantity, double price) 
	{
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		
		if (quantity > 0)
			this.quantity = quantity;
		
		if (price > 0.0)
			this.price = price;
	}
	
	public void setPartNumber(String partNumber) 
	{
		this.partNumber = partNumber;
	}
	
	public String getPartNumber() 
	{
		return partNumber;
	}
	
	public void setPartDescription(String partDescription) 
	{
		this.partDescription = partDescription;
	}
	
	public String getPartDescription() 
	{
		return partDescription;
	}

	public void setQuantity(int quantity) 
	{
		if (quantity > 0)
			this.quantity = quantity;
	}

	public int getQuantity() 
	{
		return quantity;
	}

	public void setPrice(double price) 
	{
		if (price > 0.0)
			this.price = price;
	}
	
	public double getPrice() 
	{
		return price;
	}
	
	public double getInvoiceAmount()
	{
		double amount;
		amount = quantity * price;
		
		return amount;
	}
	
}
