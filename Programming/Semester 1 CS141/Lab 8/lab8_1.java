/*Write a Java program that creates two Strings of the same length.
 *Your program should check to see if the Strings are equal length and print an appropriate message to the screen.
 *Your program should, if the strings are equal length, print out alternative letters from each string.
 *For example, it should print the first letter from the first string, the second letter from the
second string, the third letter from the first string, the fourth letter from the second string, and so on.
For example, if the first string is Hello World and the second string is World Hello the output should be: Hollo Werld
 */
 public class lab8_1
{
	public static void main(String args[])
	{
		String s1 = new String ("Hello World");
		String s2 = new String ("World Hello");
		int lens1 = s1.length();
		int lens2 = s2.length();

		if(lens1 == lens2)
		{
			//Printing out the statement if the strings are the same length
			System.out.println("The strings are the same length");
			for(int i = 0; i< lens1; i++)
			{
				if(i%2==0)
				{
						System.out.print(s1.charAt(i));
				}
				else
				{
				System.out.print(s2.charAt(i));
				}
			}
		}
	}

}