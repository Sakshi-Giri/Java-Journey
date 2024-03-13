//write a java program that prompts the user to enter the distance to drive, the fuel effeciency of the car in miles per gallon, and the price per gallon, and display the cost of the trip.

import java.util.Scanner;

class CostOfDriving
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Driving Distance : ");
		float driveDis = sc.nextFloat();
		System.out.print("Enter the Miles per gallon : ");
		float miles = sc.nextFloat();
		System.out.print("Enter the Price per gallon : ");
		float price = sc.nextFloat();
		
		float costOfDriving = (driveDis / miles) * price;
		
		
		System.out.println("The Total Cost of Driving is : " +costOfDriving); 


	}
}