import java.util.Random;

public class l7q1
{
	public static void main(String args[])
	{
		Random ran = new Random();

		double32(ran.nextDouble()*1000);
		int8(ran.nextInt(1000));
		stringDouble(""+ran.nextInt(1000));
		char32('a');
		intChar(ran.nextInt(1000));
	}

	public static void double32(double num)
	{
		System.out.println("The double " +num +" casted to a 32-bit number is " +(int) num);
	}

	public static void int8(int num)
	{
		System.out.println("The integer " +num +" casted to an 8-bit number is " +(byte) num);
	}

	public static void stringDouble(String word)
	{
		System.out.println("The string " +word +" casted to a double is " +Double.parseDouble(word));
	}

	public static void char32(char letter)
	{
		System.out.println("The character " +letter +" casted to a 32-bit number is " +(int) letter);
	}

	public static void intChar(int num)
	{
		System.out.println("The integer " +num +" casted to a char is " +(char) num);
	}
}