/*Write a program that:
 *Asks the user to enter 10 integer values and store them in an array.
 *The program should search through the array to find the largest value and print it to the screen (do not sort the array first).
 *If the user enters a real number, the program should prompt the user to enter only integer values and should not continue until the user has entered 10 integer values*/

import java.util.Scanner;

public class Lab1_Question1
{
	public static void main(String args [])
	{
		//declare and initialise variables
		int highest = 0;
		int [] array = new int [10];
		Scanner scan = new Scanner(System.in);

		//asking for user input for array
		System.out.println("Please enter 10 integers:");

		//for loop to scan inputs for array
		for(int i=0;i<array.length;i++)
		{
			//try to scan the next int
			try
			{
				array[i] =scan.nextInt();
			}

			//if it is not an int catch exception and restart loop
			catch (java.util.InputMismatchException e)
			{
				scan.next();
				System.out.println("Only enter integers please!");
				i--;
			}
		}
		//output the array
		System.out.println("The integers you entered are:");

		for(int j=0; j<array.length; j++)
		{
			System.out.print(array[j] + "   ");
		}

		//search through each individual integer to find the largest number
		for(int h=0; h<array.length; h++)
		{
			//if a the integer is larger take the value of the largest integer and so on...
			if(highest < array[h])
			{
				highest = array[h];
			}
		}

		//output the highest integer
		System.out.println("\n The largest integer you entered is: " + highest);
	}
}
