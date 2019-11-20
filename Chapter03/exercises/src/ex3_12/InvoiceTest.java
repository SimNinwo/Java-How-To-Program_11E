package ex3_12;
// Program to test the capabilities of the class Invoice
import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		
		Invoice log1 = new Invoice("w23ewty", "Clutch", 2, 56.78);
		
		Scanner input = new Scanner(System.in);
		
		String partNum;
		String partDes;
		int quantity;
		double pricePerItem;
		
		System.out.printf("PartNumber\tPartDescription\tQuantity\tPrice-per-item($)\tTotal%n");
		
		System.out.printf("%-14s\t%-14s\t%-14d\t%-20.2f\t%.2f%n", log1.getPartNumber(), log1.getPartDescription(),
				log1.getQuantity(), log1.getPrice(), log1.getInvoiceAmount());
		
		System.out.println("\nNEW INVOICE\n");
		System.out.print("Enter PartNumber: ");
		partNum = input.next();
		System.out.print("Enter PartDescription: ");
		partDes = input.next();
		input.nextLine();
		System.out.print("Enter quantity of item sold: ");
		quantity =input.nextInt();
		System.out.print("Enter Price per Item: ");
		pricePerItem = input.nextDouble();
		
		log1.setPartDescription(partDes);
		log1.setPartNumber(partNum);
		log1.setQuantity(quantity);
		log1.setPrice(pricePerItem);

		System.out.printf("%nPartNumber\tPartDescription\tQuantity\tPrice-per-item($)\tTotal%n");
		
		System.out.printf("%-14s\t%-14s\t%-14d\t%-20.2f\t%.2f%n", log1.getPartNumber(), log1.getPartDescription(),
				log1.getQuantity(), log1.getPrice(), log1.getInvoiceAmount());
		
	
		input.close();
	}

}
