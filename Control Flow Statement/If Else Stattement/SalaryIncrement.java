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
