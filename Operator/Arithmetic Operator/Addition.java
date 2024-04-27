import java.util.Scanner;

class Addition
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number 1");

		int num1 = sc.nextInt();

		System.out.print("Enter Number 2");
		int num2 = sc.nextInt();
		int addition = num1 + num2;
		System.out.println("Addition of "+ num1 + " + " + num2 + "is : " +addition);

		
		
	}
}