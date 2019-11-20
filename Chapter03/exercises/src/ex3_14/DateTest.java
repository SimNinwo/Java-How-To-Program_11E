package ex3_14;

import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		Date clock = new Date(12, 31, 2109);
		
		int month;
		int day;
		int year;
		
		System.out.println("Date on clock is: " + clock.displayDate());
		
		System.out.println("\nSet clock to today's date\n");
		
		System.out.print("Enter month: ");
		month = input.nextInt();
		System.out.print("Enter day: ");
		day = input.nextInt();
		System.out.print("Enter year: ");
		year = input.nextInt();
		
		clock.setMonth(month);
		clock.setDay(day);
		clock.setYear(year);
		
		System.out.printf("%nNEW DATE%n%s%n", clock.displayDate());
		
		input.close();
	}

}
