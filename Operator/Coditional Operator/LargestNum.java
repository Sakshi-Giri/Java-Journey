import java.util.Scanner;

class LargestNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number 1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the Number 2 : ");
		int num2 = sc.nextInt();
		
		System.out.println((num1 > num2 )? num1 + " Number is smallest  " : num2 + "Number is Largest "); // 15 > 10


	}
}