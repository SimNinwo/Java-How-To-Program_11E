package ex3_16;


public class HeartRatesTest 
{

	public static void main(String[] args) 
	{
	
		HeartRates coach = new HeartRates("Patrick", "Uzo", 23, 12, 1998);
		
		System.out.println("\nUSER INFORMATION\n");
		System.out.printf("User Name: %s %s%nUser Date of Birth: %s%nUser Age: %d%n",
				coach.getFirstName(), coach.getLastName(), coach.dateOfBirth(),
				coach.age());
	
		System.out.println("\nHEART RATE INFORMATION\n");
		System.out.printf("Max Heart Rate: %d bpm%nTarget Heart Rate: %s%n",
				coach.maxHeartRate(), coach.targetHeartRate());
	}

}
