/*Write a java program that stores two variables of type double and checks the value of a
 *character variable to see what mathematical operation it should perform.
 * For example, if the ‘*’ is found then a multiplication operation should take place.
 *It should check for the five main operators we have looked at.
 */
 /*Algorithm
  *
  */

 public class lab4_2
{
	public static void main(String args[])
	{
		double num1 = 2.0;
		double num2 = 1.5;
		char operator = '*';
		switch(operator)
		{
			case '+' :System.out.println(num1+num2);	break;
			case '-' :System.out.println(num1-num2);	break;
			case '*' :System.out.println(num1*num2);	break;
			case '/' :System.out.println(num1/num2);	break;
			case '%' :System.out.println(num1%num2);	break;
			default :System.out.println("ERROR"); break;
		}
	}
}