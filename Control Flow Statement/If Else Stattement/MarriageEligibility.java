import java.util.Scanner;

class MarriageEligibility
{
	
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Enter your Property");
		double property = sc.nextDouble();
		sc.nextLine(); //to get on next line after surename : 1st option is to use nextLine() method

		//Scanner sc1 = new Scanner(System.in) // 2nd option is to create new object of Scanner and 3rd option is to restart the Scanner class.

		System.out.println("Enter your Surename");
		String surename = sc.next().toUpperCase();
		

		if( (age > 20 && property > 10000000) || surename.equals("AMBANI"))
		{

			System.out.println("Your Eligible");
		}
		else 
		{
			System.out.println("Your not Eligible");
		}

	}
}