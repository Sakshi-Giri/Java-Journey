<<<<<<< HEAD
import java.util.Scanner;

class NumberCheck
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();

		if(num>0)
		{
			System.out.println(num + " is a Positive Integer.");
		}
		else if(num<0)
		{
			System.out.println(num + " is a Negative Integer.");
		}
		else if (num == 0)
		{
			System.out.println(num + " is a Natural Number");
		}
		else{
			System.out.println("You have entered the wrong number...Please check the number once again ");
		}

	}
}
=======
//WAP to check if the user given number is POSITIVE, NEGATIVE, NEUTRAL(NATURAL NUMBER)?

import java.util.Scanner;

class NumberCheck
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();

		if(num>0)
		{
			System.out.println(num + " is a Positive Integer.");
		}
		else if(num<0)
		{
			System.out.println(num + " is a Negative Integer.");
		}
		else if (num == 0)
		{
			System.out.println(num + " is a Natural Number");
		}
		else{
			System.out.println("You have entered the wrong number...Please check the number once again ");
		}

	}
}
>>>>>>> 8f37139f6698a3a0831086bc62fa0c8903cf2f96
