/*Write a Java program that asks the user to enter a string as input.
 *The program should check if the inputted word is a palindrome or not – a palindrome is a string that reads the same forward as reverse.
 *For example, navan a navan is a palindrome whereas cavan a navan is not.
 *Your program should allow spaces in the text.
 */
import java.util.Scanner;

class Palindrome
{
   public static void main(String args[])
   {

      String input, reverse = "";
      //Create a scanner object
      Scanner in = new Scanner(System.in);

	//Ask the user to enter line of text
      System.out.println("Enter a string to check if it is a palindrome: ");
      input = in.nextLine();

      int length = input.length();

	//Create a loop to check if the line of text is a palindrome
      for ( int i = length - 1; i >= 0; i--)
         reverse = reverse + input.charAt(i);

      if (input.equals(reverse))
         System.out.println("Entered string is a palindrome.");
      else
         System.out.println("Entered string is not a palindrome.");

   }
}