import java.util.*;
class Password
{
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int attempt = 1;

	outerloop:

	for( ; ; )
	{
		int storedpin = 123;
		int count = 3;
		do{
			System.out.println("Enter your pin : ");
			int userpin = sc.nextInt();


			if(userpin == storedpin)
			{
				System.out.println("WELCOME");
				//break;
				break outerloop;
			}else{
				System.out.println("Wrong Pin...Attempt Left" + (count-1));
			}
			if(count == 1)
			{
				Thread.sleep(5000);
				System.out.println("You can try to enter your Pin Again !!");
			}
			count--;
		}while(count>=1);

		if(attempt++ ==2)
		{
			break;
		}
	}
	}
}