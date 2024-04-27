import java.util.Scanner;

class SubTotalBill
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you Subtotal in Rupees : ");
		Double subtotal = sc.nextDouble();
		System.out.print("Enter you Tip Rate  : "); //10 bill rate = 15
		Double per = sc.nextDouble();
				
		Double tip = (per / 100) *subtotal;
		Double total = subtotal + tip;
		
		System.out.println("Tip Rate is : "+tip);
		System.out.println("Total bill is:" + total);
		System.out.println("We hope u liked our service......Thank you & visit again!!!!!!!");


	}
}