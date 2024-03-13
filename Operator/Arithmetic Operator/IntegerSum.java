 import java.util.Scanner;

public class IntegerSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number between 0 and 1000: ");
        int num = scanner.nextInt();
        
        if (num < 0 || num > 1000) {

            System.out.println("Invalid input. Please enter a number valid number between 0 and 1000.");

        } else {
         
            int sum = 0;
            int temp = num;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            
            System.out.println("The sum of the digits = " + sum);
        }
        
    }
}
