 /*Write a Java program that asks the user to enter a String representing their name.
  *The program should read in the string and print it one character at a time to the screen.
  */

  import java.util.Scanner;

  public class Lab9_1
 {
 	public static void main(String args[])
 	{
 		//Create scanner object
 		Scanner a = new Scanner(System.in);

 		//Ask the user to enter their name
 		System.out.println("Enter your name: ");
 		String name = a.nextLine();

		//Tell them what they entered
 		System.out.println("You Entered: " + name);

 		for(int i = 0; i <name.length(); i++)
 		{
 			System.out.println(name.charAt(i));

 		}

 	}
 }

