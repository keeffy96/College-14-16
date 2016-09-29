/*Write a Java program that uses a while loop to print out the digits of a number of any size on a row of their own.
 */
 public class lab5_5
{
	public static void main (String args[])
	{
		int num1=12345678;
		while (num1 !=0)

		{
			System.out.println(num1%10);
				num1=num1/10;
		}
	}
}