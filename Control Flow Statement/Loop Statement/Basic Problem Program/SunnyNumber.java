import java.util.*;

class SunnyNumber
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int nNum = num+1;
		boolean flag = false;
		int sqr = 0;

		for(int i=1; i<nNum/2; i++)
		{
			if(i*i == nNum)
			{
				flag = true;
				sqr = i;
				break;
			}
		}

		if(flag == true)
		{
			System.out.println(nNum+" have square root : " +sqr);
		}
		else{
			System.out.println(nNum+ " Does not have Perfect Square root");
		}
	}
}