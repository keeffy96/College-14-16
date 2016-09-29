/*/* Write a program called to produce the multiplication table of 1 to 9 shown below and store in a 2D array.
 *Print the matrix with a row header and column header as shown on the next page.
 *Tip: use a tab to space between the columns.
 */
 public class Question6_Lab3
{
	public static void main (String args[])
	{
		//Declaring size of 2d array
		int[][] TableSize = new int[10][10];
		System.out.print(" ");

		//Looping to declare values for header from 1 to 9
		for (int a = 1; a <= 9; a++)
			{
				System.out.print("\t" + a);
			}

		System.out.println(" ");
		for (int i = 1; i <= 9; i++)
			{
				// Looping to declare values for rows
				for (int j = 0; j <= 9; j++)
					{
						// Looping to declare values for columns
						TableSize[i][j] = i * j;
					}
			}

		System.out.print("--------------------------------------");
		System.out.println("");

		//Declaring values to multiply with header (Side column on left)
		for (int i = 1; i <= 9; i++)
			{
				System.out.print(i + "|");
				//The value to begin multipling at (1x1...)
				for (int j = 1; j <= 9; j++)
					{
						System.out.print("\t" + TableSize[i][j]);
					}

				System.out.println("");
			}
	}
}