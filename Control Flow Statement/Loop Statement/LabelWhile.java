class LabelWhile
{
	public static void main(String[] args) {

		
		int i = 1;

		ramesh:
		{

		while(i<=5)
		{
			if(i==3)
			{
				break ramesh;
			}
			System.out.println("Hello" +i);
			i++;
		}

	}
	}
}