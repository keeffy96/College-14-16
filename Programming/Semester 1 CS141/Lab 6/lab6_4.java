/*Write a Java program that determines and prints the digits that make up every three - digit number.
 *For example, for the digit 123 the program should print:
 *The first digit in the number 123 is 1.
 *The second digit in the number 123 is 2.
 *The third digit in the number 123 is
******************************************
N.B. Your program should output the digits for every three - digit number with a row of stars between each group of output statements.
 */

 public class lab6_4
{
	public static void main (String args[])
{
		int rightdigit = 0;
		int centerdigit =0;
		int leftdigit=0;

		while ( leftdigit < 10 )
		{
			centerdigit = 0;
			while (centerdigit<10)

			{
				rightdigit=0;
				while(rightdigit<10)
			  	{
					System.out.println("The first digit in the number " + leftdigit + centerdigit + rightdigit + " is " + leftdigit + '\n' + "The second digit in the number " + leftdigit + centerdigit + rightdigit + " is " + centerdigit + '\n' + "The third digit in the number " + leftdigit + centerdigit + rightdigit + " is " + rightdigit + '\n' + "********************************* ");
					rightdigit++;
			  	}
				centerdigit++;
			 }
			 leftdigit++;
		}


	 }
}