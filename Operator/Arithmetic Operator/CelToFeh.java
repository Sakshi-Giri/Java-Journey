//write a java program to convert Celsius into fehrenheint and display result

import java.util.Scanner;

class CelToFeh
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a degree in Celsius: ");
		double celsius = sc.nextDouble();

		double fahrenheit = (9.0 / 5) * celsius + 32;
		
		System.out.println(celsius + " : Celsius is " + fahrenheit + ": Fahrenheit");
	
		System.out.println("-------------------------------------------------------------");

		
		
	}
}