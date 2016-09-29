//Write a Java program that uses a for - loop to print all the even numbers between 100 and 1000 (one per line) to the screen in descending order
//you must use an if statement

public class lab6_2
{
	public static void main (String args[])
	{

		for(int count = 1000; count >=100;)
		{
			if (count % 2==0)
			{
			System.out.println(count);
			count--;
			}
		else
		{
			count --;
		}
	}
}
}
