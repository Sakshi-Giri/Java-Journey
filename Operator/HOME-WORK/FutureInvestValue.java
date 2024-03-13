import java.util.Scanner;

class FutureInvestValue
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Investment Amount : ");
		double invest = sc.nextDouble();
		System.out.print("Enter the Anual Interest Rate : ");
		double interestYearly = sc.nextDouble();
		System.out.print("Enter Number of Years : ");
		int years = sc.nextInt();
		
		double interestMonthly = interestYearly/100/12;
		
		double futureValue = invest*(1+(interestMonthly*(years*12)));
		
		System.out.println("Future investment value is : " +futureValue); 


	}
}