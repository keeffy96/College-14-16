/*Write a Java program that creates a string containing three words.
 *If the letter ‘a’ occurs more than three times in the string these letters should be replaced by *’s, otherwise any occurrence
of the letter ‘a’ should be replaced by a %.
 */

 public class lab8_2
{
	public static void main(String args[])
	{
		String s1 = new String ("I am algebra!");
		int numofa = s1.indexOf('a');

		if (numofa < 3)
		{
			String news1 = s1.replace('a','*');
			System.out.print(news1);
		}

		else if(numofa > 3)
		{
			String news1 = s1.replace('a','%');
			System.out.print(news1);
		}
	}
}