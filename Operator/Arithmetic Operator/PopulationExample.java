//write a java program to find a area of circle who's radius is 2.5cm


class PopulationExample
{
	public static void main(String[] args)
	{
		long currentPopulation = 312032486;
		long secoundsYear = 365*24*60*60;
		long birthYear = (secoundsYear/7);
		long death = (secoundsYear/13);
		long immigrant = (secoundsYear/45);
		

		long newPopulation = currentPopulation+((birthYear-death+immigrant)*5);
		
		System.out.println("Current Popution : " + currentPopulation + " After 5 Years Population is - " + newPopulation);

		
	}
}