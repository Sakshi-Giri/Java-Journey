<<<<<<< HEAD
import java.util.Scanner;

class CharaIsAlpha
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you name : ");
		String name = sc.next().toLowerCase();
		char ch = name.charAt(0);
		System.out.println("Hi my name is "+ name +"and my first character is "+ch);
		
		if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("Character " +ch + " is Vowel.");
		}else
		{
			System.out.println("Character " +ch + " is Consonent.");
		}
	}
=======
import java.util.Scanner;

class CharaIsAlpha
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you name : ");
		String name = sc.next().toLowerCase();
		char ch = name.charAt(0);
		System.out.println("Hi my name is "+ name +"and my first character is "+ch);
		
		if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("Character " +ch + " is Vowel.");
		}else
		{
			System.out.println("Character " +ch + " is Consonent.");
		}
	}
>>>>>>> 8f37139f6698a3a0831086bc62fa0c8903cf2f96
}