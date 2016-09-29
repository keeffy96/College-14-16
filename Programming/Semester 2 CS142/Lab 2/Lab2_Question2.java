import java.util.Scanner;

public class Lab2_Question2
{
   public static void main(String args[])
   {
      //String variables to handle vowel storage
      String store2 = "";
      String vowel = "aeiou";
      String vowels [] = new String [10];

      //int variables to handle vowel storage and char counting
      int count = 0;
      int j = 0;
      int store [] = new int [10];

      //loop to look through the input string
      for(int i=0;i<args[0].length();i++)
      {
         //set store2 to the current character in the input string
	 store2=""+(args[0].charAt(i));

	 //if the current character is a vowel run contents
         if(vowel.contains(store2))
         {
	    //store the vowel in a string array and the index of the vowel in an int array, update j
	    vowels[j]=store2;
	    store[j]=i;
	    j++;
         }

	 //if it isn't a vowel it is counted as a character
	 else
	 {
	    count++;
	 }
      }

      System.out.println("There is " +j +" vowels in this string.");

      //outputs each stored vowel and its respective index int
      for(int i=0;i<j;i++)
      {
         System.out.println("	The index of " +vowels[i] +" is " +store[i] +".");
      }

      System.out.println("There is " +count +" other characters in this string.");
   }
}