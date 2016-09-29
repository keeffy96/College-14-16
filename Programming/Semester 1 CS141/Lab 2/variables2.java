/*Write a java program that declares and initialises six decimal point numbers and prints their average, sum and product to the screen.
 *
 *Algorithm:
 *i am choosing my variables
 */
public class variables2
{
	public static void main (String args[])

	{
		 double num1 = 2.1;
		 double num2 = 3.01;
		 double num3 = 4.8;
		 double num4 = 5.9;
		 double num5 = 3.33;
		 double num6 = 4.2;
		 double result = 0;

				//The average of the six numbers is://

		 result = (num1 + num2 + num3 + num4 + num5 + num6)/6;
		 System.out.println("The average of the six numbers is " + result);

		 		//The sum of the six numbers is://


		 result = (num1 + num2 + num3 + num4 + num5 + num6);
		 System.out.println("The sum of the six numbers is " + result);

				//The product of the six numbers is://

		 result = (num1 * num2 * num3 * num4 * num5 * num6);
		 System.out.println("The sum of the six numbers is " + result);

	}

}
