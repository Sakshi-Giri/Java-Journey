<<<<<<< HEAD
import java.util.Scanner;

class LargestNum3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number 1 : "); // 5  = (5 10 ) = false OR (10 > 10 and 5 > 15 ) = false
		int num1 = sc.nextInt();
		System.out.print("Enter the Number 2 : "); //10
		int num2 = sc.nextInt();
		System.out.print("Enter the Number 3 : "); // 15
		int num3 = sc.nextInt();
		
		int sum = (num1 > num3) ? (num1 > num2 ? num1 : num2 ) : (num2 > num3 ?num2 : num3);


		System.out.println("Largest Number is : " + sum);  


	}
=======
import java.util.Scanner;

class LargestNum3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number 1 : "); // 5  = (5 10 ) = false OR (10 > 10 and 5 > 15 ) = false
		int num1 = sc.nextInt();
		System.out.print("Enter the Number 2 : "); //10
		int num2 = sc.nextInt();
		System.out.print("Enter the Number 3 : "); // 15
		int num3 = sc.nextInt();
		
		int sum = (num1 > num3) ? (num1 > num2 ? num1 : num2 ) : (num2 > num3 ?num2 : num3);


		System.out.println("Largest Number is : " + sum);  


	}
>>>>>>> 8f37139f6698a3a0831086bc62fa0c8903cf2f96
}