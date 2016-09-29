/*Write a Java program that contains a static method called print WeatherReport.
 *The method should print two lines about today’s weather.
 *In the main method you should call the print WeatherReport method.
 */

public class Question1_Lab3
{
	public static void main (String args[])
	{
		System.out.println("Today weather report:");
		printWeatherReport();
	}

		public static void printWeatherReport()
		{
			System.out.println("Its freezing out.");
			System.out.println("Wouldnt be long getting frost bit.");
		}

}