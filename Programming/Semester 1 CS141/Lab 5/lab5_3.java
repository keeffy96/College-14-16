/*Write a Java program that uses a while loop to sum together all the odd numbers from 0 to 50 inclusive.
 *The output should be: The sum of the odd numbers from 0 to 50 inclusive is: <your answer here>
 */
 public class lab5_3
{
	public static void main (String args[])
	{
	int count = 0;
	int result = 0;

	while (count <=50)
		{
		if ((count)%2 !=0)
		{
		result = result+count;
		count++;
		}

		else
		{
		count++;
		}

		}
		System.out.println("The sum of all the odd numbers from 0 to 50 is: " + result);
	}
}


