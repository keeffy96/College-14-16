/*Write a Java program that creates a non-rectangular 2D array to store the shape below.
 *The program should print the shape to the screen.
 */
 public class Question5_Lab3
{
	public static void main (String args[])
	{
		// initializing the number of rows
		char [][] myArray = new char[7][];

 		// initializing the number of columns in each row (each row is an array)
		myArray[0] = new char[1];
		myArray[1] = new char[2];
		myArray[2] = new char[3];
		myArray[3] = new char[4];
		myArray[4] = new char[3];
		myArray[5] = new char[2];
		myArray[6] = new char[1];


 		// This loops sets each element in the 2d array to a '+' and then prints out this value
 		for (int row =0; row < myArray.length; row++)
 			{
 				for (int column=0; column < myArray[row].length; column++)
 					{
 						myArray[row][column] = '+';
 						System.out.print(myArray[row][column] + "");
 					}
 				System.out.println("");
 			}
	}
}