import java.util.Scanner;

public class l2q6
{
	public static void main(String args[])
	{
		Scanner scan =  new Scanner(System.in);
		int r = 0, c = 0;

		System.out.println("Please input the number of rows for your array:");
		r = scan.nextInt();

		System.out.println("Please input the number of coloumns for your array:");
		c = scan.nextInt();

		char array [] [] = new char [r] [c];

		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				array [i] [j] = '*';
			}
		}

		System.out.println("Your array is:");
		for(int i=0;i<r;i++)
		{
			System.out.print("\n");
			for(int j=0;j<c;j++)
			{
				System.out.print(array [i] [j]);
			}
		}

	}
}