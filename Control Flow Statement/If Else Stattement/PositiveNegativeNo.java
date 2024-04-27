import java.util.Scanner;

class PositiveNegativeNo
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
		else
		{
			System.out.println(num + " is a 0 (Natural Number)");
		}

	}
}