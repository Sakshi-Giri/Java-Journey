import java.util.*;

class SquareRoot
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		boolean flag = false;
		int sqr = 0;

		for(int i=1; i<num/2; i++)
		{
			if(i*i == num)
			{
				flag = true;
				sqr = i;
				break;
			}
		}

		if(flag == true)
		{
			System.out.println(num+" have square root : " +sqr);
		}
		else{
			System.out.println(num+ " Does not have Perfect Square root");
		}
	}
}