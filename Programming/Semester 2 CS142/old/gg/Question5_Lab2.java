public class Question5_Lab2
{
    public static void main(String args[])
    {
	//Declaring a 2d Array of size 4x5
        int array [] [] = new int [4] [5];
 
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
                array [i] [j] = 42;
            }
        }

        for(int i=0;i<4;i++)
        {
            System.out.print("\n");
            for(int j=0;j<5;j++)
            {
                System.out.print(array [i] [j] +"   ");
            }
        }
 
    }
}
