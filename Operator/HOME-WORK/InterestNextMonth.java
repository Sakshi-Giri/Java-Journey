//write a java program that reads the balance and the anual percentage interest rate and display the interest for thr next month.


import java.util.Scanner;

class InterestNextMonth
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Balance : ");
		double balance = sc.nextDouble();
		System.out.print("Enter the Anual Interest Rate : ");
		double anualInterest = sc.nextDouble();
		
		double nextMonthInterest = balance * (anualInterest / 1200);
		
		
		System.out.println("The Interest for next months is : " + nextMonthInterest); 


	}
}