/*Write a java program that uses a switch statement to print out the price of a vehicle should pay at a toll.
 *Your program should check the value of a character variable to see if it represents a car, a motorbike, a bus, a truck or a van.
 *Depending on the type of vehicle it should print out the appropriate toll price.
 *The prices are as follows:
 *Car - €2.00
 *Motorbike - €1.10
 *Bus - €4.25
 *Truck - €6.70
 *Van - €4.00*/

 /*Algorithm:
  *Declare my variable
  *Car - €2.00
  *Motorbike - €1.10
  *Bus - €4.25
  *Truck - €6.70
  *Van - €4.00
  *Write out a switch statement
  *write a default statement
  */

 public class lab4_1
{
	public static void main(String args[])
	{
		char car ='c';
		char motorcycle ='m';
		char bus ='b';
		char turck ='t';
		char van ='v';
		switch (car)
		{
			case 'c' :System.out.println("The toll for a car is €2.00 ");	break;
			case 'm' :System.out.println("The toll for a motorbike is €1.10 ");	break;
			case 'b' :System.out.println("The toll for a bus is €4.25 ");	break;
			case 't' :System.out.println("The toll for a truck is €6.70 ");	break;
			case 'v' :System.out.println("The toll for a car is €4.00 ");	break;
			default :System.out.println("ERROR: alien space craft"); break;
		}
	}
}