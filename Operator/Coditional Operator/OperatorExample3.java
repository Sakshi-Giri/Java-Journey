<<<<<<< HEAD
// write a java wheather a character is aplphabate or not

import java.util.Scanner;

class OperatorExample3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character : ");
		
		char ch = sc.next().charAt(0); // ch = b - ch = 66
		
		
		System.out.println((ch >= 65 && ch <= 90) || (ch >= 98 && ch <= 122)? ch + " is a alphabet " : ch + "is not a alphabet");  


	}
=======
// write a java wheather a character is aplphabate or not

import java.util.Scanner;

class OperatorExample3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character : ");
		
		char ch = sc.next().charAt(0); // ch = b - ch = 66
		
		
		System.out.println((ch >= 65 && ch <= 90) || (ch >= 98 && ch <= 122)? ch + " is a alphabet " : ch + "is not a alphabet");  


	}
>>>>>>> 8f37139f6698a3a0831086bc62fa0c8903cf2f96
}