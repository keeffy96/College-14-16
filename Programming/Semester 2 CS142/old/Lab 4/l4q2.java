import java.util.Scanner;

public class l4q2
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		//call the method and get it to check the users input
		detectPalindrome(scan.nextLine());
	}
	public static void detectPalindrome(String word)
	{
		boolean found = true;
		//i represents first half of letters, j represents end half of letters
		for(int i=0,j=word.length()-1;i<j;i++,j--)
		{
			//if i is not equal to j it is not a palindrome
			if(word.charAt(i)!=word.charAt(j))
			{
				i=j;//end the loop
				found = false;//it's not a palindrome
			}
		}

		//if it is a palindrome
		if(found==true)
		{
			System.out.println("Palindrome identified");
		}
	}
}