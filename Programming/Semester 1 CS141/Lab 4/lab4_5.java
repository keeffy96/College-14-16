/*Write a Java program that prints out all numbers from 50 to 150 in steps of 3 (50, 53, 56,...)using a while loop. */
 public class lab4_5
{
	public static void main (String args[])
	{
	int count = 50;
	while(count <= 150)
	{
		System.out.println("Count from 50 to 150 is: " + count);
			count = count + 3;
	}
	}
}