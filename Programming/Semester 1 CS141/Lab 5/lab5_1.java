/*Write a Java program that uses a while - loop to print the numbers from 100 to 999 to the screen on the same line, separated by three spaces.
 *Note: if you use System.out.print() it will not go on to a new line once it has printed to the screen.
 * You should use this instead of System.out.println() for this question.
 */
 public class lab5_1
{
	public static void main (String args[])
	{
	int count = 100;
		while(count <=999)
		{
			System.out.print(count+"   ");
			count = count+1;
		}
	}
}

