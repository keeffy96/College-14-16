/*Write a Java program that will ask the user to enter the size of an array to create.
 *The program should create an array of doubles of the inputted size.
 *The user should be asked to input values for the array.
 *Once completed the program should print the contents to the screen.
 *The program should calculate the largest number in the array and also the smallest
 *number in the array and print these to the screen with an appropriate message.
 */

import java.util.Scanner;

public class Lab9_5
{
	public static void main (String args[])
	{
		//Create scanner object
 		Scanner a = new Scanner(System.in);


 		System.out.println("Enter the size of an array to create: ");
 		double num[] = new double [a.nextInt()];

 		//Ask the user to enter the size of an array to create
 		System.out.println("The size of the array is : " + num.length);
 		System.out.println("Enter " + num.length + "values for the array");


 		for(int i = 0; i <= num.length; i++)

 	}
 }