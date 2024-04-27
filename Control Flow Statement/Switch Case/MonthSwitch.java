<<<<<<< HEAD
import java.util.Scanner;

class MonthSwitch
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int monthNum = sc.nextInt();
		String month = null;

		switch(monthNum)
		{
			case 1 : month = "JANUARY";break;
			case 2 : month = "FEBUARY";break;
			case 3 : month = "MARCH";break;
			case 4 : month = "APRIL";break;
			case 5 : month = "MAY";break;
			case 6 : month = "JUNE";break;
			case 7 : month = "JULY";break;
			case 8 : month = "AUG";break;
			case 9 : month = "SEPTEMBER";break;
			case 10 : month = "OCTOMBER";break;
			case 11 : month = "NOVEMBER";break;
			case 12 : month = "DECEMBER";break;
			default : System.out.println("Invalid Input");

		}

		//System.out.println((mont != null)? (monthNum+" - "+month):"");  another way without using if block.

		if(month != null)
		{
			System.out.println(monthNum + " - " + month);
		}
	}
=======
import java.util.Scanner;

class MonthSwitch
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int monthNum = sc.nextInt();
		String month = null;

		switch(monthNum)
		{
			case 1 : month = "JANUARY";break;
			case 2 : month = "FEBUARY";break;
			case 3 : month = "MARCH";break;
			case 4 : month = "APRIL";break;
			case 5 : month = "MAY";break;
			case 6 : month = "JUNE";break;
			case 7 : month = "JULY";break;
			case 8 : month = "AUG";break;
			case 9 : month = "SEPTEMBER";break;
			case 10 : month = "OCTOMBER";break;
			case 11 : month = "NOVEMBER";break;
			case 12 : month = "DECEMBER";break;
			default : System.out.println("Invalid Input");

		}

		//System.out.println((mont != null)? (monthNum+" - "+month):"");  another way without using if block.

		if(month != null)
		{
			System.out.println(monthNum + " - " + month);
		}
	}
>>>>>>> 8f37139f6698a3a0831086bc62fa0c8903cf2f96
}