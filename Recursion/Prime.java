import java.util.*;

class Prime
{
	static int num;
	static int i = 2;
	static boolean flag = true;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");  //13
		num = sc.nextInt();

		prime();

		System.out.println((flag)? num+" - Prime": num+" - Not Prime");
	}
	public static void prime()
	{
		if(num % i==0)
		{
			flag = false;
			return;
		}
		i++;
		if(num==i)
			return;
		prime();
	}
}