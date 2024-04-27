import java.util.*;

class NeonNumber
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int sqr = num*num;
		int sum = 0;

		while(sqr>0)
		{
			int rem = sqr%10;
			sum+=rem;
			sqr/=10;
		}

		System.out.println((num==sum)?num +" Neon Number" : num+ " NOT a Neon Number");
	}
}