class EvenOdd
{
	public static void main(String[] args) {

		//even(10);
		for(int i=1; i<=20; i++)
		{
			even(i);
		}
		
	}
	public static void even(int num)
	{
		if(num%2==0)
		{
			System.out.println(num+ " - Even");
		}else{
			System.out.println(num+" - Odd");
		}
	}
}