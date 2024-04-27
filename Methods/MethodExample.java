class MethodExample
{
	public static void main(String[] args) {
		System.out.println("Main method starts");

		myMethod(10); //method call with actual data

		System.out.println("Main method ends");


	}
								//formal arguments

	public static void myMethod(int num)   //paramertarized method 
	{
		if(num%2==0)
		{
			System.out.println(num+" is a Even");
		}
		else{
			System.out.println(num+" is a Odd");
		}
	}
}