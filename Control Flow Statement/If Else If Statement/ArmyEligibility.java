//WAP to check if the user is able to join Army or not.
//Age should be more than 18+ and height should be at least 162cm and weight must be more than 56kg.

import java.util.Scanner;

class ArmyEligibility
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age :");
		int age = sc.nextInt();

		if(age>18)
		{
			System.out.println("Enter your Height : ");
			float height = sc.nextFloat();

			if(height > 161)
			{
				System.out.println("Enter your Weight : ");
				float weight = sc.nextFloat();

				if(weight > 56)
				{
					System.out.println("******** Congratylation!!! You are Able to join Army ********");
				}
				else
				{
					System.out.println("SORRY...You are Not Able to join Army");
				}
			}else{
				System.out.println("SORRY...You are Not Able to join Army");
			}

		}else{
			System.out.println("SORRY...You are Not Able to join Army");
		}
	}
}
