class Demo3
{
	String str = "Hello from demo3 class";
	public static void main(String[] args) {
		System.out.println("Hello from main");
		Demo4 obj = new Demo4();
		obj.m1();

	}
}
class Demo4
{
	static Demo3 obj = new Demo3();

	void m1()
	{
		System.out.println("Hi from m1()");
		System.out.println(obj.str);
		m2();
	}
	void m2()
	{
		System.out.println("Hi from m2()");
		System.out.println(obj.str);
		m3();
	}
	static void m3()
	{
		System.out.println("Hi from m3()");
		System.out.println(obj.str);
	}
}