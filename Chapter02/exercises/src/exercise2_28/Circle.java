package exercise2_28;
// Program calculates the diameter, circumference and area of a circle

import java.util.Scanner;

public class Circle 
{

	public static void main(String[] args) 
	{
		// create Scanner object
		Scanner input = new Scanner(System.in);
		
		int radius; // radius to read
		
		System.out.print("Enter radius of circle(integer): "); // prompt
		radius = input.nextInt();
		
		// Calculates and displays diameter of circle
		System.out.printf("Diameter of cirlce = %d%n", 2 * radius);

		// Calculates and displays circumference of circle
		System.out.printf("Circumference of circle = %.2f%n", 
				2 * Math.PI * radius);
		
		// Calculates and displays area of circle
		System.out.printf("Area of circle = %.2f%n", 
				Math.PI * Math.pow(radius, 2));
		
		input.close();
	}

}
