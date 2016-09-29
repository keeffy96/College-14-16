import java.util.Random;

public class ArrayProcessing
{
	public static Random ran = new Random();
	//static array
	public static int arrays [] = new int [100];

	public static void main(String args[])
	{
		//1 dimensional arrays
		int array1 [] = new int [20];
		int array2 [] = new int [20];

		//call methods to generate the three arrays
		makeIntArray(arrays);
		makeIntArray(array1);
		makeIntArray(array2);

		//call method to print the static array
		printArray(arrays);

		//call method to find the dot product of array1 and array2 and let result equal to it
		int result = dotProduct(array1,array2);
		//print result
		System.out.println("\nThe dot product of array1 and array2: " +result);

		//call method to find the max value in array1 and array2 and print the values
		int max = findMax(array1);
		System.out.println("The largest value in array1 is " +max);
		max = findMax(array2);
		System.out.println("The largest value in array2 is " +max);

		//call method to find the max value in the static array and print the value
		max = findMax();
		System.out.println("The largest value in the static array is " +max);
	}

	//generating the array method
	public static void makeIntArray(int array [])
	{
		 for(int i=0;i<array.length;i++)
		 {
		 	array [i] = ran.nextInt(201);
		 }
	}

	//printing the array method
	public static void printArray(int array [])
	{
		for(int i=0;i<array.length;i++)
		 {
		 	System.out.print(array [i] +"  ");
		 }
	}

	//dot product calculating method
	public static int dotProduct(int array1 [],int array2 [])
	{
		int store = 0;
		for(int i=0;i<array1.length;i++)
		{
			store = store + ((array1 [i])*(array2 [i]));
		}
		return store;
	}

	//max findind method for 1 dimensional array
	public static int findMax(int array [])
	{
		int max = 0;
		for(int i=0;i<array.length;i++)
		{
			if(array [i]>max)
			{
				max = array [i];
			}
		}
		return max;
	}

	//static array max finding method
	public static int findMax()
	{
		int max = 0;
		for(int i=0;i<arrays.length;i++)
		{
			if(arrays [i]>max)
			{
				max = arrays [i];
			}
		}
		return max;
	}
}