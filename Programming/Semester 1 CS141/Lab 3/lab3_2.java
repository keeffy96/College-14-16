/*Write a java program that determines and prints each digit of a three digit number.
 *The program can use a maximum of TWO variables to do this.
 *The program should output the following(assuming the number is 250):
 *The first digit is 2
 *The second digit is 5
 *The third digit is 0*/

 /*Algorithm:
  *1.1Declare a variable num1
  *1.2Declare a variable num2
  *
  *2.1Divide num1/num2/num2
  *2.2Divide num1/num2%num2
  *2.3Use mod num%num2
  */


public class lab3_2
{
	public static void main (String args [])
	{
		int num1 = 250;
		int num2 = 10;

		System.out.println("The first digit is: " + num1/num2/num2 + '\n' + "The Second digit: " + num1/num2%num2+ '\n' + "The third digit is: " + num1%num2);

	}
}
