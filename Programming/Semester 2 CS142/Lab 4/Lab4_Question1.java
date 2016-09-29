/*Write a Java method called detectDuplicateLetter() that takes in a String as its only parameter.
 *Your method should print the message “Duplicate letter found” only if any of the letters in the String are repeated.
 *Otherwise your method should not print any message.
 */
 import java.util.Scanner;

public class Lab4_Question1
{
	public static void main (String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string: ");

		//call the method and get it to check the users input
		detectDuplicateLetter(scan.nextLine());
	}
	public static void detectDuplicateLetter(String word)
	{
		//i represents current letter to be checked
		for(int i=0;i<word.length()-1;i++)
		{
			//j runs through every other letter except the ones already checked and compares them to i
			for(int j=i+1;j<word.length();j++)
			{
				//comparing the letter at i with the other letters
				if(word.charAt(i)==word.charAt(j))
				{
					System.out.println("Duplicate letter found.");
					j=word.length();//ends inner loop
					i=word.length();//ends outer loop
				}
			}
		}
	}
}