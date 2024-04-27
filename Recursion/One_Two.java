class One_Two
{
	static int num = 1;
	public static void main(String[] args) {
		
		printNumber();
	}
	public static void printNumber()
	{
		if(num <= 100)
		{
			System.out.println(num+" ");
			num++;
		}else{
			return;
		}
		printNumber();
	}
}