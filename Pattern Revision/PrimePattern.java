class PrimePattern
{
	static int num=2;
	static int count = 0;
	
	public static void main(String[] args) 
	{
		for(int i=1; count!=10; i++)
		{

			for(int k =1; k<=4;k++)
			{
				for(int j=1; j<=k; j++)
				{
					if(prime())
					System.out.print(num+" ");
				}
				System.out.println();
			}
				
				count++;
			}
			num++;

		}

	public static boolean prime()
	{
		boolean flag=true;
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				flag = false;
				break;
			}
		}
		return flag;

	}

}
