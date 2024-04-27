import java.util.*;
class PrimeRecursion
{
	static int i = 2;
	static int num;
	static boolean flag = true;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		num = sc.nextInt();
		
		isPrime();

		System.out.println(flag ? num+" Prime" : num+ " Not Prime");

		if(i==num)
				return;

		
	}
	public static void isPrime()
	{
			if(num%i==0)
			{
				flag = false;
				return;
			}
			i++;
			isPrime();
	}

}