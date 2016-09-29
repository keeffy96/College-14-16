/*Write a Java program that will store the ages of three people.
 *The program should check, in one expression, to see if all the ages are greater than 18.
 *If they are then an appropriate message should be printed -
 *All people are over 18
 *or
 *not all people are over 18.
 *The program should also check to see if at least one of the ages are greater than 18 and again print an appropriate message–
 *At least one of the people are over 18.*/

/*Algorithm:
 *Declare variables
 *
 */
public class lab4_3
{
	public static void main (String args[])
	{
	int age1 = 164;
	int age2 = 140;
	int age3 = 64;

	if (age1 > 18 & age2 > 18 & age3 > 18)
	{
		System.out.println("All people are over 18");
	}
	else
	{
		System.out.println("Not all people are over 18");
	}
	if (age1 > 18 | age2 > 18 | age3 > 18)
	{
		System.out.println("At least one of the people are over 18");
	}
	}
}




