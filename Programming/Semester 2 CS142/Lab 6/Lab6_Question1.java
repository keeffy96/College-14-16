/*Write a static method that determines if a String is a palindrome.
 *The method should take a single String as a parameter and return a value of true or false.
 *A String is a palindrome if it is lexicographically the same spelt in reverse.
 *For example, Navan and Hannah are palindromes (ignore the case).
 *Call the method from main and print an appropriate message to state if the String is a palindrome or not.
 */
 import java.util.Scanner;

public class Lab6_Question1
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string: ");

        //call the method and get it to check the users input
        Palindrome(scan.nextLine());
    }
    public static void Palindrome(String word)
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
                System.out.println("Entered string is not a palindrome");
            }
        }

        //if it is a palindrome
        if(found==true)
        {
            System.out.println("Entered string is a palindrome");
        }
    }
}