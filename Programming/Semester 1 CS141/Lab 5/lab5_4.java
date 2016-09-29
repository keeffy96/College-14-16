/*Write a Java program that uses a while - loop to check for all numbers between 200 and 500 that are:
 *(a): a multiple of 5 and 7
 *(b): a multiple of 5 or 7
 *For example, 35 is a multiple of 5 and 7, 25 is a multiple of 5 or 7
 */
 public class lab5_4
{
	public static void main (String args[])
	{
		int count = 200;
		while (count <= 500)
		{
			if ((count%5) == 0 && (count%7) ==0)
			{
			System.out.println(count + " is a multiple of 5 and 7");
				count ++;
			}
			else if ((count%5) ==0 || (count%7) ==0)
			{
			System.out.println(count + " is a multiple of 5 and 7");
			count ++;
			}

			else
			{
			count ++;
			}
		}
	}
}

