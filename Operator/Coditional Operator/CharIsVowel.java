import java.util.Scanner;

class CharIsVowel
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you name : ");
		String name = sc.next().toLowerCase();
		char ch = name.charAt(0);
		System.out.println("Hi my name is "+ name +"and my first character is "+ch);
		
		//int temp = a,e,i,o,u;

		System.out.print((ch == 'a' || ch=='i' || ch=='o' || ch=='u' || ch=='e') ? ch + "is vowel" : ch + "is a consonent"); 
	}
}