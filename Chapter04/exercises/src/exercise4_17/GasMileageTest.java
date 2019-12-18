package exercise4_17;
import java.util.Scanner;

public class GasMileageTest 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		GasMileage volvo = new GasMileage();
		
		int miles;
		int gallons;
		int noOfTrips = 0;
		char newTrip = 'y';
		
		while (newTrip != 'n')
		{
			System.out.print("Enter miles travelled for trip: ");
			miles = input.nextInt();
			System.out.print("Enter gallons used for trip: 	");
			gallons = input.nextInt();
			
			System.out.println();
			
			volvo.mPG(miles, gallons);
			noOfTrips++;
			
			System.out.print("Enter new Trip? (y/n): ");
			newTrip = input.next().charAt(0);
			
			System.out.println();
		}
		
		System.out.printf("%nTRAVEL INFORMATION%n");
		System.out.print("============================\n");
		System.out.printf("Total Trips\tTotalMilePerGallon%n");
		System.out.printf("%10d\t%-30.2f%n", noOfTrips, volvo.getTotalMPG());

		input.close();
	}

}
