class EvenNumbers
{
	static int num = 1;
	public static void main(String[] args) {
		
		evenNumber();
	}
	public static void evenNumber()
	{
		if(num>100)
		{
			return;
		}
		if(num%2==0)
		{
			System.out.println(num+ " ");
		}
		num++;
		evenNumber();
	}
}