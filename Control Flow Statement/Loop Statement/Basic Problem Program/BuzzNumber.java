import java.util.*;

class BuzzNumber
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();

		if(num%7 == 0 || num % 10 == 7) 
		{
			System.out.println(num +" Buzzy Number");
		}
		else
		{
			System.out.println(num +" is not a Buzzy Number");
		}

		
	}
}