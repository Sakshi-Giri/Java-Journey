import java.util.*;
class EmirpNumber
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");  //31 : Step 1.
		int num = sc.nextInt();
		
		if(isEmirp(num)==true)  //in main method calling -> Emirp -> Prime step 2.
		{
			System.out.println("Is a Emirp ");
		}else{
			System.out.println("Is not Emirp");
		}

		
	}
	public static boolean isPrime(int num)  //step 4.
	{
		int count = 0;

		for(int i=2; i<num; i++)  //step 4.1: (31 checked)
		{
			if(num%i==0)  //step 4.2:  (31 false)
			{
				count++;
				break;
			}
		}
		boolean flag = count==0 ? true : false;   //true

		return flag;

	}

	public static boolean isEmirp(int num)
	{
		if(isPrime(num)==false)   //step 3.
			return false;

		int rev=0;
		while(num>0) //31>0(t)
		{
			rev=rev%10;
			int rem=num*10+rev;  //rev=13
			num/=10;
		}

		return isPrime(rev);
		
	}
	
}