import java.util.*;

class EmployeeManagementSystem
{
	static String ename;
	static int eid;
	static String erole;
	static double esal;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		for( ; ; )
		{
			System.out.println("**** WELCOM ****");
			System.out.println();
			System.out.println("FEATURES");
			System.out.println();
			System.out.println("1. Add Employee Data ");
			System.out.println("2. View Employee Data ");
			System.out.println("3. Edit Employee Data");
			System.out.println("4. EXIT");

			System.out.println();
			System.out.println("Enter Option Number : ");
			int opt = sc.nextInt();

			switch(opt)
			{
				case 1:{
					addNewEmployee();
					break;
				}
				case 2:{
					viewEmployee(1);
					break;
				}
				case 3:{
					for( ; ; )
					{

						System.out.println("Edit Employee Data ");
						System.out.println();
						System.out.println("1. Edit Name ");
						System.out.println("2. Edit Role");
						System.out.println("3. Edit Salary");
						System.out.println("4. EXIT");
						System.out.println();
						System.out.println("Enter Option of Your Choice : ");
						int opt1 = sc.nextInt();	

					switch(opt1)
					{
						case 1:{
							upadateName();
							System.out.println("Successfully Name Updated !!!");
							break ;
						}
						case 2:{
							upadateRole();
							System.out.println("Successfully Role Updated !!!");
							break;
						}
						case 3:{
							upadateSalary();
							System.out.println("Successfully Salary Updated !!!");
							break;
						}
					case 4:{
							System.exit(0);
						}
					default: System.out.println("Invalid Option !!!!");
					}

					}
				}
				case 4:{
					System.exit(0);
				}
			default : System.out.println("Invalid Option !!!");
			}


		}


	}

	public static void addNewEmployee()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("*****Enter New Employee Data *****");
		System.out.println();
		System.out.println("Enter Name : ");
		ename =sc.nextLine();
		System.out.println("Enter Id : ");
		eid = sc.nextInt();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Role : ");
		erole = s.nextLine();
		System.out.println("Enter Salary : ");
		esal = s.nextDouble();
	}

	public static void viewEmployee(int eid1)
	{
		if(eid == eid1)
		{
			System.out.println("Employee Data");
			System.out.println();
			System.out.println("Name : "+ ename);
			System.out.println("Id : "+eid);
			System.out.println("Role : "+erole);
			System.out.println("Salary "+esal);

		}else{
			System.out.println("Wrong Id !!!!");
		}

	}
	public static void upadateName()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();

		ename = name;
	}
	public static void upadateRole()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Role : ");
		String role = sc.nextLine();

		erole = role;
	}
	public static void upadateSalary()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Revised Salary : ");
		double salary = sc.nextDouble();

		esal = salary;
	}

}
