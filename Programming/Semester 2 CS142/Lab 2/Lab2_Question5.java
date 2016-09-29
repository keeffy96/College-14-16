public class Lab2_Question5
{
	public static void main(String args[])
	{
		int array [] [] = new int [4] [5];

		for(int i=0;i<4;i++)
		{
			for(int j=0;j<5;j++)
			{
				array [i] [j] = 42;
			}
		}

		System.out.println("Your array is:");
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