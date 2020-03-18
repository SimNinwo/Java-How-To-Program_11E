package exercise2_33;
// Program that collects weight and height then displays the user's body
// mass index.

import java.util.Scanner; // import class Scanner


public class BodyMassIndex 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int weight; // weight value to read
		int height; // height value to read
		int bmi; // bmi value to read
		
		System.out.print("Enter height(in meters): ");
		height = input.nextInt();
		
		System.out.print("Enter weight(in Kilograms): ");
		weight = input.nextInt();
		
		bmi = weight / (height * height);
		
		System.out.println("\n----------------------\n");
		
		System.out.printf("Your Body Mass Index(BMI) is %d%n", bmi);
		
		input.close();
	}

}
