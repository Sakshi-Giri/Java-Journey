import java.util.Scanner;

class Factors{

    static int num;
    static int i = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        System.out.println("Factors of " + num + " are:");
        printFactors();
        //scanner.close();
    }

public static void printFactors() {
        if (i > num) {
            return;
        }
        if (num % i == 0) {
            System.out.println(i +" ");
        }
        i++;
        printFactors();
    }
}
