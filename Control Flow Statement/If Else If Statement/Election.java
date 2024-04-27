<<<<<<< HEAD
import java.util.Scanner;

class Election
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);1
		System.out.println("Enter yor age");
		int age = sc.nextInt();

		if(age > 18)
		{
			System.out.println("Do you have Voter Id (yes/no) ");
			String voterId = sc.next().toLowerCase();

			if(voterId.equals("yes"))
			{
				System.out.println("******* WELCOME *******");
				System.out.println("Below are the Party names : ");
				System.out.println("1. BJP ");
				System.out.println("2. CONGRESS ");
				System.out.println("3. AAP ");
				System.out.println("4. MNS ");
				System.out.println("5. SHIVSENA ");
				System.out.println("6. NCP ");
				System.out.println("7. NOTA ");

				System.out.println("Enter the party name whome you want to vote. ");
				String vote = sc.next().toUpperCase();

				if(vote.equals("BJP"))
				{
					System.out.println(" You have voted to BJP ");
				}
				else if(vote.equals("CONGRESS"))
				{
					System.out.println(" You have voted to CONGRESS ");
				}
				else if(vote.equals("AAP"))
				{
					System.out.println(" You have voted to AAP ");
				}
				else if(vote.equals("MNS"))
				{
					System.out.println(" You have voted to MNS ");
				}
				else if(vote.equals("SHIVSENA"))
				{
					System.out.println(" You have voted to SHIVSENA ");
				}
				else if(vote.equals("NCP"))
				{
					System.out.println(" You have voted to NCP ");
				}
				else if(vote.equals("NOTA"))
				{
					System.out.println(" Thank you for wasting your time");
				}
			}else
			{
				System.out.println(" Jaldi jaha se Hato");
			}

		}else{
			System.out.println(" You are not mature to vote. Try after "+(18-age)+ " years");
		}
	}
}
=======
//WAP to check to vote in election.
//user must be 18+ and user must have voter id. List the Party participated in Election and ask uer to vote their fav party.

import java.util.Scanner;

class Election
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter yor age");
		int age = sc.nextInt();

		if(age > 18)
		{
			System.out.println("Do you have Voter Id (yes/no) ");
			String voterId = sc.next().toLowerCase();

			if(voterId.equals("yes"))
			{
				System.out.println("******* WELCOME *******");
				System.out.println("Below are the Party names : ");
				System.out.println("1. BJP ");
				System.out.println("2. CONGRESS ");
				System.out.println("3. AAP ");
				System.out.println("4. MNS ");
				System.out.println("5. SHIVSENA ");
				System.out.println("6. NCP ");
				System.out.println("7. NOTA ");

				System.out.println("Enter the party name whome you want to vote. ");
				String vote = sc.next().toUpperCase();

				if(vote.equals("BJP"))
				{
					System.out.println(" You have voted to BJP ");
				}
				else if(vote.equals("CONGRESS"))
				{
					System.out.println(" You have voted to CONGRESS ");
				}
				else if(vote.equals("AAP"))
				{
					System.out.println(" You have voted to AAP ");
				}
				else if(vote.equals("MNS"))
				{
					System.out.println(" You have voted to MNS ");
				}
				else if(vote.equals("SHIVSENA"))
				{
					System.out.println(" You have voted to SHIVSENA ");
				}
				else if(vote.equals("NCP"))
				{
					System.out.println(" You have voted to NCP ");
				}
				else if(vote.equals("NOTA"))
				{
					System.out.println(" Thank you for wasting your time");
				}
			}else
			{
				System.out.println(" Jaldi jaha se Hato");
			}

		}else{
			System.out.println(" You are not mature to vote. Try after "+(18-age)+ " years");
		}
	}
}
>>>>>>> 8f37139f6698a3a0831086bc62fa0c8903cf2f96
