import java.util.*;
 
public class Huffman
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String in = scan.nextLine();
        int freq [] = new int [256]; //256 ASCII characters
        int count=0,high=0,pos=0;
 
        for(int i=0;i<in.length();i++)//loop the length of the string
        {
            freq[(int)in.charAt(i)]++;//increment through the ASCII array
            if(freq[(int)in.charAt(i)]==1)//if the character in the string has at least one occurrence increment count
            {
                count++;
            }
        }
 
 
        while(count!=0)
        {
            high=0;
            pos=0; 
            for(int i=0;i<freq.length;i++) //loop through the length of the array
            {
                if(freq[i]>high)
                {
                    high=freq[i];
                    pos=i;
                }
            }
            System.out.print((char)pos);
            freq[pos]=0;
            count--; //stop incrementing when the loop is = 0
        }
    }
}