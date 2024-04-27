<<<<<<< HEAD
import java.util.Scanner;

class BMI
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Weights in Pounds : ");
		double weightPounds = sc.nextDouble();
		System.out.print("Enter the Height in Inches : ");
		double heightInches = sc.nextDouble();
		
		double weightKg = weightPounds * 0.45359237;
		
		double heightMeter = heightInches * 0.0254;

		double bmi = weightKg / (heightMeter*heightMeter);
		
		System.out.println("Your Body BMI is : " +bmi); 


	}
=======
import java.util.Scanner;

class BMI
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Weights in Pounds : ");
		double weightPounds = sc.nextDouble();
		System.out.print("Enter the Height in Inches : ");
		double heightInches = sc.nextDouble();
		
		double weightKg = weightPounds * 0.45359237;
		
		double heightMeter = heightInches * 0.0254;

		double bmi = weightKg / (heightMeter*heightMeter);
		
		System.out.println("Your Body BMI is : " +bmi); 


	}
>>>>>>> 8f37139f6698a3a0831086bc62fa0c8903cf2f96
}