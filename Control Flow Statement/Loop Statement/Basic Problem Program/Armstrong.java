import  java.util.*;

class Armstrong
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();

		int length = 0;  
		int dup1 = num;
		int dup2 = num;
		int sum = 0;

		while(num!=0)   // to find length(condition)
		{
			length++;   
			num /= 10;
		}					//length found

		while(dup1 > 0)  //condition
		{
			int rem = dup1 % 10;
			int power = 1;

			for(int i = 1; i<=length; i++)
			{
				power = power*rem;
			}

			sum= sum+power;

			dup1 /=10;
		}

		if(sum == dup2)
		{
			System.out.println("It is a ARMSTRONG Number ");
		}
		else{
			System.out.println("It is Not ARMSTRONG NUMBER ");
		}

	}
}