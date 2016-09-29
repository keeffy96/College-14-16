
/**
 * Accept a String that represents a person’s name and prints Hello followed by the person’s name to the screen
 * 
 * @author Conor O Keeffe 
 * @version 27/03/15
 */

import java.util.Scanner;
public class HelloWorld
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        sayHello(scan.nextLine());
        
    }
    
    public static void sayHello(String name)
    {
        System.out.println("Hello " + name);
    }
}
