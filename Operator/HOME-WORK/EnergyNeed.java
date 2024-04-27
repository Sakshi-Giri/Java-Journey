<<<<<<< HEAD
import java.util.Scanner;

class EnergyNeed
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount of water in kilograms : ");
		double waterKg = sc.nextDouble();
		System.out.print("Enter the initial temperature : ");
		double initialTemp = sc.nextDouble();
		System.out.print("Enter the final temperature : ");
		double finalTemp = sc.nextDouble();
		
		double energy = waterKg * (finalTemp - initialTemp) * 4184;
		
		
		System.out.println("The energy needed is : " +energy); 


	}
=======
import java.util.Scanner;

class EnergyNeed
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount of water in kilograms : ");
		double waterKg = sc.nextDouble();
		System.out.print("Enter the initial temperature : ");
		double initialTemp = sc.nextDouble();
		System.out.print("Enter the final temperature : ");
		double finalTemp = sc.nextDouble();
		
		double energy = waterKg * (finalTemp - initialTemp) * 4184;
		
		
		System.out.println("The energy needed is : " +energy); 


	}
>>>>>>> 8f37139f6698a3a0831086bc62fa0c8903cf2f96
}