// write a java check integer is even or add
import java.util.Scanner;

class NewEvenOdd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		
		int num = sc.nextInt();
		
		
		//System.out.println(((num/2)*2 ==num)?"Even" : "Odd");

		System.out.println(((num/2.0) == (num/2))?"Even" : "Odd"); 
		 


	}
}