/*Write a program that declares two numbers and stores the value 47.9 in the first, 89.2 in the
second and 0.0 in the third. Create another variable that stores the value of the first number
divided by the second number and another variable that stores the value of the second number
divided by the third number. Compile and run your program. Note the output. Call over your
demonstrator to explain the output.*/


public class variable4
{
	public static void main(String args[])
	{
	//declaring our variables//
		double num1 = 47.9;
		double num2 = 89.2;
		double num3 = 0.0;
		double result = 0;

	//storing the value of the first number
		result = num1/num2;
		System.out.println(" double num4 " + result);


		result = num2/num3;
		System.out.println("double num5 " + result);
	}
}
