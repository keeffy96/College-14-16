/**
 *	The following code demonstrates pass by value in Java.
 *
 *	@author S.Bergin
 *	@version 1.0 02/03/15
 *
 **/
public class PassByValue
{
	// The following variable can be used in any method.
	// Because it is static it has global scope
	static int globalArray [] = {15,20,25,30};

	public static void main (String args [])
	{
		/* The following code demonstrates pass by value for primitive data types */

		int x = 10;
		System.out.println("About to call changeX(), the value of x is " + x);
		changeX(x); //QUESTION 1: What value is x after this method call? Why?
		System.out.println("Back from changeX(), the value of x is " + x);
		System.out.println("\n****************************************\n");

		/* The following code uses explicit re-assignment to change the value of x in main */
		System.out.println("Calling changeX2() and assigning the returned value to x (current value of x is " + x + ")");
		x = changeX2(x);//Question 2: What value is x after this method call? Why
		System.out.println("Back from changeX2()new value of x is " + x);
		System.out.println("\n****************************************\n");

		/* The following code demonstrates pass by value for reference (object) types */
		int array [] = {10,20,30,40};
		System.out.println("About to call changeArray(), values in the array are... ");
		printHelper(array);
		changeArray(array);//Question 3: What is the contents of the array after this call? Why?
		System.out.println("Back from the call to changeArray(), values in the array are... ");
		printHelper(array);


		/* The following code demonstrates pass by value for a static array
		 * Also demonstrates how overloaded methods work
		 */
		System.out.println("\n****************************************\n");
		System.out.println("About to call changeArray(), values in the static array are... ");
		printHelper();
		changeArray();//Question 4: What is the contents of the array after the call? Why?
		System.out.println("Back from the call to changeArray(), values in the static array are... ");
		printHelper();

		/* The reassignment code shows why Java is pass by value and not pass by reference on reference types */
		System.out.println("\n****************************************\n");
		System.out.println("About to call reassignArray(), values in the array are... ");
		printHelper(array);
		reassignArray(array);//N.B. Question5: What is the value of the array after this call? Why?
		System.out.println("Back from the call to reassignArray(), values in the array are... ");
		printHelper(array);

		/* Strings are immutable, let's prove it */
		System.out.println("\n****************************************\n");
		String s1 = new String ("HelloWorld");
		setNewString(s1);//s1 has not changed in Main because Strings are immutable
		System.out.println("After setNewString " +s1);
		System.out.println("\n****************************************\n");
		s1 = setNewString2(s1);//Question 6: How did we manage to change s1?
		System.out.println("After setNewString2, where we send back a String object " +s1);



	}

	/**
	 * 	This method changes the value of the formal int parameter x
	 *	@param x The value to be changed
	 */
	public static void changeX(int x)
	{
		x = 17;
		System.out.println("The value of x in changeX() is " + x);
	}

	/**
	 * 	This method changes the value of the formal int parameter x and returns same
	 *	@param x The value to be changed
	 *	@return The value of x after it has been changed
	 */
	public static int changeX2(int x)
	{
		x = 27;
		System.out.println("The value of x in changeX2() is " + x);
		return x;
	}

	/**
	 * 	This method changes the contents of the formal int [] parameter
	 *	@param array The array to be changed
	 */
	public static void changeArray(int array [])
	{
		array[0]=10000;
		array[1]=20000;
		System.out.println("The array in changeArray() is ");
		for(int i : array)System.out.print(i + " " );
		System.out.println();
	}

	/**
	 * 	This method changes the contents of the static array (demonstrates overloaded methods)
	 */
	public static void changeArray()
	{
		globalArray[0]=10;
		globalArray[1]=13;
	}

	/**
	 * 	This method points the formal int [] parameter to a new array
	 *	@param array The array to be reassigned
	 */
	public static void reassignArray(int array [])
	{
		int newArray[] = {-1, -2, -3, -4};
		array=newArray;
		System.out.println("The array in reassignArray() is ");
		for(int i : array)System.out.print(i + " " );
		System.out.println();
	}

	/**
	 * 	This method prints the contents of the formal int [] parameter
	 *	@param array The array to be printed
	 */
	public static void printHelper (int array [])
	{
		for(int i = 0; i <array.length; i++)System.out.print(array[i] + " ");
		System.out.println();
	}

	/**
	 * 	This method prints the contents of the static array (demonstrates overloaded methods)
	 */
	public static void printHelper ()
	{
		for(int i = 0; i <globalArray.length; i++)System.out.print(globalArray[i] + " ");
		System.out.println();
	}

	/**
	 * 	This method demonstrates that although Strings are objects they are immutable
	 *	@param s1 The String that we will re-assign
	 */
	public static void setNewString(String s1)
	{
		s1 = "World, Hello";
		System.out.println("In setNewString, s1 is " + s1);
	}

	/**
	 * 	This method demonstrates that although Strings are objects they are immutable
	 *	@param s1 The String that we will re-assign
	 *	@return The new String that is returned
	 */
	public static String setNewString2(String s1)
	{
		s1 = "World, Hello";
		System.out.println("In setNewString2, s1 is " + s1);
		return s1;
	}
}