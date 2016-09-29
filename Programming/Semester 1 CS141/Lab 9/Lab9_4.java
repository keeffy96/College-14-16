 /*Write a Java program that will create an array of integers of size 10.
  *The program should randomly fill the array with integer numbers up to 1000.
  *The program should then print the contents of the array to the screen.
  *It should also calculate the average of the numbers in the array and print this number to the screen.
  */

import java.util.Random;

public class Lab9_4
{
	public static void main (String args[])
	{
		int[] num = new int[10];
		Random number = new Random();

		System.out.println("Ten Random intergers out of 1000: ");

		for (int i=0; i < 10; i++)
		{
		//Declaring the limit of num to 1000
			num[i]=number.nextInt(1000);

		//Outputting the values of num
			System.out.println(num[i]);
		}

		//Get the sum of the elements in the array and divide by the size of the array(10)
		int average = 0;

		for(int j = 0; j < num.length; j++)
		{
			average = average + num[j]/10;
		}
		System.out.println("The average of the elements in the array is: " + average);
	}
}