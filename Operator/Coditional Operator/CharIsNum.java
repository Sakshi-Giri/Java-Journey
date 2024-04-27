<<<<<<< HEAD
// write a java wheather a character is Digit or Not (Extra: if not digit then check if it is alphabte if it is then print alphabte if not then print special character).

import java.util.Scanner;

class CharIsNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character or Number : ");
		
		char ch = sc.next().charAt(0); // ch = b - ch = 66
		
		
		System.out.println((ch >= 48 || ch <= 57) ? ch + " is a Digit " : ch + "is not a Digit");

		//System.out.println((ch >= 48 || ch <= 57) ? ch + " is a Digit " : ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) ? ch + "is a Alphabate " : ch + "is a special character "));


		  


	}
=======
// write a java wheather a character is Digit or Not (Extra: if not digit then check if it is alphabte if it is then print alphabte if not then print special character).

import java.util.Scanner;

class CharIsNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character or Number : ");
		
		char ch = sc.next().charAt(0); // ch = b - ch = 66
		
		
		System.out.println((ch >= 48 || ch <= 57) ? ch + " is a Digit " : ch + "is not a Digit");

		//System.out.println((ch >= 48 || ch <= 57) ? ch + " is a Digit " : ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) ? ch + "is a Alphabate " : ch + "is a special character "));


		  


	}
>>>>>>> 8f37139f6698a3a0831086bc62fa0c8903cf2f96
}