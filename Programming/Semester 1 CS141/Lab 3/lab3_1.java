/*Write a java program that determines and prints each digit of a four digit number. The program
should use a single print statement but should print the output in the following format given (for
example) the number 2787:
The digits in the four digit number 2787 are:
*2
*7
*8
*7*/

/*Algorithm
 *1.1Declare a variable
 *1.2declare variable num1
 *1.3declare variable num2
 *1.4declare variable num3
 *1.5declare variable num4
 *1.6declare variable result1
 *1.7declare variable result2
 *1.8declare variable result3
 *1.9declare variable result4
 *
 *2.1Calculate the result variables
 *2.2
 */

public class lab3_1
{
	public static void main (String args [])
	{
		int num1 = 2787;
		int num2 = 1000;
		int num3 = 100;
		int num4 = 10;
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		int result4 = 0;

		result1 = num1/num2;
		result2 = (num1/num3)%10;
		result3 = (num1/num4)%10;
		result4 = num1%num4;
		System.out.println("The digits in the four digit number 2787 are:" + '\n' + result1 + '\n' + result2+ '\n' + result3+ '\n' + result4);


	}
}
