<<<<<<< HEAD
import java.util.Scanner;

class SalaryIncrement
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Monthly Target Score : ");
		float score = sc.nextFloat();
		System.out.println("Enter the Salary : ");
		double salary = sc.nextDouble();

		if(score>90)
		{
			salary += salary * 0.03 ;
			System.out.println("After Increment Salary is : " +salary);
		}
		else
		{
			salary += salary * 0.01;
			System.out.println("After Increment Salary is : " +salary); //3 = y/50000 *100
		}
	}
}
=======
//WAP that increases the pay of employee by 3% if his monthly target score is greater than 90, otherwise increases pay by 1%.

import java.util.Scanner;

class SalaryIncrement
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Monthly Target Score : ");
		float score = sc.nextFloat();
		System.out.println("Enter the Salary : ");
		double salary = sc.nextDouble();

		if(score>90)
		{
			salary += salary * 0.03 ;
			System.out.println("After Increment Salary is : " +salary);
		}
		else
		{
			salary += salary * 0.01;
			System.out.println("After Increment Salary is : " +salary); //3 = y/50000 *100
		}
	}
}
>>>>>>> 8f37139f6698a3a0831086bc62fa0c8903cf2f96
