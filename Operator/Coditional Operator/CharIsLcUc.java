// write a java wheather a character is aplphabate or not if it is then check wheather char is lower case or upper case

import java.util.Scanner;

class CharIsLcUc
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character : ");
		
		char ch = sc.next().charAt(0); // ch = b - ch = 66 so, (66>65 (true) && 66<90(true)) 

		
		System.out.println((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) ? ((ch >= 65 && ch <= 90) ? ch + " is an Alphabet and in Upper case " : ch + " is an Alphabate and In Lower Case") : ch + "is not a alphabet"); 

	


	}
}