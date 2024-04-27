<<<<<<< HEAD
import java.util.Scanner;

class InterviewEligibility
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Percentage : ");
		float per = sc.nextFloat();

		if(per>60)
		{
			System.out.println("You are Eligible for Interview.");
		}
		else
		{
			System.out.println("Unfortunately! You are Not Eligible for Interview.");
		}
	}
}
=======
//WAP to check if the user entered percentage is eligible for appearing the interview or not?
//if the percentage is above 60 the student is eligible for interview. if the percentage is below 60 the student is not eligible for interview.

import java.util.Scanner;

class InterviewEligibility
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Percentage : ");
		float per = sc.nextFloat();

		if(per>60)
		{
			System.out.println("You are Eligible for Interview.");
		}
		else
		{
			System.out.println("Unfortunately! You are Not Eligible for Interview.");
		}
	}
}
>>>>>>> 8f37139f6698a3a0831086bc62fa0c8903cf2f96
