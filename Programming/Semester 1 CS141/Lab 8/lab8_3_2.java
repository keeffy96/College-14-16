/*Write a Java program that will print out the contents of a string in reverse order with each word being put on a line of its own.
 *For example, the string "My name is Aisling" should be printed as follows:
 *gnilsiA si eman yM
 */
import java.util.*;

public class lab8_3_2
{
   public static void main(String args[])
   {
      String original, reverse = "";
      Scanner in = new Scanner(System.in);

		// Declaring reverse String variable
      System.out.println("Enter a string to reverse");
      original = in.nextLine();

      int length = original.length();

	   //Loop for switching between the characters of the String input
      for ( int i = length - 1 ; i >= 0 ; i-- )
         reverse = reverse + original.charAt(i);

      System.out.println("Reverse of entered string is: "+reverse);
   }
}