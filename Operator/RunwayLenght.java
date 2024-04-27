//write a java program that prompts the user to enter the v in meters/second (m/s) and the acceleration a in meters/seconds (m/s) and display the minimum runway lenght.

import java.util.Scanner;

class RunwayLenght
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Speed : ");
		float speed = sc.nextFloat();
		System.out.print("Enter the Acceleration : ");
		float acceleration = sc.nextFloat();
		
		float runwayLenght = (speed*speed)/ (2*acceleration);
		
		
		System.out.println("The Minimum runway lkenght for this Airplane is : " +runwayLenght); 


	}
}