import java.util.Scanner;

class BloodDonation
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age :");
		int age = sc.nextInt();

		if(age>20)
		{
			System.out.print("Did you consume Alcohol or Cigrette in 24 hours before Donating Blood (Yeas / NO): ");
			String consume = sc.next().toLowerCase();

			if(consume.equals("no"))
			{
				System.out.println("Enter your Weight : ");
				float weight = sc.nextFloat();

				if(weight > 50)
				{
					System.out.println("******** Congratylation!!! You are Fit to Donate Blood ********");
				}
				else
				{
					System.out.println("SORRY...You are Not Fit to Donate Blood. Try to eat more food, gain "+ (50 - weight ) +"weight and come again" );
				}
			}else{
				System.out.println("SORRY...You are Not Fit to Donate Blood. Don not consume alcohol and cigrette otherwise you will need blood and heart. GOOD LUCK!!");
			}

		}else{
			System.out.println("SORRY...You are Not Fit to Donate Blood. Please try after "+ (18 - age)+ " years.");
		}
	}
}