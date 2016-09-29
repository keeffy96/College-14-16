/*Write a Java program that uses a for - loop to compute:
 *The sum of all even numbers between 2 and 100 (inclusive)
 *The sum of all squares between 1 and 100 (inclusive)the square of 4 is 16 etc.
 *You can do this with two loops BUT as a challenge can you do it with one loop
 */
 public class lab6_3
{
	public static void main (String args[])
	{
		int sumsquares = 0;
		int sumeven = 0;
		for(int count = 1; count <=100;)
		{

			if (count % 2 ==0)
			{
			sumsquares = sumsquares + (count * count);
			sumeven = sumeven + count;
			count ++;
			}

			else
			{
			sumsquares = sumsquares + (count * count);
			count ++;
			}

		}
		System.out.println(sumeven);
		System.out.println(sumsquares);

	}

}