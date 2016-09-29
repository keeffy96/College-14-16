/*Write a Java program that asks the user to input two numbers.
 *The program should print the result of the first number to the power of the second number.
 *For example, if the use enters 2 as the first number and 4 as the second the program should print 16 as the answer (2^4= 16).
 */

 import java.util.Scanner;
  public class Lab9_2
 {
 	public static void main(String args[])
 	{
 		double num1 = 0.0;
 		double num2 = 0.0;

 		//Create scanner object
 		Scanner a = new Scanner(System.in);

 		//Ask the user to enter a number
 		System.out.println("Enter a number: ");
 		num1 = a.nextDouble();

 		//Ask the user to enter another number
 		System.out.println("Enter another number: ");
 		num2 = a.nextDouble();

		//Tell them what they entered
 		System.out.println("You Entered : " + num1 + " and " + num2);

 		System.out.println(num1 + " to the power of "  + num2 + "(" + num1 + "^" + num2 + ") = " + Math.pow(num1,num2));

 	}
 }