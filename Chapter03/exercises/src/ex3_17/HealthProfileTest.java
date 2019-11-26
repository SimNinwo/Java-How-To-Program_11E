package ex3_17;

public class HealthProfileTest 
{

	public static void main(String[] args) 
	{
		HealthProfile user = new HealthProfile("Patrick", "Uzo",
				"Male", 24, 12, 1999, 90, 188);
		
		System.out.println("\nUSER INFORMATION");
		System.out.print("===============================\n");
		userInfo(user);
		
	}

	public static void userInfo(HealthProfile userDisplay)
	{
		System.out.printf("Name: %s %s%nDate of Birth: %s%nGender: %s%nAge: %d%n",
				userDisplay.getFirstName(), userDisplay.getLastName(), userDisplay.dateOfBirth(),
				userDisplay.getGender(), userDisplay.age());
	
		System.out.println("\nHEALTH PROFILE");
		System.out.print("===============================\n");
		System.out.printf("Height: %.2f inches%nWeight: %.2f pounds%nBody Mass Index(BMI): %.2f%n",
				userDisplay.getHeight(), userDisplay.getWeight(), userDisplay.getBMI());
		System.out.printf("Max Heart Rate: %d bpm%nTarget Heart Rate Range: %s bpm%n",
				userDisplay.maxHeartRate(), userDisplay.targetHeartRate());

	}
}
