import java.util.Scanner;

public class l4q1
{
	public static void main (String args[])
	{
		Scanner scan = new Scanner(System.in);

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
					System.out.println("Duplicate letter found");
					j=word.length();//ends inner loop
					i=word.length();//ends outer loop
				}
			}
		}
	}
}