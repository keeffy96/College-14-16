/*Write a Java program that uses a while - loop to check all numbers between 0 and 999 inclusive to see if they are a multiple of 4.
 *If they are a message should be printed to the screen to show this, for example:
 *16 is a multiple of 4
 *20 is a multiple of 4...
 */
 public class lab5_2
{
	public static void main (String args[])
	{
	int count = 0;
	while(count <= 999)
	{
		if (count % 4 ==0)
		{
		System.out.println(count + "is a multiple of 4 ");
		count++;
		}
		else
		{
			count++;
		}



	}



	}
}

