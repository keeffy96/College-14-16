/*Write a Java program that contains a static method called factorial.
*The method should accept a single integer value as its parameter and should print the factorial of this number to the screen.
*In the main method, create a loop that goes from 1 to 10 and call the factorial method from inside the body of your loop.
*When the code executes the factorial of all numbers from 1 to 10 should be printed to the screen.
*/

public class Question3_Lab3
{
	public static void main (String args[])
	{
		//Generate integer values from 1-10
		for(int i=1; i<=10; i++)
		{
			factorial(i);
		}
	}

	public static void factorial(int num1)
	{
		//Creates a variable to store final output
		int num2 = 1;

		//Program will run 1-10 times
		for(int j=1; j<=num1; j++)
		{
			num2= num2*j;
		}

		//Print values 1-10 and get the factorial
		System.out.println("The factorial of " + num1 + " is " + num2);
	}

}