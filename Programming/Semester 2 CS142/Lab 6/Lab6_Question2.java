/* Write a static method that accepts two Strings as parameters.
 *The method should determine if the Strings are anagrams.
 *Two Strings are anagrams if they both contain exactly the same letters.
 */

public class Lab6_Question2
{
    public static void main(String args[])
    {
    	//Give two strings
    	String word = "astronomer ";
       	String anagram = "moon starer";

		//if statement will run if word is an anagram
       	if (detectAnagram(word, anagram))
       	{
            System.out.println("'" + anagram + "'" + " is an anagram of " + "'" + word + "'");
        }
        //else statement will run if word is not an anagram
        else
        {
            System.out.println("Strings are not anagrams.");
        }
    }

        public static boolean detectAnagram(String word, String anagram)
    {
    	//// If string lengths are not same, the strings are not anagrams.
    	if (word.length() != anagram.length())
    	{
            return false;
        }

        char[] chars = word.toLowerCase().toCharArray();
        char[] arrayAnagram = anagram.toLowerCase().toCharArray();

		//loop through each character in word
		for (char i: chars)
		{
			int index = anagram.indexOf(i);
        	//if it exists in `anagram`, remove it using a combination of `substring` calls, else return false
        	//(-1) removes it so that it is not checked again in case there are repetitions
        	if (index != -1)
        	{
          		anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
        	}
        	else
        	{
        		//If the character is not in the anagram then it means it is not an anagram, and you return false
            	return false;
        	}
		}

		return true;
    }

}