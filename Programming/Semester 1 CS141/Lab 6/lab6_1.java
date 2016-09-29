//Write a Java program that uses a for - loop to print the numbers from 100 to 999 to the screen in order, separated by three spaces.

public class lab6_1
{
	public static void main (String args[])
	{
			for(int count = 100; count <=999; count++)
		{
			System.out.print(count+"   ");
			count = count+1;
		}
	}
}
