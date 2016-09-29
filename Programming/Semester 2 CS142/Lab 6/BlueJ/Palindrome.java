
/**
 * Write a description of class Palindrome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 import java.util.Scanner;
 
public class Palindrome
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