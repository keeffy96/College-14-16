import java.util.Arrays;  
import java.util.Random;  
  
public class BrokenSticks 
{    
   public static void main(String[] args) 
   {  
       Random random = new Random();  
  
       int trials = 1000000;  
       int triangles = 0;  
  
       double[] breaks = new double[2];  
       double[] sides = new double[3];  
  
       for( int i=0; i < trials; ++i )  
       {  
           breaks[0] = random.nextDouble();
           breaks[1] = 1.0 - breaks[0];//Other half of the break
           Arrays.sort(breaks);
           
           if(breaks[0]>breaks[1]) //Get larger stick
           {
        	   sides[0] = breaks[1]; //First side equals smaller break
        	   sides[1] = random.nextDouble();
        	   if(sides[1]>breaks[0])
        	   {
        		   sides[1] = random.nextDouble();
        	   }
        	   
        	   sides[2] = 1.0 - (sides[0] + sides[1]);
           }
           
           else
           {
        	   sides[0]=breaks[0];
        	   sides[1] = random.nextDouble();
        	   if(sides[1]>breaks[1])
        	   {
        		   sides[1] = random.nextDouble();
        	   }
        	   
        	   sides[2] = 1.0 - (sides[0] + sides[1]);
           }
           
           Arrays.sort(sides);  
            
           if(((sides[0]+sides[1])>sides[2]) && ((sides[0]+sides[2])>sides[1]) && ((sides[1]+sides[2])>sides[0]))  
           {  
        	   triangles++; 
           }
       }  
  
       System.out.println("Triangles: " + triangles);  
       System.out.println("Trials: " + trials);  
  
       double p = (double)triangles / trials;  
       System.out.println("Proportion: " + p);  
   }  
}  