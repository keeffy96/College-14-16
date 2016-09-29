/*Write a Java program that will check a number variable to see if it is a three digit or a four digit number.
 *It should then print out the individual digits of the number using an appropriate set of statements, depending on how many digits it has.*/

 public class lab4_4
{
	public static void main (String args[])
	{
	int num1 = 8948;

	if (num1/1000 == 0)
	{
		System.out.println("The three digits are " + '\n' + num1/100 + '\n' + (num1/10)%10 + '\n' + (num1%10));
	}
	else if (num1/100 != 0)
	{
		System.out.println("The four digits are: " + '\n' + num1/1000  + '\n' + (num1/100)%10 + '\n' + (num1/10)%10 + '\n' + num1%10);
	}

	}
}