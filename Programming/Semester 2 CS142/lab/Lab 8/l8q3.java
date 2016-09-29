import java.util.Scanner;

public class l8q3
{
	public static void main(String args [])
	{
		Scanner scan = new Scanner(System.in);
		Fibonacci(scan.nextInt());
	}

	public static void Fibonacci(int n)
	{
		if(n<=0)
		{
			System.out.println("Setting size to 1.");
			n=1;
		}

		int fib [] = new int [n];
		fib [0] = 1;

		if(n>1)
		{
			fib [1] = 1;
		}


		for(int pos=2;pos<n;pos++)
		{
			fib [pos] = (fib [pos-1] + fib [pos-2]);
		}

		for(int i=0;i<n;i++)
		{
			System.out.print(fib [i] +", ");
		}
	}

	public static void Fib(int n)
	{
		if(n<=0)
		{
			n=1;
		}

	}
}