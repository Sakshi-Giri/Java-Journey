import java.util.*;

class PowerOfNumber
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int length = 0;
		int dup = num;
		int power = 1;

		

		while(num != 0)
		{
			length++;
			num /=10;
		}

		System.out.println("Length of "+ dup +" : " + length);

		for(int i =1; i<= length; i++)
			power *= dup;

		System.out.println(power);
	}
}