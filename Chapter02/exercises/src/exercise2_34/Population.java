package exercise2_34;

public class Population {
	
	public static void main(String[] args) {
			
		int pop = 7700; // initial population reading in millions
		double growth = 0.0114; // growth rate in percent divided by 100
		double e = 2.71828; // constant logarithm
			
		double pop1; // new population in year 1
		double pop2; // new population in year 2
		double pop3; // new population in year 3
		double pop4; // new population in year 4
		double pop5; // new population in year 5
			
		pop1 = pop * Math.pow(e, (growth*1)); // calculates for year 1 		
		pop2 = pop * Math.pow(e, (growth*2)); // calculates for year 2
		pop3 = pop * Math.pow(e, (growth*3)); // calculates for year 3
		pop4 = pop * Math.pow(e, (growth*4)); // calculates for year 4
		pop5 = pop * Math.pow(e, (growth*5)); // calculates for year 5
			
		System.out.println("World Population Growth Estimates");
		System.out.println("===============================================\n");
		
		System.out.printf("Year\tPopulation(millions)%n");
		System.out.printf("%d\t%d%n", 0, pop);
		System.out.printf("%d\t%.2f%n", 1, pop1);
		System.out.printf("%d\t%.2f%n",	2, pop2);
		System.out.printf("%d\t%.2f%n",	3, pop3);
		System.out.printf("%d\t%.2f%n",	4, pop4);
		System.out.printf("%d\t%.2f%n",	5, pop5);
		
		System.out.println("\n=============================================\n");			
	}
}
