import java.util.*;

class SpyNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int sum = 0;
		int product = 1;
		int dup = num;

		while(num>0)
		{
			int rem = num/10;
			sum = sum+rem;
			product += rem;
			num/=10;
		}
		
			System.out.println((sum == product)? "is not a spy number" : "is spy number");
		
	}	
}
