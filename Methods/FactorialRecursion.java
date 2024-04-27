import java.util.*;
class FactorialRecursion
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number : ");
	static int num = sc.nextInt();
	static int fact = 1;
	static int num = 5;

	public static void main(String[] args) {
		recursion();
		System.out.println(fact);
	}

public static void recursion()
{
	fact = fact*num;
	num--;

	if(num == 0)
		return;

	recursion();

}
}