class MethodCallingExample
{
	public static void main(String[] args) {
		System.out.println("Main Starts");
		manali();
		niti();
		sakshi();
		System.out.println("Main Ends");
	}
	public static void manali()
	{
		System.out.println("Manali Comes");
		System.out.println("Manali Go");
	}
	public static void niti()
	{
		System.out.println("Niti Comes");
		sakshi();
		System.out.println("Niti Go");
	}
	public static void sakshi()
	{
		System.out.println("Sakshi Comes");
		System.out.println("Sakshi Go");
	}
}