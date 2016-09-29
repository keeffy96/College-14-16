package game;

import java.util.*;
  
public class scrabble
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        FileIO reader = new FileIO();
        
        String home = "X:\\CS211\\dictionary.txt";
  
        String[] dict = reader.load(home);
        sort(dict);
        
        System.out.println("Enter your letters:");
        String input = scan.nextLine();
        
        System.out.println("These are your letters: " +input);
        System.out.println("\nHere are the top ten suggestions: \n");
        
        String output [] = new String [10];
        int count=0,check=dict.length-1;
        
        while(count<10&&check>=0)  //while it only give top 10 suggestions and while all words are checked
        {
            String store=input;
            String word=dict[check].trim(); //trim to get rid of any spaces which could cause no words to show
            
            if(!(word.length()>input.length()))
            {
                for(int i=0;i<word.length();i++)   //allows to end the loop with a break statement, loop checks the length of each word in the dictionary
                {
                    if(store.contains(word.substring(i,i+1)))
                    {
                        if(i==word.length()-1)
                        {
                            output [count]=word;
                            count++;
                        }
                        else
                        {
                            store=store.replaceFirst(""+word.charAt(i), "");
                        }
                    }
                     
                    
                }
            }
            check--;
        }
  
  for(int i=0;i<10;i++)
        {
            if(output[i]==null)
            {
                System.out.println("There are no more words you can make.");
                 
            }
            System.out.println((i+1) +": "+output[i]);
        }
        scan.close();
    }
    
    public static void sort(String [] words)            //quicksort boilerplate code
    {
        int word=words.length;
        quicksort(0, word - 1,words);
    }
    
    public static void quicksort(int low, int high,String [] words) 
    {
        int i = low, j = high;
        int pivot = words[low + (high-low)/2].length();
    
        while (i <= j)
        {
            while (words[i].length() < pivot)
            {
                i++;
            }
            while (words[j].length() > pivot)
            {
                j--;
            }
    
            if (i <= j)
            {
                exchange(i, j,words);
                i++;
                j--;
            }
        }
        if (low < j)
          quicksort(low, j,words);
        if (i < high)
          quicksort(i, high,words);
    }
    
    public static void exchange(int i, int j,String []words)
    {
        String temp = words[i];
        words[i] = words[j];
        words[j] = temp;
    }
}
