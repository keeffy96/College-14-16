/*Write a Java program that will print out the contents of a string in reverse order of the words in the string.
 *For example, the string My name is Aisling should be printed as follows:
 *Aisling
 *is
 *name
 *My
 */

 public class lab8_4
 {
 	public static void main (String args[])
 	{
 	String s = "My name is Conor";
	String[] split = s.split(" ");
	String result = "";

	for (int i = split.length - 1; i >= 0; i--)
		{
  			result += (split[i] + " ");
		}
			System.out.println(result.trim());
 	}
 }