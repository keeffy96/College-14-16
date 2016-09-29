/*Write a Java program that will print out the contents of a string in reverse order with each word being put on a line of its own.
 *For example, the string "My name is Aisling" should be printed as follows:
 *gnilsiA si eman yM
 */
  public class lab8_3
 {
 	public static void main (String args[])
 	{
 		String input = "My name is Conor";

 		int b = input.length();
 		String reverse = ""; // Declaring reverse String variable
 		while(b!=0)

 		{
        //Loop for switching between the characters of the String input
        reverse += (input.charAt(b-1));
        b--;
        }

        System.out.println(reverse);
 	}
 }

