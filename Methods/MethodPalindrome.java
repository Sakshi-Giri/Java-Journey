import java.util.*;
class MethodPalindrome
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int rev = reverseNum(num);
		isPalindrome(num,rev);
	}

	public static int reverseNum(int num)
	{
		int rev = 0;
		while(num!=0)
		{
		
			int rem = num%10;
			rev= rev*10+rem;
			num/=10;
		}
		return rev;
	}

	public static void isPalindrome(int num, int rev)
	{
		if(num==rev)
		{
			System.out.println(num + " is a Palindrome Number");
		}else{
			System.out.println(num + " is not a Palindrome Number");
		}
	}
}