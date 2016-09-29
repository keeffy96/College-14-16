/*Write a program that declares four variables to store the values 12, 10, 12.0 and 10.0
 *Perform the following calculationsand store the results of each calculation in a variable of the appropriate type.
 *
 *Algorithm:
 *
 */

public class variables5
{
	public static void main (String args[])
	{
		int num1 = 12;
		int num2 = 10;
		double num3 = 12.0;
		double num4 = 10.0;
		double result1 = 0;
		double result2 = 0;
		double result3 = 0;
		double result4 = 0;
		double result5 = 0;

		 int result = num1 % num2;
		System.out.println("When " + num1 + " is divided by "  + num2 + " the remainder is "  + result1);

		result2 = num3 % num4;
		System.out.println("When " + num3 + " is divided by "  + num4 + " the remainder is "  + result2);

		result3 = num2 % num1;
		System.out.println("When " + num2 + " is divided by "  + num1 + " the remainder is "  + result3);

		result4 = num4 % num3;
		System.out.println("When " + num4 + " is divided by "  + num3 + " the remainder is "  + result4);

		result5 = num3 % num2;
		System.out.println("When " + num3 + " is divided by "  + num2 + " the remainder is "  + result5);



	}
}
