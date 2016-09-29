/*Write a program that:
 *Given an array of 20 floating point numbers sorts the array using Bubble Sort
 *Ensure that you print the contents of the array to the screen after each pass so you can clearly see what is happening in the algorithm.
 *Print out how many swaps, comparisons and passes are made.
*/

import java.util.Scanner;

public class Lab1_Question2
{
	public static void main (String args [])
	{
		//integers to store loop runs
		int swap2 = 0;
		int pass2 = 0;
		int comparison= 0;

		//floats for array and swaps
		float store = 0f;
		float [] array = new float [20];

		Scanner scan = new Scanner(System.in);

		//asking for user input for array
		System.out.println("Please enter 20 floating points:");

		//for loop to generate array of floats
		for(int i=0;i<array.length;i++)
		{
			//Add the value of the float to the array
			array[i]=scan.nextFloat();
		}

		//for loop to arrange array by size
		for(int pass=0, swap=1; pass<array.length; pass++)
		{
			//if no swaps last loop, array is organised so end loop
			if(swap==0)
			{
				//ends loop and increases pass value so it won't run again
				pass=array.length;
				continue;
			}

			//reset swaps for this loop
			swap = 0;

			//check contents of array to arrange by size
			for(int n=0; n<array.length-(pass+1); n++)
			{
				//count how many comparisons have been made
				comparison++;

				//if higher number is to the left of lower number swap them
				if(array[n]>array[n+1])
				{
					//swap the two floats in the array
					store=array[n];
					array[n]=array[n+1];
					array[n+1]=store;
					//count the swap
					swap++;
				}
			}
			//count the total swaps of all combined loops
			swap2=swap2+swap;
			//count the total passes
			pass2++;

			//output the array after each pass
			System.out.println("\n\nArray: ");
			for(int j=0; j<array.length; j++)
			{
				System.out.print(array[j] +" , ");
			}
		}

		//output the final array
		System.out.println("\n\n*The Final Array arranged by size is:");
			for(int h=0;h<array.length;h++)
			{
				System.out.print(array[h] +" , ");
			}
		//output the total amount of passes, swaps and comparisons
		System.out.println("\n\n*There was a total of " + pass2 + " passes, " + swap2 +" swaps and " +comparison +" comparisons completed when arranging this array.");
	}
}