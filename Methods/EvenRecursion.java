class EvenRecursion
{
	static int num = 1;

	public static void main(String[] args) {
		
		evenOdd();
	}
	public static void evenOdd()
	{

		if(num %2==0)
		{
			System.out.println(num +" ");
		}
		num++;
		if(num > 100)
			return;
		evenOdd();
	}
}