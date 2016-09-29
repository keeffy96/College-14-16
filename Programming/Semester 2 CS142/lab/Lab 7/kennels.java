import java.util.Scanner;

public class kennels
{
    
    
    public static void main(String args[])
    {
        dog kennel [] = new dog [5];
        
        String chase = new String();
        
        Scanner scan = new Scanner(System.in);
        
         for(int dogNumber = 0; dogNumber<5 ; dogNumber++)
        {
            dog Doggy = new dog();
            
            System.out.println("Please choose a Breed for your dog:");
            Doggy.setBreed(scan.nextLine());
            
            System.out.println("Please choose a Colour for your dog:");
            Doggy.setColour(scan.nextLine());
            
            System.out.println("Please choose an Owners name for your dog:");
            Doggy.setOwner(scan.nextLine());
            
            System.out.println("Please choose if your dog chases squirrels or not:");
            chase = scan.nextLine();
            if(chase.contains("yes"))
            {
                Doggy.setChases(true);
            }
            else
            {
                Doggy.setChases(false);
            }
            
            kennel [dogNumber] = Doggy;
        }
        
        for(int i=0;i<5;i++)
        {
            dog newDog = kennel [i];
            System.out.println(newDog.getColour());
        }
        
    }
}