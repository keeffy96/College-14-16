/*Write a Java program that determines if a number is odd or even and prints a message to the screen.
 *For example:
 *The number 111 is odd
 *The number 224 is even
 */

 /*Algorithm:
  *Declare the variables
  *Check value of number
  *Check and see if the number is greater or equal to zero
  *Check and see if the number is lesser than zero
  *
  *Display and print the result
  */
public class lab3_6
{
	public static void main (String args [])
	{
		int num = 55;
		int result = 0;

		result = num%2;

		if (result==0)
		{
			System.out.println("the number" + num + "is even");
		}

		else if (result==1)
		{
			System.out.println("the number " +num + " is odd");
		}


	}
}
