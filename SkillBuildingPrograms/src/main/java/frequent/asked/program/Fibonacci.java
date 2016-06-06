package frequent.asked.program;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try
		{
			int num = sc.nextInt();
			printFibo(num);
		}catch(Exception e)
		{
			System.err.println("Enter number only");
		}
		sc.close();
	}
	private static void printFibo(int num)
	{
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		System.out.print(""+n1+" "+n2);
		for(; ;)
		{
			n3=n1+n2;
			if(n3 > num)
				break;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
		}
	}
}
