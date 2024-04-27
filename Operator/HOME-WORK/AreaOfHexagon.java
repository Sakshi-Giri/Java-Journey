//write a java program that promts the user to enter the side of a hexagon and display its area.

import java.util.Scanner;

class AreaOfHexagon
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Side : ");
		double side = sc.nextDouble();

		double sideSqr = side * side;
		
		
		double areaHexa = 3 * (1.7320 / 2) * sideSqr ;
		
		
		System.out.println("The area of the Hexagon is : " + areaHexa); 


	}
}