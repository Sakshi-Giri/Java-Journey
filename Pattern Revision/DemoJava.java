import java.util.*;

class DemoJava
{
	static int op;
	static{
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		op = add(num1,num2);
		System.out.println(op);
		System.exit(0);

	}

	public static int add(int num1, int num2)
	{
		op = num1+num2;
		return op;
	}
}