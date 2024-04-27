<<<<<<< HEAD
import java.util.Scanner;

class BloodDonation
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age :");
		int age = sc.nextInt();

		if(age>20)
		{
			System.out.print("Did you consume Alcohol or Cigrette in 24 hours before Donating Blood (Yeas / NO): ");
			String consume = sc.next().toLowerCase();

			if(consume.equals("no"))
			{
				System.out.println("Enter your Weight : ");
				float weight = sc.nextFloat();

				if(weight > 50)
				{
					System.out.println("******** Congratylation!!! You are Fit to Donate Blood ********");
				}
				else
				{
					System.out.println("SORRY...You are Not Fit to Donate Blood. Try to eat more food, gain "+ (50 - weight ) +"weight and come again" );
				}
			}else{
				System.out.println("SORRY...You are Not Fit to Donate Blood. Don not consume alcohol and cigrette otherwise you will need blood and heart. GOOD LUCK!!");
			}

		}else{
			System.out.println("SORRY...You are Not Fit to Donate Blood. Please try after "+ (18 - age)+ " years.");
		}
	}
}
=======
//WAP to check if the user is able to donate blood or not.
//User must be 20+ and must not consume alcohol or cigrette in 24 hours before donating blood and weight must be more than 50kg.

import java.util.Scanner;

class BloodDonation
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age :");
		int age = sc.nextInt();

		if(age>20)
		{
			System.out.print("Did you consume Alcohol or Cigrette in 24 hours before Donating Blood (Yeas / NO): ");
			String consume = sc.next().toLowerCase();

			if(consume.equals("no"))
			{
				System.out.println("Enter your Weight : ");
				float weight = sc.nextFloat();

				if(weight > 50)
				{
					System.out.println("******** Congratylation!!! You are Fit to Donate Blood ********");
				}
				else
				{
					System.out.println("SORRY...You are Not Fit to Donate Blood. Try to eat more food, gain "+ (50 - weight ) +"weight and come again" );
				}
			}else{
				System.out.println("SORRY...You are Not Fit to Donate Blood. Don not consume alcohol and cigrette otherwise you will need blood and heart. GOOD LUCK!!");
			}

		}else{
			System.out.println("SORRY...You are Not Fit to Donate Blood. Please try after "+ (18 - age)+ " years.");
		}
	}
}
>>>>>>> 8f37139f6698a3a0831086bc62fa0c8903cf2f96
