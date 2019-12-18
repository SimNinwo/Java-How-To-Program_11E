package exercise4_22;

public class Tabulate {

	public static void main(String args[])
	{
		int count = 0;
		System.out.println("N\t10*N\t100*N\t1000*N");
		
		while(count != 5)
		{
			count++;
			System.out.printf("%d\t%d\t%d\t%d\t%n",
					count, count*10, count*100, count*1000);
		}
	}
}
