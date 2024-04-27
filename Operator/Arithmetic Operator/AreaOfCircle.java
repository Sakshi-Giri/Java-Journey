//write a java program to find a area of circle who's radius is 2.5cm


class AreaOfCircle
{
	public static void main(String[] args)
	{
		double raduis = 2.5;
		
		final double pi = 3.14;
		final double pi_2 = 22/7;
		
		double area = pi * (raduis * raduis);
		double area_2 = pi_2 * (raduis * raduis);
		
		double perimeter = 2 * pi * raduis;
		double perimeter_2 = 2 * pi_2 * raduis;
		
		System.out.println("Area of Circle - " +area+ "cm^2" + "Whose raduis is- "+raduis);
		System.out.println("Perimeter of Circle - " + perimeter + "cm");

		System.out.println("-------------------------------------------------------------");

		
		
		System.out.println("Area of Circle - " +area_2+ "cm^2" + "Whose raduis is- "+raduis); 
		System.out.println("Perimeter of Circle - " +perimeter_2 + "cm" );
	}
}