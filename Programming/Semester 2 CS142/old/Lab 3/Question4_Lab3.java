/*Write a static method called determineSize that accepts two doubles.
*The method should print a message to the screen that states which number is the smallest,
*which is the biggest or that they are the same number.
*Test the method by calling it from the main method.
*/

import java.util.Scanner;
public class Question4_Lab3
{
	public static void main (String args[])
	{
		//Declare a scanner
		Scanner scan = new Scanner(System.in);
		//Ask the user to enter a double
		System.out.println("Please enter two doubles");
		determineSize(scan.nextDouble(), scan.nextDouble());
	}

	public static void determineSize(double num1, double num2)
	{
		if(num1<num2)
		{
			System.out.println("The smallest number is " + num1 + " and the largest number is " + num2);
		}
		else if(num1>num2)
		{
			System.out.println("The smallest number is " + num1 + " and the largest number is " + num2);
		}
		else if(num1==num2)
		{
			System.out.println(num1 + " is the same " + num2);
		}
	}
}