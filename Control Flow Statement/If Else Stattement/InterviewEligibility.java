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