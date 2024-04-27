import java.util.*;

class ReverserNumber_String
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		String rev = "";

		while(num>0)
		{
			int rem = num%10;
			rev = rev + rem;
			num/=10;
		}

		System.out.println("Reverse Number : "+rev);
	}
}