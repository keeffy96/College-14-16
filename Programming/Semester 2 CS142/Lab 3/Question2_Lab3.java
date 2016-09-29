/*Write a Java program that contains a static method called oddEven that accepts a single integer as its parameter.
*It should write a message (“Odd” or “Even”) to the screen, depending on the value of the parameter.
*Test the method by calling it from your main method.
*/
import java.util.Scanner;
public class Question2_Lab3
{
	public static void main (String args[])
	{
		//Declare a scanner
		Scanner scan = new Scanner (System.in);
		//Ask the user to enter an input
		System.out.println("Please enter an integer");
		oddEven(scan.nextInt());
	}

	public static void oddEven(int num)
	{
			//Says if the integer is even
			if(num%2==0)
		{
			System.out.println("The number is even");
		}

			else if(num%2==1)
		{
			//Says if the integer is odd
			System.out.println("The number is odd");
		}
	}
}