//Write a Java program to play the ‘Guess the number game’.
 /*The program should:
 *Generate 10 random numbers between 1 and 50.
 *Sort the array so that it is in ascending order.
 *Print the contents of the array to the screen and ask the user to choose a number from the array.
 *The computer will try to guess this number using a binary search.
 *The user should reply ‘higher’, ‘lower’ or ‘correct’ once the program has made a guess.
 *The game should continue until the program has guessed the number.
 */

import java.util.Random;
import java.util.Scanner;

public class Lab1_Question4
{
	public static void main (String args [])
	{
		//integers to store array and perform swaps
		int store = 0;
		int [] array = new int [10];

		//integers to handle number guessing and boolen to detect if correct number is found
		int high = array.length-1, low=0, middle=0;
		boolean correct = false;

		//strings to detect inputs as answers
		String answer = " ";
		String answer2 = " ";
		String play = " ";

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		//for loop to generate array of ints
		for(int i=0;i<array.length;i++)
		{
			array[i]=ran.nextInt(50);
		}

		//for loop to arrange array by size
		for(int pass=0, swap=1;pass<array.length;pass++)
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
			for(int n=0;n<array.length-(pass+1);n++)
			{
				//if higher number is to the left of lower number swap them
				if(array[n]>array[n+1])
				{
					//swap the two ints in the array
					store=array[n];
					array[n]=array[n+1];
					array[n+1]=store;
					//count the swap
					swap++;
				}
			}
		}

		//ask the user to choose a number from the array and output the array
		System.out.println("Please choose a number from the array:");
		for(int j=0;j<array.length;j++)
		{
			System.out.print(array[j] +" , ");
		}
		System.out.print("\n");

		//ask the user to start the game once they have choosen a number
		while(play.length()<1||play.charAt(0)!= 'p')
		{
			System.out.println("Please enter 'p' to play.");
			play = scan.nextLine();
		}

		//runs the game while the answer hasn't been found and there are still numbers to choose
		while(low<=high&&!correct)
		{
			//calculates the middle number and asks if it is the choosen number
			middle = (high+low)/2;
			System.out.println("Is your number " +array[middle] +"? Yes(y) or No(n)?");

			//loop runs until either y or n has been inputted
			do
			{
				//checks for the answer
				answer = scan.nextLine();

				if(answer.length()>0)
				{
					//if the answer is yes
					if(answer.charAt(0)=='y')
					{
						//outputs message and sets correct to true to end the game
						System.out.println("Thankyou for playing!");
						correct = true;
					}

					//if the answer is no
					else if(answer.charAt(0)=='n')
					{
						//asks if number is higher or lower then checks for answer
						System.out.println("Is your number Higher(h) or Lower(l) than the number " +array[middle] +"?");

						//loop runs until either h or l has been inputted
						do
						{
							answer2 = scan.nextLine();

							if(answer2.length()>0)
							{
								//if number is higher
								if(answer2.charAt(0)=='h')
								{
									//halfs the numbers left to search to numbers lower than first guess
									low=middle+1;
								}
								//if number is lower
								else if(answer2.charAt(0)=='l')
								{
									//halfs the numbers left to search to numbers higher than first guess
									high=middle-1;
								}
								//if neither higher or lower is inputted
								else
								{
									//asks the user to only input h or l and clears the input
									System.out.println("Please answer Higher(h) or Lower(l).");
								}
							}
							else
							{
								//asks the user to only input h or l and clears the input
								System.out.println("Please answer Higher(h) or Lower(l).");
							}
						}while(answer2.length()<1||answer2.charAt(0)!='h'&&answer2.charAt(0)!='l');

					}
					//if neither yes or no was selected
					else
					{
						//asks the user to only input y or n and clears the input
						System.out.println("Please answer Yes(y) or No(n).");
					}
				}
				else
				{
					//asks the user to only input y or n and clears the input
					System.out.println("Please answer Yes(y) or No(n).");
				}
			}while(answer.length()<1||answer.charAt(0)!='y'&&answer.charAt(0)!='n');
		}

		//if the number has not been found but all possible numbers has been guessed
		if(correct!=true)
		{
			System.out.println("Sorry I could not guess your number, I think you lied!");
		}
	}
}